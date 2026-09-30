package hotel_management.config;

import hotel_management.factory.abstractfactory.BusinessHotelFactory;
import hotel_management.factory.abstractfactory.EconomyHotelFactory;
import hotel_management.factory.abstractfactory.HotelFactory;
import hotel_management.factory.abstractfactory.LuxuryHotelFactory;

public class HotelFactoryProvider {

    public static HotelFactory getFactory(String type) {

        return switch (type.toLowerCase()) {
            case "economy" ->
                    new EconomyHotelFactory();

            case "business" ->
                    new BusinessHotelFactory();

            case "luxury" ->
                    new LuxuryHotelFactory();

            default ->
                    throw new IllegalArgumentException(
                            "Unknown hotel type: " + type
                    );
        };
    }
}