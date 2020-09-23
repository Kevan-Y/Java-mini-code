package fuelEfficiency;

public class Truck extends Vehicle {
    //Default Constructor
    public Truck() {
        super();
    }

    //Constructor
    public Truck(double gas) {
        super(gas);
    }

    //getDistance Method
    public double getDistance() {
        return super.getGas() / 14.1 * 100;
    }
}//End Class
