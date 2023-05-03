public class MercedesTruck implements Truck{
    @Override
    public void allowedPayload() {
        System.out.println("Up to 40 tons");
    }

    @Override
    public void requiredDrivingLicense() {
        System.out.println("C+E");
    }
}
