
public class Hotel {

    private String name;
    private int rating;
    private int weekdayRate;
    private int weekendRate;

    public Hotel(String name, int rating, int weekdayRate, int weekendRate) {
        this.name = name;
        this.rating = rating;
        this.weekdayRate = weekdayRate;
        this.weekendRate = weekendRate;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int calculateRegularCost(long weekdays, long weekends) {
        return (int) (weekdays * weekdayRate + weekends * weekendRate);
    }
}
