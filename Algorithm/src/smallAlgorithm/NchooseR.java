package smallAlgorithm;

import javax.swing.*;

public class NchooseR {
    public static void main(String[] args) {
        //Variable Declaration & Initialization
        int digit1 = 0, digit2 = 0;
        try {
            digit1 = Integer.parseInt(JOptionPane.showInputDialog(null
                    , "How many object would you like to choose?", "NChooseR", JOptionPane.QUESTION_MESSAGE));
            digit2 = Integer.parseInt(JOptionPane.showInputDialog(null
                    , "How many object are there to choose from?", "NChooseR", JOptionPane.QUESTION_MESSAGE));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null
                    , "Error input, The program will end.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "There are " + combination(digit2, digit1) + " ways to choose " + digit1
                + " object from a set of " + digit2 + " object", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//End Main

    //Combination Method
    public static int combination(int n, int r) {
        return (factorial(n)) / (factorial(r) * factorial(n - r));
    }

    //Factorial Method
    public static int factorial(int index) {
        if (index == 1)
            return 1;
        else
            return index * factorial(index - 1);
    }
}//End Class
