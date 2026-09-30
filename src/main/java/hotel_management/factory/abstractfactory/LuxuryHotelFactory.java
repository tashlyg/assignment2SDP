package hotel_management.factory.abstractfactory;

import hotel_management.product.room.Room;
import hotel_management.product.room.LuxuryRoom;

import hotel_management.product.booking.BookingService;
import hotel_management.product.booking.LuxuryBookingService;

import hotel_management.product.service.GuestService;
import hotel_management.product.service.LuxuryGuestService;

public class LuxuryHotelFactory implements HotelFactory {

    @Override
    public Room createRoom() {
        return new LuxuryRoom();
    }

    @Override
    public BookingService createBookingService() {
        return new LuxuryBookingService();
    }

    @Override
    public GuestService createGuestService() {
        return new LuxuryGuestService();
    }
}