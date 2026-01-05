

public class HotelAPP {
    public static void main(String[] args) throws HotelReservationException {

        HotelReservationSystem system = new HotelReservationSystem();

        system.addHotel(new Hotel("Lakewood", 3, 110, 90));
        system.addHotel(new Hotel("Bridgewood", 4, 150, 50));
        system.addHotel(new Hotel("Ridgewood", 5, 220, 150));

        // Input: 11Sep2020, 12Sep2020
        system.findCheapestBestRatedHotelForRegularCustomer(
                "11Sep2020", "12Sep2020");
    }
}
