package fuelEfficiency;

public class HybridCar extends Vehicle {
    //Default Constructor
    public HybridCar() {
        super();
    }

    //Constructor
    public HybridCar(double gas) {
        super(gas);
    }

    //getDistance Method
    public double getDistance() {
        return super.getGas() / 3.8 * 100;
    }
}//End Class

