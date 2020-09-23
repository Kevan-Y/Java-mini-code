package fuelEfficiency;

public abstract class Vehicle {
    //Instance Variable
    private double gas;

    //Default Constructor
    public Vehicle() {
        gas = 0;
    }

    //Constructor
    public Vehicle(double gas) {
        this.gas = gas;
    }

    //getGas Method
    public double getGas() {
        return gas;
    }

    //setGas Method
    public void setGas(double gas) {
        this.gas = gas;
    }

    public abstract double getDistance();//Abstract getDistance
}//End abstract class
