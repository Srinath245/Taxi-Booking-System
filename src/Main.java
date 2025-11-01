import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the Taxi count needed : ");
        int taxiCount = sc.nextInt();
        TaxiService service = new TaxiService(taxiCount);
        System.out.println(taxiCount + " taxi are created ");

        boolean stopTaxi = true;
        int customerId = 1;
        while (stopTaxi) {
            System.out.println("\n1 -> Book Taxi  2 -> Show Details  3 -> Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter Pickup, Drop, PickupTime (Example: A D 9):");
                char pickup = sc.next().charAt(0);
                char drop = sc.next().charAt(0);
                int time = sc.nextInt();

                Booking booking = new Booking(customerId++, pickup, drop, time);
                service.bookTaxi(booking);
            } else if (choice == 2) {
                service.printAllTaxiDetails();
            } else if (choice == 3) {
                stopTaxi = false;
            } else {
                System.out.println(" Invalid input! Please enter a number (1, 2, or 3) ");
            }
        }
    }
}
