public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public void printTruck()
  {
    System.out.println("License plate: " + getLicense());
    System.out.println("Toll fee: " + getTollFee());
    System.out.println("Passengers: " + getPassengers());
    System.out.println("Number of axles: " + axles);
    System.out.println("Has trailer? " + hasTrailer);
  }

  public boolean validateLicensePlate()
  {
    if (hasTrailer)
    {
      String licensePlate = getLicense();
      String lastTwoChar = licensePlate.substring(licensePlate.length() - 2);
      boolean isValid = (lastTwoChar.equals("MX") && axles > 4) || (lastTwoChar.equals("LX") && axles <= 4);
      return isValid;
    }
    else
    {
      return true;
    }
  }
}