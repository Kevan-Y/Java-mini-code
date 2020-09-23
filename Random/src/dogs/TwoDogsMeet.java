package dogs;

import java.util.*;
import javax.swing.*;

public class TwoDogsMeet {
    public static void main(String[] args) {
        //Variable Declaration & Initialization
        Random rand = new Random();
        String[] dogName = new String[2];
        String[] dogBreed = new String[2];
        int[] age = new int[2];
        int[] aggression = new int[2];
        int[] hunger = new int[2];
        int choice;
        JTextField newAggression = new JTextField();
        JTextField newHunger = new JTextField();
        Object[] options = {"Confirm", "Change"};
        Object[] secondOption = {"New aggression: (scale 1-10)", newAggression, "New Hunger: (scale 1-10)", newHunger};
        //Object
        Dog dogDefault = new Dog();
        JOptionPane.showMessageDialog(null
                , "Welcome to TwoDogsMeet program\n" + dogDefault.toString() + "\n" + dogDefault.toString()
                , "DogDefault", JOptionPane.INFORMATION_MESSAGE);
        //For Loop ask name of each dog
        for (int j = 0; j < dogName.length; j++) {
            //If Statement to check if user input a null
            if (dogName[j] == null) {
                dogName[j] = JOptionPane.showInputDialog(null,
                        "Input dog name", "Dog " + (j + 1), JOptionPane.QUESTION_MESSAGE);
                j--;
            }
        }
        //For Loop ask breed of each dog
        for (int j = 0; j < dogName.length; j++) {
            //If Statement to check if user input a null
            if (dogBreed[j] == null) {
                dogBreed[j] = JOptionPane.showInputDialog(null,
                        "Input dog breed", dogName[j], JOptionPane.QUESTION_MESSAGE);
                j--;
            }
        }
        //For Loop generate random age, aggression and hunger for each dog
        for (int j = 0; j < dogName.length; j++) {
            age[j] = rand.nextInt(13) + 1;
            aggression[j] = rand.nextInt(10) + 1;
            hunger[j] = rand.nextInt(10) + 1;
        }
        //Object
        Dog dog1 = new Dog(String.valueOf(dogName[0]), String.valueOf(dogBreed[0]), age[0], aggression[0], hunger[0]);
        Dog dog2 = new Dog(String.valueOf(dogName[1]), String.valueOf(dogBreed[1]), age[1], aggression[1], hunger[1]);
        choice = JOptionPane.showOptionDialog(null, "Welcome\n" + dog1.toString() + "\n" + dog2.toString()
                , "Dog", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);

        if (choice == 1) {//For Loop to ask new aggression and hunger of each dog
            for (int i = 0; i < dogName.length; i++) {
                newAggression.setText("");
                newHunger.setText("");
                JOptionPane.showConfirmDialog(null, secondOption, dogName[i]
                        , JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

                try {
                    //If Statement check if Aggression or Hunger is greater than 10 or less than 0
                    if (Integer.parseInt(newAggression.getText()) < 11 && Integer.parseInt(newHunger.getText()) < 11
                            && Integer.parseInt(newAggression.getText()) > 0 && Integer.parseInt(newHunger.getText()) > 0) {
                        aggression[i] = Integer.parseInt(newAggression.getText());
                        hunger[i] = Integer.parseInt(newHunger.getText());
                    } else {
                        JOptionPane.showMessageDialog(null
                                , "Error Input, Aggression or Hunger cannot be greater than 10 or less than 0.", "Error", JOptionPane.ERROR_MESSAGE);
                        i--;
                    }
                } catch (NumberFormatException e) {
                    i--;
                    JOptionPane.showMessageDialog(null
                            , "Error Input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            dog1.setAggression(aggression[0]);
            dog1.setHunger(hunger[0]);
            dog2.setAggression(aggression[1]);
            dog2.setHunger(hunger[1]);
        }
        //If Statement to check if there are friendly
        if ((dog1.getAggression() + dog2.getAggression()) > 10 && (dog1.getHunger() + dog2.getHunger()) > 10)
            JOptionPane.showMessageDialog(null, "Welcome\n" + dog1.toString() + "\n" + dog2.toString()
                    + "\n\nBoth dog didn't like each other !", "Dog Information", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Welcome\n" + dog1.toString() + "\n" + dog2.toString()
                    + "\n\nBoth dog like each other ! ", "Dog Information", JOptionPane.INFORMATION_MESSAGE);
    }//End Main
}//End Class
