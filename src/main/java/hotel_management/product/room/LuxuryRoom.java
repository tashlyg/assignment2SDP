package hotel_management.product.room;

public class LuxuryRoom implements Room {

    @Override
    public String getDescription() {
        return "Luxury room";
    }
    @Override
    public double getPricePerNight() {
        return 200.0;
    }
    @Override
    public void prepareRoom() {
        System.out.println("Preparing luxury room with premium amenities");
    }
}