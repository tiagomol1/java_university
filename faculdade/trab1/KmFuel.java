public class KmFuel {
  
  private Double km, fuel;

  public KmFuel(Souble km, Double fuel){
    this.km = km;
    this.fuel = fuel;
  }
  
  public void setFuel(Double fuel) {
    this.fuel = fuel;
  }

  public void setKm(Double km) {
    this.km = km;
  }

  public Double getFuel() {
    return fuel;
  }

  public Double getKm() {
    return km;
  }

  public Double mediaFuel(){
    return km / fuel;
  }

}
