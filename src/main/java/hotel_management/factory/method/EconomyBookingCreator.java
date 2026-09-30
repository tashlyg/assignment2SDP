package hotel_management.factory.method;

import hotel_management.product.booking.BookingService;
import hotel_management.product.booking.EconomyBookingService;

public class EconomyBookingCreator extends BookingCreator {

    @Override
    protected BookingService createBookingService() {
        return new EconomyBookingService();
    }
}
