public class MercedesCar implements Car{
    @Override
    public void hasSeats() {
        System.out.println("I'm a Mercedes Car and i have 5 seats");
    }

    @Override
    public void equipmentPacket() {
        System.out.println("Offers luxury equipment");
    }
}
