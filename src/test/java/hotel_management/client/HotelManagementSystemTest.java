package hotel_management.client;

import hotel_management.factory.abstractfactory.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelManagementSystemTest {

    @Test
    void economyBookingCalculatesCorrectPrice() {
        HotelManagementSystem system =
                new HotelManagementSystem(
                        new EconomyHotelFactory()
                );

        double price = system.bookStay(3);

        assertEquals(150.0, price);
    }

    @Test
    void luxuryBookingCalculatesCorrectPrice() {
        HotelManagementSystem system =
                new HotelManagementSystem(
                        new LuxuryHotelFactory()
                );

        double price = system.bookStay(3);

        assertEquals(600.0, price);
    }

    @Test
    void rejectsZeroNights() {
        HotelManagementSystem system =
                new HotelManagementSystem(
                        new EconomyHotelFactory()
                );

        assertThrows(
                IllegalArgumentException.class,
                () -> system.bookStay(0)
        );
    }

    @Test
    void rejectsNegativeNights() {
        HotelManagementSystem system =
                new HotelManagementSystem(
                        new EconomyHotelFactory()
                );

        assertThrows(
                IllegalArgumentException.class,
                () -> system.bookStay(-5)
        );
    }
}