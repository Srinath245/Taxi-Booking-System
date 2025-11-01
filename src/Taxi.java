import java.util.ArrayList;
import java.util.List;

public class Taxi {

    int id;
    char currentLocations;
    int freeTime;
    int totalEarning;
    List<String> tripDetails;

    public Taxi(int id) {
        this.id = id;
        this.currentLocations = 'A';
        this.freeTime = 6;
        this.totalEarning = 0;
        this.tripDetails = new ArrayList<>();
    }

    boolean isFree(char pickup, int pickupTime) {
        int travelTime = Math.abs(pickup - currentLocations);
        return freeTime + travelTime < pickupTime;
    }

    void addBooking(int customerId, char pickup, char drop, int pickupTime, int earning) {

        String trip = "CustomerID: " + customerId + " Pickup: " + pickup +
                " Drop: " + drop + " PickupTime: " + pickupTime +
                " Earning: " + earning;
        tripDetails.add(trip);
    }

    void printDetails() {
        System.out.println("Taxi-" + id + " TotalEarnings: " + totalEarning);
        for (String trip : tripDetails)
            System.out.println(" " + trip);

    }
}
