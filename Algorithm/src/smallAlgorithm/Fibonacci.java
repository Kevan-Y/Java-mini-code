package smallAlgorithm;

import javax.swing.*;

public class Fibonacci {
    public static void main(String[] args) {
        //Variable Declaration & Initialization
        int number = 0;
        try {
            number = Integer.parseInt(JOptionPane.showInputDialog(null
                    , "The first nine fibonacci numbers are listed as follows:\n"
                            + "1,1,2,3,5,8,13,21,34,...\n"
                            + "What fibonacci term would you like to see?"
                    , "Fibonacci", JOptionPane.QUESTION_MESSAGE));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error input, The program will end."
                    , "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "The " + number + "th fibonacci number "
                + fibonacciMethod(number), "Message", JOptionPane.INFORMATION_MESSAGE);
    }//End Main

    //Fibonacci Method
    public static int fibonacciMethod(int num) {
        if (num == 0)
            return 0;
        else if (num == 1 || num == 2)
            return 1;
        else
            return fibonacciMethod(num - 1) + fibonacciMethod(num - 2);
    }
}//End Class