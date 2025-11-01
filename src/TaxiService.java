import java.util.*;

public class TaxiService {

    List<Taxi> taxiList;

    public TaxiService(int totalTaxi) {
        taxiList = new ArrayList<>();
        for (int i = 0; i < totalTaxi; i++) {
            taxiList.add(new Taxi(i));
        }
    }

    public void bookTaxi(Booking booking) {
        Taxi bestTaxi = null;
        int minDistance = Integer.MAX_VALUE;

        //Find the which taxi available
        for (Taxi taxi : taxiList) {
            int distanceToPick = Math.abs(taxi.currentLocations - booking.pickupPoint);
            if (taxi.freeTime <= booking.pickupTime && distanceToPick < minDistance) {
                minDistance = distanceToPick;
                bestTaxi = taxi;
            }
        }

        if (bestTaxi == null) {
            System.out.println("No taxi available for this booking.");
            return;
        }

        // Calculate trip distance and earnings
        int tripDistance = Math.abs(booking.dropPoint - booking.pickupPoint) * 15;
        int tripEarning = 100 + (tripDistance - 15) * 10;
        bestTaxi.totalEarning += tripEarning;

        //Taxi update
        bestTaxi.freeTime = booking.pickupTime + (tripDistance / 15);
        bestTaxi.currentLocations = booking.dropPoint;

        // Taxi details
        bestTaxi.addBooking(booking.customerId, booking.pickupPoint, booking.dropPoint, booking.pickupTime, tripEarning);
        System.out.println("Booking confirmed for Customer " + booking.customerId + " -> Taxi " + bestTaxi.id);

    }

    void printAllTaxiDetails() {
        for (Taxi taxi : taxiList) {
            taxi.printDetails();
        }
    }
}
