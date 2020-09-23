package cars;

import javax.swing.*;

public class CarTester {
    public static void main(String[] args) {
        //Variable Declaration & Initialization
        String[] properties = {"What is the make?", "What is the model?", "What is the year?"
                , "What is the price?", "What is the color?", "What kind of fuel?"};
        String[] answer2 = new String[4];
        String[] answer3 = new String[6];
        String[] answer4 = new String[6];
        int option, choice = 0;
        //For loop to ask question for car 2
        for (int j = 0; j < answer2.length; j++)
            answer2[j] = JOptionPane.showInputDialog(null
                    , properties[j], "Car- #2", JOptionPane.QUESTION_MESSAGE);
        //For loop to ask question for car 3
        for (int i = 0; i < answer3.length; i++)
            answer3[i] = JOptionPane.showInputDialog(null
                    , properties[i], "Car- #3", JOptionPane.QUESTION_MESSAGE);
        //Object
        Car car1 = new Car();
        Car car2 = new Car(answer2[0], answer2[1], answer2[2], answer2[3]);
        Car car3 = new Car(answer3[0], answer3[1], answer3[2], answer3[3], answer3[4], answer3[5]);
        //Decoration
        //Call default Constructor
        System.out.printf("%s%n|%27s%18s%n%s%n%s%n%s%n%s%n"
                , "|--------------------------------------------|", "Car Tester", "|"
                , "|--------------------------------------------|"
                , "The first car has the following info: "
                        + car1.toString(), "The second car has the following info: "
                        + car2.toString(), "The third car has the following info: "
                        + car3.toString());
        option = JOptionPane.showConfirmDialog(null
                , "Do you want change any information", "Options", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            try {
                choice = Integer.parseInt(JOptionPane.showInputDialog(null
                        , "What Car you want change information", "Options", JOptionPane.QUESTION_MESSAGE));
            } catch (java.lang.NumberFormatException e) {
                System.err.println("Incorrect digit number, Close program");
                System.exit(0);
            }

            if (choice == 1) {
                //For loop to ask question for car set
                for (int i = 0; i < answer3.length; i++)
                    answer4[i] = JOptionPane.showInputDialog(null
                            , properties[i], "Car- #1", JOptionPane.QUESTION_MESSAGE);

                car1.setMake(answer4[0]);
                car1.setModel(answer4[1]);
                car1.setYear(Integer.parseInt(answer4[2]));
                car1.setPrice(Double.parseDouble(answer4[3]));
                car1.setColor(answer4[4]);
                car1.setFuel(answer4[5]);
            } else if (choice == 2) {
                //For loop to ask question for car set
                for (int i = 0; i < answer3.length; i++)
                    answer4[i] = JOptionPane.showInputDialog(null
                            , properties[i], "Car- #2", JOptionPane.QUESTION_MESSAGE);

                car2.setMake(answer4[0]);
                car2.setModel(answer4[1]);
                car2.setYear(Integer.parseInt(answer4[2]));
                car2.setPrice(Double.parseDouble(answer4[3]));
                car2.setColor(answer4[4]);
                car2.setFuel(answer4[5]);
            } else if (choice == 3) {
                //For loop to ask question for car set
                for (int i = 0; i < answer3.length; i++)
                    answer4[i] = JOptionPane.showInputDialog(null
                            , properties[i], "Car- #3", JOptionPane.QUESTION_MESSAGE);
                car3.setMake(answer4[0]);
                car3.setModel(answer4[1]);
                car3.setYear(Integer.parseInt(answer4[2]));
                car3.setPrice(Double.parseDouble(answer4[3]));
                car3.setColor(answer4[4]);
                car3.setFuel(answer4[5]);
            } else {
                System.err.println("Error Option Please try again !");
                System.exit(0);
            }//End If Statement
            //Call Default Constructor
            System.out.printf("%n%s%n%s%n%s%n%s%n", "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                    , "The first car has the following info: " + car1.toString()
                    , "The second car has the following info: "
                            + car2.toString(), "The third car has the following info: " + car3.toString());
        } else {
            System.err.println("Exit Program");
            System.exit(0);
        }
    }//End Main
}//End Class
