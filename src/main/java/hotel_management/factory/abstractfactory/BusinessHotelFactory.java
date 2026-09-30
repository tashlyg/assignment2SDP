package hotel_management.factory.abstractfactory;

import hotel_management.product.room.Room;
import hotel_management.product.room.BusinessRoom;

import hotel_management.product.booking.BookingService;
import hotel_management.product.booking.BusinessBookingService;

import hotel_management.product.service.GuestService;
import hotel_management.product.service.BusinessGuestService;

public class BusinessHotelFactory implements HotelFactory {

    @Override
    public Room createRoom() {
        return new BusinessRoom();
    }

    @Override
    public BookingService createBookingService() {
        return new BusinessBookingService();
    }

    @Override
    public GuestService createGuestService() {
        return new BusinessGuestService();
    }
}