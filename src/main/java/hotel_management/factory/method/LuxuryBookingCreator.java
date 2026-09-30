package hotel_management.factory.method;

import hotel_management.product.booking.BookingService;
import hotel_management.product.booking.LuxuryBookingService;

public class LuxuryBookingCreator extends BookingCreator {

    @Override
    protected BookingService createBookingService() {
        return new LuxuryBookingService();
    }
}
