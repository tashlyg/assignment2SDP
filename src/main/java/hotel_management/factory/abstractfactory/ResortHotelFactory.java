package hotel_management.factory.abstractfactory;

import hotel_management.product.booking.BookingService;
import hotel_management.product.booking.ResortBookingService;

import hotel_management.product.room.Room;
import hotel_management.product.room.ResortRoom;

import hotel_management.product.service.GuestService;
import hotel_management.product.service.ResortGuestService;

public class ResortHotelFactory implements HotelFactory {

    @Override
    public Room createRoom() {
        return new ResortRoom();
    }

    @Override
    public BookingService createBookingService() {
        return new ResortBookingService();
    }

    @Override
    public GuestService createGuestService() {
        return new ResortGuestService();
    }
}