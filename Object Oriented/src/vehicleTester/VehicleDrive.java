package vehicleTester;

import javax.swing.*;

public class VehicleDrive {
    public static void main(String[] args) {
        //Variable Declaration & Initialization
        boolean redo = false;
        JTextField gasKilometre = new JTextField("7.5");
        JTextField fuelTankSize = new JTextField("60");
        JTextField fuelAvailable = new JTextField("60");
        JTextField passenger = new JTextField("15");
        JTextField fare = new JTextField("5.75");
        JTextField fuelCost = new JTextField("1.39");
        int choice1, choice2, cancelOption;
        double gas = 0, kmsTravel = 0;
        Vehicle car1 = new Vehicle();//Default Object
        Object[] option1 = {"Car information", "Exit"};
        Object[] option2 = {"Gas kilometre:", gasKilometre, "Fuel tank size:", fuelTankSize
                , "Fuel available (Cost of fuel will not be include):", fuelAvailable
                , "Passenger:", passenger, "Fare($CAD):", fare, "Fuel cost($CAD):", fuelCost};
        Object[] option3 = {"Add fuel", "Drive", "Show Cost/Revenue/Profits", "Exit"};
        choice1 = JOptionPane.showOptionDialog(null, "Welcome to Vehicle ", "Select an option"
                , JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option1, option1[1]);

        switch (choice1) {
            case 0 -> {
                //While loop to repeat the option
                while (!redo) {
                    cancelOption = JOptionPane.showConfirmDialog(null, option2, "Car information"
                            , JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

                    if (cancelOption == JOptionPane.CANCEL_OPTION) {
                        JOptionPane.showMessageDialog(null, "Exit program.");
                        System.exit(0);
                    } else {

                        try {
                            car1.setGasKilometre(Double.parseDouble(gasKilometre.getText()));
                            car1.setFuelTankSize(Double.parseDouble(fuelTankSize.getText()));
                            car1.setFuelAvailable(Double.parseDouble(fuelAvailable.getText()));
                            car1.setPassenger(Integer.parseInt(passenger.getText()));
                            car1.setFare(Double.parseDouble(fare.getText()));
                            car1.setFuelCost(Double.parseDouble(fuelCost.getText()));
                            redo = true;
                        } catch (java.lang.NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Error of input", "Error", JOptionPane.ERROR_MESSAGE);
                            redo = false;
                        }
                    }
                }
                System.out.println("<==============================================>\n" + car1.toString());
                while (redo) {
                    choice2 = JOptionPane.showOptionDialog(null, "Welcome to Vehicle ", "Select an option"
                            , JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option3, option3[3]);
                    switch (choice2) {
                        case 0 -> {
                            try {
                                gas = Double.parseDouble(JOptionPane.showInputDialog(null
                                        , "How much fuel do you want to add?"
                                        , "Add fuel", JOptionPane.QUESTION_MESSAGE));
                                redo = false;
                            } catch (NullPointerException e) {
                                redo = true;
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null
                                        , "Error of input", "Error", JOptionPane.ERROR_MESSAGE);
                                redo = true;
                            }
                            if (!redo) {
                                car1.addFuel(gas);
                                System.out.println(car1.toString());
                                redo = true;
                            }
                        }
                        case 1 -> {
                            try {
                                kmsTravel = Double.parseDouble(JOptionPane.showInputDialog(null
                                        , "How much do you want to drive?(Kilometres)"
                                        , "kilometres Travelled", JOptionPane.QUESTION_MESSAGE));
                                redo = false;
                            } catch (NullPointerException e) {
                                redo = true;
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null
                                        , "Error of input", "Error", JOptionPane.ERROR_MESSAGE);
                                redo = true;
                            }
                            if (!redo) {
                                car1.driveVehicle(kmsTravel);
                                System.out.println(car1.toString());
                                redo = true;
                            }
                        }
                        case 2 -> System.out.println("Revenue: " + car1.revenue() + "$CAD\nTotal Cost: "
                                + car1.totalCost() + "$CAD\nProfits: " + car1.profits()
                                + "$CAD\n\n<==============================================>\n");
                        case 3 -> {
                            JOptionPane.showMessageDialog(null, "Exit program.");
                            System.exit(0);
                            redo = false;
                        }
                    }
                }
            }
            case 1 -> {
                JOptionPane.showMessageDialog(null, "Exit program.");
                System.exit(0);
            }
        }
    }//End Main
}//End Class
