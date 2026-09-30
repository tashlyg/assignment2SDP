package hotel_management.product.service;

public class BusinessGuestService implements GuestService {

    @Override
    public void provideService() {
        System.out.println("Providing business guest service");
    }

    @Override
    public String getServiceLevel() {
        return "Business";
    }
}