public class SkodaTruck implements Truck{
    @Override
    public void allowedPayload() {
        System.out.println("Up to 3.5 tons");
    }

    @Override
    public void requiredDrivingLicense() {
        System.out.println("B2");

    }
}
