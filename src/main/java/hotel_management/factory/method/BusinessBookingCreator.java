package hotel_management.factory.method;

import hotel_management.product.booking.BookingService;
import hotel_management.product.booking.BusinessBookingService;

public class BusinessBookingCreator extends BookingCreator {

    @Override
    protected BookingService createBookingService() {
        return new BusinessBookingService();
    }
}