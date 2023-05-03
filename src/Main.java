public class Main {
    static public void main(String[] args) {
        //create ne factory
        Application app=new Application(new SkodaFactory());
        app.createCar();
        app.car.equipmentPacket();
        app.car.hasSeats();
    }

}
class Application
{
    VehicleFactory factory;
    Car car;
    public Application(VehicleFactory factory) {
        this.factory=factory;
    }
    public void createCar()
    {
        car= factory.createCar();
    }
}