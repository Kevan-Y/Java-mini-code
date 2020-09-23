package vehicleTester;

public class Vehicle {
    //Instance Variables
    private double gasKilometre, fuelTankSize, fuelAvailable, kilometresTravelled, fare, fuelCost, gasUsed;
    private int passenger;

    //Default Constructor
    public Vehicle() {
        this.gasKilometre = 0;
        this.fuelTankSize = 0;
        this.fuelAvailable = 0;
        this.kilometresTravelled = 0;
        this.passenger = 0;
        this.fare = 0;
        this.fuelCost = 0;
        this.gasUsed = 0;
    }

    //Constructor
    public Vehicle(double gasKilometre, double fuelTankSize, double fuelAvailable, int passenger, double fare, double fuelCost) {
        this.gasKilometre = gasKilometre;
        this.fuelTankSize = fuelTankSize;
        this.fuelAvailable = fuelAvailable;
        this.kilometresTravelled = 0;
        this.passenger = passenger;
        this.fare = fare;
        this.fuelCost = fuelCost;
        this.gasUsed = 0;
    }

    //getGasKilometre Method
    public double getGasKilometre() {
        return gasKilometre;
    }

    //getFuelTankSize Method
    public double getFuelTankSize() {
        return fuelTankSize;
    }

    //getFuelAvailable Method
    public double getFuelAvailable() {
        return (double) Math.round(fuelAvailable * 100) / 100;
    }

    //getKilometresTravelled Method
    public double getKilometresTravelled() {
        return kilometresTravelled;
    }

    //getPassenger Method
    public int getPassenger() {
        return passenger;
    }

    //getFare Method
    public double getFare() {
        return fare;
    }

    //getFuelCost Method
    public double getFuelCost() {
        return fuelCost;
    }

    //getGasUsed Method
    public double getGasUsed() {
        return gasUsed;
    }

    //setGasKilometre Method
    public void setGasKilometre(double gasKilometre) {
        this.gasKilometre = gasKilometre;
    }

    //setFuelTankSize Method
    public void setFuelTankSize(double fuelTankSize) {
        this.fuelTankSize = fuelTankSize;
    }

    //setFuelAvailable Method
    public void setFuelAvailable(double fuelAvailable) {
        this.fuelAvailable = fuelAvailable;
    }

    //setKilometresTravelled Method
    public void setKilometresTravelled(double kilometresTravelled) {
        this.kilometresTravelled = kilometresTravelled;
    }

    //setPassenger Method
    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    //setFare Method
    public void setFare(double fare) {
        this.fare = fare;
    }

    //setFuelCost Method
    public void setFuelCost(double fuelCost) {
        this.fuelCost = fuelCost;
    }

    //setGasUsed Method
    public void setGasUsed(double gasUsed) {
        this.gasUsed = gasUsed;
    }

    //toString Method
    public String toString() {
        String output = "Gas Kilometre = " + gasKilometre + "\n";
        output += "Fuel Tank Size = " + fuelTankSize + "L\n";
        output += "Fuel Available = " + fuelAvailable + "L\n";
        output += "Kilometres Driven = " + kilometresTravelled + "Km\n";
        output += "Passengers = " + passenger + "\n";
        output += "Fare = " + fare + "$CAD\n";
        output += "Fuel Cost = " + fuelCost + "$/L\n";
        output += "<==============================================>\n";
        return output;
    }

    //addFuel Method
    public void addFuel(double gas) {

        if ((fuelTankSize - fuelAvailable) >= gas) {
            fuelAvailable += gas;
            setGasUsed(gasUsed + gas);
            System.out.println("<==============================================>"
                    + "\n<------------------>\nAdded " + gas + "L of gas to the tank."
                    + "\n<------------------>\n");
        } else {
            System.out.println("<==============================================>"
                    + "\n<------------------>\nYou tried to add " + gas + "L of gas.");
            System.out.println("There is only room for " + (fuelTankSize - fuelAvailable) + "L."
                    + "\n<------------------>\n");
        }
    }

    //driveVehicle Method
    public void driveVehicle(double kms) {
        System.out.println("<==============================================>"
                + "\n<------------------>\nDrive " + kms + "kms.  Start with " +
                fuelAvailable + "L of gas.");
        double litresNeeded = (kms * gasKilometre) / 100.0;
        this.setGasUsed(gasUsed + litresNeeded);

        if (fuelAvailable >= litresNeeded) {
            fuelAvailable -= litresNeeded;
            kilometresTravelled += kms;
            System.out.println("Used " + litresNeeded + "L of gas.\n<------------------>\n");
        } else {
            System.out.println("Ran out of fuel!");
            double kmsThisDrive = (fuelAvailable * 100.0) / gasKilometre;
            kilometresTravelled += kmsThisDrive;
            setGasUsed(fuelAvailable + (fuelTankSize - fuelAvailable));
            fuelAvailable = 0;
            System.out.println("The vehicle drove " + kmsThisDrive +
                    " before running out of gas.\n<------------------>\n");
        }
    }

    //totalCost Method
    public double totalCost() {
        return (double) Math.round((gasUsed * fuelCost) * 100) / 100;
    }

    //revenue Method
    public double revenue() {
        return (double) Math.round((passenger * fare) * 100) / 100;
    }

    //profits Method
    public double profits() {
        return (double) Math.round((revenue() - totalCost()) * 100) / 100;
    }
}//End Class
