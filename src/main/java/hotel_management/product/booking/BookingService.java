package hotel_management.product.booking;

import hotel_management.product.room.Room;

public interface BookingService {
    void book(Room room, int nights);
    double calculatePrice(Room room, int nights);
}