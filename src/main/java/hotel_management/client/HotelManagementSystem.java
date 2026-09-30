package hotel_management.client;

import hotel_management.factory.abstractfactory.HotelFactory;
import hotel_management.product.booking.BookingService;
import hotel_management.product.room.Room;
import hotel_management.product.service.GuestService;

public class HotelManagementSystem {

    private final Room room;
    private final BookingService bookingService;
    private final GuestService guestService;

    public HotelManagementSystem(HotelFactory factory) {
        this.room = factory.createRoom();
        this.bookingService = factory.createBookingService();
        this.guestService = factory.createGuestService();
    }

    public double bookStay(int nights) {
        room.prepareRoom();

        double price =
                bookingService.calculatePrice(room, nights);

        bookingService.book(room, nights);

        return price;
    }

    public void prepareGuestArrival() {
        room.prepareRoom();
        guestService.provideService();
    }

    public void handleGuestStay(int nights) {
        double totalPrice = bookStay(nights);

        guestService.provideService();

        System.out.println(
                "Service level: "
                        + guestService.getServiceLevel()
        );

        System.out.println(
                "Total price: " + totalPrice
        );
    }
}