package animalShelter;

import java.util.*;
import javax.swing.*;

public class AnimalShelter {
    //Instance variables
    private final ArrayList<Dog> listDog = new ArrayList<>();
    private final ArrayList<Integer> listDogOperating = new ArrayList<>();
    private double total;

    //Constructor
    public AnimalShelter() {
        this.total = 0;
    }

    //addDogShelter Method
    public void addDogShelter() {
        String name, breed;
        int age, day;
        double weight;
        name = JOptionPane.showInputDialog("Enter dog name");
        breed = JOptionPane.showInputDialog("Enter dog breed");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter dog age"));
        weight = Double.parseDouble(JOptionPane.showInputDialog("Enter dog weight"));
        day = Integer.parseInt(JOptionPane.showInputDialog("How many day you want use this shelter (15 $/day)"));
        listDogOperating.add(day);
        this.setTotal(this.getTotal() + (day * 15));
        listDog.add(new Dog(name, breed, age, weight));
    }

    //getTotal Method
    public double getTotal() {
        return total;
    }

    //setTotal Method
    public void setTotal(double total) {
        this.total = total;
    }

    //removeDogShelter Method
    public void removeDogShelter() {
        int num, numOp;
        if (listDog.size() > 0) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Which dog you want remove ?"));
            numOp = Integer.parseInt(JOptionPane.showInputDialog("How many day did operating the shelter?"));
            while (listDogOperating.get(num - 1) < numOp || numOp < 0) {
                numOp = Integer.parseInt(JOptionPane.showInputDialog("Cannot be greater than "
                        + listDogOperating.get(num - 1) + " or less than 0."
                        + "\nHow many day did operating the shelter?"));
            }
            this.setTotal(this.getTotal() - (listDogOperating.get(num - 1) - numOp) * 15);
            listDogOperating.remove(num - 1);
            listDog.remove(num - 1);
        } else {
            JOptionPane.showMessageDialog(null, "Shelter empty cannot remove");
        }
    }

    //displayShelterOperatingCost Method
    public String displayShelterOperatingCost() {
        StringBuilder output = new StringBuilder();
        output.append("\n<-------------------------------------------------->\n\nAnimal Shelter Operating Cost:\n\n");

        for (int i = 0; i < listDog.size(); i++) {
            output.append("Dog #").append(i + 1).append("\nOperating for ").append(listDogOperating.get(i)).append(" day\n\n");
        }
        output.append("\nTotal earning from the start: ").append(this.getTotal()).append("$\n\n<-------------------------------------------------->\n");
        return output.toString();
    }

    //toString Method
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("<-------------------------------------------------->\n\nAnimal Shelter Contains:\n\n");

        for (int i = 1; i <= listDog.size(); i++) {
            output.append("Dog #").append(i).append("\n").append(listDog.get(i - 1));
        }
        output.append("<-------------------------------------------------->\n");
        return output.toString();
    }//End toString Method
}//End Class
