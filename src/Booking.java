public class Booking {

    int customerId;
    char pickupPoint;
    char dropPoint;
    int pickupTime;

    Booking(int customerId, char pickupPoint, char dropPoint, int pickupTime) {
        this.customerId = customerId;
        this.pickupPoint = pickupPoint;
        this.dropPoint = dropPoint;
        this.pickupTime = pickupTime;
    }
}
