package fuelEfficiency;

public class Motorcycle extends Vehicle {
    //Default Constructor
    public Motorcycle() {
        super();
    }

    //Constructor
    public Motorcycle(double gas) {
        super(gas);
    }

    //getDistance Method
    public double getDistance() {
        return super.getGas() / 6.3 * 100;
    }
}//End Class
