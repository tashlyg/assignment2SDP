package hotel_management.product.room;


public class EconomyRoom implements Room {
    @Override
    public String getDescription() {
        return "Economy room";
    }
    @Override
    public double getPricePerNight() {
        return 50.0;
    }
    @Override
    public void prepareRoom() {
        System.out.println("Preparing economy room");
    }
}
