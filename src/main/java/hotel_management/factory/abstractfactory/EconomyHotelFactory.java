package hotel_management.factory.abstractfactory;

import hotel_management.product.room.Room;
import hotel_management.product.room.EconomyRoom;

import hotel_management.product.booking.BookingService;
import hotel_management.product.booking.EconomyBookingService;

import hotel_management.product.service.GuestService;
import hotel_management.product.service.EconomyGuestService;

public class EconomyHotelFactory implements HotelFactory {

    @Override
    public Room createRoom() {
        return new EconomyRoom();
    }

    @Override
    public BookingService createBookingService() {
        return new EconomyBookingService();
    }

    @Override
    public GuestService createGuestService() {
        return new EconomyGuestService();
    }
}