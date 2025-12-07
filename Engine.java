package motorRace;

public class Engine {
    // DurchGeschwindigkeit (in km/h)
    private   double avgSpeed;

    // Treibstoffverbrauch (pro 100 km)
    public double fuelConsumption;

    // gesamte gefahrene Strecke (in km)
    //private double distance;

    public void prepareEngine(double avgSpeed, double fuelConsumption){
        this.avgSpeed = avgSpeed;
        this.fuelConsumption = fuelConsumption;
    }
public  double getAvgSpeed(){
        return avgSpeed;
    }
    public void showEngine(){
        System.out.printf("Engine: speed=%.2f km/h, fuel=%.2f / 100km;",
                avgSpeed, fuelConsumption);
    }
}
