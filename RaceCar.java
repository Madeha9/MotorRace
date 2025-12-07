package motorRace;

//import java.util.Date;
import java.util.Random;

public class RaceCar {
    // Attribute für jedes Objekt

    // Rennstall (Zeichenfolge)
    // TODO: Attribut
    public    double gefahreneStrecke=0;
    public   double  gesamtverbrauch =0;
//    private int Zeit = 5;

    private String team;

//       private String AutoColor;
    private Random  random = new Random();

    // für die Variante 2 von prepareForRace müssen wir die beiden Objekte in
    // der Klasse selber erzeugen: hier oder direkt in der Methode
    // der Motor des Rennautos
    private Engine myEngine = new Engine();

    // der Tank
    private Tank myTank = new Tank();


    // TODO: gesamtverbrauch (kann auch in Tank definiert werden)
public  void drive(double Minutes) {
    if (myTank.Enoughfeul()) {
        double speedfactor = 0.75 + 0.5 * random.nextDouble();
        double Covereddistance = speedfactor * Minutes * myEngine.getAvgSpeed();
        //benötiger Treibstoffe
        double NeededFuel = (myEngine.fuelConsumption / 100) * Covereddistance;
        gefahreneStrecke += Covereddistance;
        myTank.ConsumedFuel(NeededFuel);
        gesamtverbrauch += NeededFuel;
//        System.out.print(gefahreneStrecke);
    } else {
        myTank.refuel();
        System.out.println("Das Auto muss stoppen und der Tan ausfühlen");
    }
}
    // Methoden
    // Initialisierung
    // Variante 1:
    public void prepareForRace(Engine engine, Tank tank, String team) {
        myEngine = engine;
        myTank = tank;
        this.team = team;

    }

//    // Variante 2:
//    // die Informationen für alle Objekte einzeln angeben
//    public void prepareForRace(String team, double avgSpeed, double fuelConsumption, double maxCapacity) {
//        // die eigenen Attribute selber füllen
//        this.team = team;
//        // die Informationen für Tank und Engine weitergeben
//        myTank .prepareTank(maxCapacity);
//        // Informationen für Engine weitergeben
//        //myEngine = new Engine(); // nicht nötig, wenn die Erzeugung direkt beim Attribut steht
//        myEngine.prepareEngine(avgSpeed, fuelConsumption);
//    } vav


    public double getGefahreneStrecke(){
    return gefahreneStrecke;
    }

    public double getGesamtverbrauch(){
    return gesamtverbrauch;
    }

    // Alles anzeigen
    public void showStats() {
        System.out.printf("Rennstall=%s, GesamtVerbrauch=%.2f, GefahreneStreck=%.2f; ",
                team ,gesamtverbrauch, gefahreneStrecke);
        myEngine.showEngine();
        myTank.showTank();
        System.out.println();
    }
public String getteam() {
    return team;
}

}
