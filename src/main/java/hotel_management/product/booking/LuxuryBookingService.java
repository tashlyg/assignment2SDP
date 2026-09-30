package hotel_management.product.booking;

import hotel_management.product.room.Room;

public class LuxuryBookingService implements BookingService {

    @Override
    public void book(Room room, int nights) {
        System.out.println("Luxury booking created for " + nights + " nights");
    }

    @Override
    public double calculatePrice(Room room, int nights) {
        return room.getPricePerNight() * nights;
    }
}