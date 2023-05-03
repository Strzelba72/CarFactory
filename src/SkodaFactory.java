public class SkodaFactory implements VehicleFactory{
    @Override
    public Car createCar() {
        return new SkodaCar();
    }

    @Override
    public Truck createTruck() {
        return new SkodaTruck();
    }
}
