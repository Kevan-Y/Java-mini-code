package smallAlgorithm;

import javax.swing.*;

public class ReduceFraction {
    public static void main(String[] args) {
        //Variable Declaration & Initialization
        int numerator = 0, denominator = 0, maxMulti;
        try {
            numerator = Integer.parseInt(JOptionPane.showInputDialog(null
                    , "Please enter the numerator for your fraction.", "Numerator", JOptionPane.QUESTION_MESSAGE));
            denominator = Integer.parseInt(JOptionPane.showInputDialog(null
                    , "Please enter the denominator for your fraction.", "Denominator", JOptionPane.QUESTION_MESSAGE));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error input, The program will end."
                    , "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        maxMulti = reduceFrac(numerator, denominator);
        if (denominator / maxMulti == 1)
            JOptionPane.showMessageDialog(null, "The fraction " + numerator + "/" + denominator + " can be reduced to: "
                    + numerator / maxMulti, "Message", JOptionPane.INFORMATION_MESSAGE);

        else if (numerator / maxMulti == denominator / maxMulti)
            JOptionPane.showMessageDialog(null, "The fraction " + numerator + "/" + denominator
                    + " can be reduced to: 1", "Message", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "The fraction " + numerator + "/" + denominator + " can be reduced to: "
                    + numerator / maxMulti + "/" + denominator / maxMulti, "Message", JOptionPane.INFORMATION_MESSAGE);

    }//End Main

    //ReduceFrac Method
    public static int reduceFrac(int n, int d) {
        if (d == 0)
            return n;
        else
            return reduceFrac(d, n % d);
    }
}//End Class