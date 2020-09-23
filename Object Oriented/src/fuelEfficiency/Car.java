package fuelEfficiency;

public class Car extends Vehicle {
    //Default Constructor
    public Car() {
        super();
    }

    //Constructor
    public Car(double gas) {
        super(gas);
    }

    //getDistance Method
    public double getDistance() {
        return super.getGas() / 9.4 * 100;
    }
}//End Class
