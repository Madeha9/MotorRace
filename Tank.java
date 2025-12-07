package motorRace;

public class Tank {
    // Attribute für Tank-Objekte
    // max. Füllmenge
    public double maxCapacity;

    // akt. Füllmenge
    public   double currentCapacity;

    private  double totalConsumed;

    // Methoden
    // Initialisierung
    public void prepareTank(double maxCapacity){
        // max. und akt. Füllmenge initialisieren
        this.maxCapacity = this.currentCapacity = maxCapacity;
        //this.totalConsumed = maxCapacity-this.currentCapacity;
    }

    public void ConsumedFuel(double fuel){
        currentCapacity-=fuel;
        if(currentCapacity<0){
            currentCapacity=0;
        }

    }
    public void refuel(){
        currentCapacity=maxCapacity;
    }
    public boolean Enoughfeul(){
        if (currentCapacity >= .15*maxCapacity){
        return true;}
        else {
           refuel();
            return false;}}
    public void showTank(){
        System.out.printf("Tank: maxCapa=%.2f, curCapa=%.2f; ",
                maxCapacity, currentCapacity);
    }


}
