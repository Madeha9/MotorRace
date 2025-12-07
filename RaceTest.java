package motorRace;

public class RaceTest {
    static void main(String[] args) {
        RaceCar car1 = new RaceCar();
        RaceCar car2 = new RaceCar();
        // Komposition, indem die Teil-Objekte außerhalb erzeugt
        // und initialisiert werden und dann an das RaceCar-Objekt
        // übergeben werden
       double totaldistanz = 200;
       double PeriodHour = 5.0/60;

        Engine engine1 = new Engine();
        Engine engine2 = new Engine();
        engine1.prepareEngine(200,89.7);
        engine2.prepareEngine(195,75.7);

        // Tanks erzeugen und initialisieren
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();
        tank1.prepareTank(70);
        tank2.prepareTank(80);

        // Rennautos vorbereitencar1.prepareForRace(engine1, tank1, "Ferrari",0,0);
        car1.prepareForRace(engine1,tank1,"Ferrari");
        car2.prepareForRace(engine2, tank2, "Red Bull");
while (car1.gefahreneStrecke<totaldistanz && car2.gefahreneStrecke<totaldistanz) {
    car1.drive(PeriodHour);
    car2.drive(PeriodHour);

    car1.showStats();
    car2.showStats();
    System.out.println("==================");
}
//Gewinner ermitteln
        if(car1.gefahreneStrecke >=car2.gefahreneStrecke) {
            System.out.println(car1.getteam() + "  hat gewonnen  yahoooooo ");
        } else {
            System.out.println(car2.getteam() + "  hat gewonnen yahoooo ");
        }
        System.out.printf("Gefahrene Strecke für Ferrari: %.2f km%n", car1.gefahreneStrecke);
        System.out.printf("gefahreneStrecke für RedBull: %.2f km%n " , car2.gefahreneStrecke);
        System.out.printf("Gesamtverbrauch für Ferarri:  %.2f km%n" , car1.gesamtverbrauch);
        System.out.printf("GesamtVerbrauch für Redbull: %.2fkm%n " , car2.gesamtverbrauch);

    }
}
