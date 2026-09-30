package hotel_management.product.service;

public class LuxuryGuestService implements GuestService {

    @Override
    public void provideService() {
        System.out.println("Providing premium guest service");
    }

    @Override
    public String getServiceLevel() {
        return "Premium";
    }
}