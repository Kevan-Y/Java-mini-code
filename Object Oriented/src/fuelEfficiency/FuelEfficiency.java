package fuelEfficiency;

import java.text.*;
import javax.swing.*;

public class FuelEfficiency {
    public static void main(String[] args) {
        //Variable Declaration & Initialization
        double gas = 0;
        try {
            gas = Double.parseDouble(JOptionPane.showInputDialog("How many liters of gas do you have?"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error of input", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        Vehicle truck = new Truck(gas);
        Vehicle car = new Car(gas);
        Vehicle hybridCar = new HybridCar(gas);
        Vehicle motorcycle = new Motorcycle(gas);
        DecimalFormat decFor = new DecimalFormat(".##");
        System.out.println("On " + gas + " L of gas the vehicles can drive:"
                + "\n\nCar = " + decFor.format(car.getDistance()) + " KM\n"
                + "\nTruck = " + decFor.format(truck.getDistance()) + " KM\n"
                + "\nMotorcycle = " + decFor.format(motorcycle.getDistance()) + " KM\n"
                + "\nHybrid = " + decFor.format(hybridCar.getDistance()) + " KM\n");
    }//End Main
}//End Class