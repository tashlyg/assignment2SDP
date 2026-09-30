package hotel_management.product.service;

public class ResortGuestService implements GuestService {

    @Override
    public void provideService() {
        System.out.println(
                "Providing resort guest service with recreation access"
        );
    }

    @Override
    public String getServiceLevel() {
        return "Resort";
    }
}