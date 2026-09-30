package hotel_management.product.service;

public class EconomyGuestService implements GuestService {
    @Override
    public void provideService() {
        System.out.println("Providing basic guest service");
    }
    @Override
    public String getServiceLevel() {
        return "Basic";
    }
}
