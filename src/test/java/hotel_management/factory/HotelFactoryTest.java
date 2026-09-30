package hotel_management.factory;

import hotel_management.factory.abstractfactory.*;
import hotel_management.product.room.*;
import hotel_management.product.booking.*;
import hotel_management.product.service.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelFactoryTest {

    @Test
    void economyFactoryCreatesEconomyRoom() {
        HotelFactory factory = new EconomyHotelFactory();

        assertInstanceOf(
                EconomyRoom.class,
                factory.createRoom()
        );
    }

    @Test
    void economyFactoryCreatesEconomyBookingService() {
        HotelFactory factory = new EconomyHotelFactory();

        assertInstanceOf(
                EconomyBookingService.class,
                factory.createBookingService()
        );
    }

    @Test
    void economyFactoryCreatesEconomyGuestService() {
        HotelFactory factory = new EconomyHotelFactory();

        assertInstanceOf(
                EconomyGuestService.class,
                factory.createGuestService()
        );
    }

    @Test
    void businessFactoryCreatesBusinessRoom() {
        HotelFactory factory = new BusinessHotelFactory();

        assertInstanceOf(
                BusinessRoom.class,
                factory.createRoom()
        );
    }

    @Test
    void businessFactoryCreatesBusinessBookingService() {
        HotelFactory factory = new BusinessHotelFactory();

        assertInstanceOf(
                BusinessBookingService.class,
                factory.createBookingService()
        );
    }

    @Test
    void businessFactoryCreatesBusinessGuestService() {
        HotelFactory factory = new BusinessHotelFactory();

        assertInstanceOf(
                BusinessGuestService.class,
                factory.createGuestService()
        );
    }

    @Test
    void luxuryFactoryCreatesLuxuryRoom() {
        HotelFactory factory = new LuxuryHotelFactory();

        assertInstanceOf(
                LuxuryRoom.class,
                factory.createRoom()
        );
    }

    @Test
    void luxuryFactoryCreatesLuxuryBookingService() {
        HotelFactory factory = new LuxuryHotelFactory();

        assertInstanceOf(
                LuxuryBookingService.class,
                factory.createBookingService()
        );
    }

    @Test
    void luxuryFactoryCreatesLuxuryGuestService() {
        HotelFactory factory = new LuxuryHotelFactory();

        assertInstanceOf(
                LuxuryGuestService.class,
                factory.createGuestService()
        );
    }
}