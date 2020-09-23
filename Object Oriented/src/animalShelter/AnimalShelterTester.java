package animalShelter;

import javax.swing.*;

public class AnimalShelterTester {
    public static void main(String[] args) {
        //Variable Declaration & Initialization
        AnimalShelter myAnimalShelter = new AnimalShelter();
        int input = 0;
        while (input != 5) {
            try {
                input = Integer.parseInt(JOptionPane.showInputDialog(
                        "Please choose from the following menu:\n" +
                                "1 – Display list of dogs\n" +
                                "2 - Add a dog to the shelter\n" +
                                "3 - Remove a dog from the shelter\n" +
                                "4 - Display the operating cost of the shelter\n" +
                                "5 - Exit the program"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error of input", "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            switch (input) {
                case 1 -> System.out.println(myAnimalShelter.toString());
                case 2 -> myAnimalShelter.addDogShelter();
                case 3 -> myAnimalShelter.removeDogShelter();
                case 4 -> System.out.println(myAnimalShelter.displayShelterOperatingCost());
            }
        }
    }//End Main
}//End Class