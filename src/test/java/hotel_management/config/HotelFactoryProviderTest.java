package hotel_management.config;

import hotel_management.factory.abstractfactory.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelFactoryProviderTest {

    @Test
    void selectsEconomyFactory() {
        HotelFactory factory =
                HotelFactoryProvider.getFactory("economy");

        assertInstanceOf(EconomyHotelFactory.class, factory);
    }

    @Test
    void selectsBusinessFactory() {
        HotelFactory factory =
                HotelFactoryProvider.getFactory("business");

        assertInstanceOf(BusinessHotelFactory.class, factory);
    }

    @Test
    void selectsLuxuryFactory() {
        HotelFactory factory =
                HotelFactoryProvider.getFactory("luxury");

        assertInstanceOf(LuxuryHotelFactory.class, factory);
    }

    @Test
    void rejectsUnknownHotelType() {
        assertThrows(
                IllegalArgumentException.class,
                () -> HotelFactoryProvider.getFactory("wrong")
        );
    }
}