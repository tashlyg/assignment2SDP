package hotel_management.factory.abstractfactory;

import hotel_management.product.room.Room;
import hotel_management.product.booking.BookingService;
import hotel_management.product.service.GuestService;

public interface HotelFactory {

    Room createRoom();

    BookingService createBookingService();

    GuestService createGuestService();
}
