package hotel_management.product.room;

public class ResortRoom implements Room {

    @Override
    public String getDescription() {
        return "Resort room";
    }

    @Override
    public double getPricePerNight() {
        return 300.0;
    }

    @Override
    public void prepareRoom() {
        System.out.println(
                "Preparing resort room with pool and beach access"
        );
    }
}
