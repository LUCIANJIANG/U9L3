public class Taxi extends Car{
    private double fare;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fare)
    {
        super(licensePlate, tollFee, passengers, isElectric);
        this.fare = fare;
    }

    public void printTaxi()
    {
        System.out.println("License plate: " + getLicense());
        System.out.println("Toll fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Electric? " + isElectric());
        System.out.println("Discount applied? " + isDiscountApplied());
        System.out.println("Total fare collected: " + fare);
    }
}
