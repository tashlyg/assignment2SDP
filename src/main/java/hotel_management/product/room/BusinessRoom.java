package hotel_management.product.room;

public class BusinessRoom implements Room {
    @Override
    public String getDescription() {
        return "Business room";
    }
    @Override
    public double getPricePerNight() {
        return 100.0;
    }
    @Override
    public void prepareRoom() {
        System.out.println("Preparing business room with workspace");
    }
}
