public class Car implements Transport{

    private double enginePower;
    private double travelTime;

    public Car(double enginePower, double travelTime) {
        this.enginePower = enginePower;
        this.travelTime = travelTime;
    }

    public double consumptionFuel(){
        return enginePower*travelTime;
    }
}
