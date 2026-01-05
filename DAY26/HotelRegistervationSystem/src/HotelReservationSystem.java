

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;

public class HotelReservationSystem {

    private List<Hotel> hotels = new ArrayList<>();

    private static final Pattern DATE_PATTERN =
            Pattern.compile("\\d{2}[A-Za-z]{3}\\d{4}");

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public Hotel findCheapestBestRatedHotelForRegularCustomer(
            String startDateStr, String endDateStr) throws HotelReservationException {

        // -------- REGEX VALIDATION --------
        if (!DATE_PATTERN.matcher(startDateStr).matches() ||
                !DATE_PATTERN.matcher(endDateStr).matches()) {

            throw new HotelReservationException(
                    "Invalid Date Format",
                    HotelReservationException.ExceptionType.INVALID_DATE);
        }


        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("ddMMMyyyy", Locale.ENGLISH);

        LocalDate startDate = LocalDate.parse(startDateStr, formatter);
        LocalDate endDate = LocalDate.parse(endDateStr, formatter);

        if (startDate.isAfter(endDate)) {
            throw new HotelReservationException(
                    "Start Date after End Date",
                    HotelReservationException.ExceptionType.INVALID_DATE);
        }

        // -------- COUNT WEEKDAYS & WEEKENDS USING STREAMS --------
        long totalDays = startDate.datesUntil(endDate.plusDays(1)).count();

        long weekends = startDate.datesUntil(endDate.plusDays(1))
                .filter(d -> d.getDayOfWeek() == DayOfWeek.SATURDAY ||
                        d.getDayOfWeek() == DayOfWeek.SUNDAY)
                .count();

        long weekdays = totalDays - weekends;

        // -------- STREAM: CHEAPEST + BEST RATED --------
        Map<Hotel, Integer> costMap = new HashMap<>();
        hotels.forEach(h ->
                costMap.put(h, h.calculateRegularCost(weekdays, weekends)));

        int minCost = costMap.values().stream().min(Integer::compare).get();

        Hotel result = costMap.entrySet().stream()
                .filter(e -> e.getValue() == minCost)
                .map(Map.Entry::getKey)
                .max(Comparator.comparingInt(Hotel::getRating))
                .orElseThrow();

        System.out.println(
                result.getName() +
                        ", Rating: " + result.getRating() +
                        " and Total Rates: $" + minCost
        );

        return result;
    }
}
