package hotel_management.factory.method;

import hotel_management.product.booking.BookingService;
import hotel_management.product.room.Room;

public abstract class BookingCreator {

    protected abstract BookingService createBookingService();

    public double processBooking(Room room, int nights) {
        BookingService bookingService = createBookingService();

        double price = bookingService.calculatePrice(room, nights);

        bookingService.book(room, nights);

        return price;
    }
}