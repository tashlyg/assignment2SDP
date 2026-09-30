package hotel_management.app;

import hotel_management.client.HotelManagementSystem;
import hotel_management.config.HotelFactoryProvider;
import hotel_management.factory.abstractfactory.HotelFactory;

public class Main {

    public static void main(String[] args) {

        String hotelType = "luxury";

        HotelFactory factory =
                HotelFactoryProvider.getFactory(hotelType);

        HotelManagementSystem system =
                new HotelManagementSystem(factory);

        system.handleGuestStay(3);
    }
}
