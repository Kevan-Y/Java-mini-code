package locker;

import java.util.*;
import javax.swing.*;

public class ComboLockDriver {
    public static void main(String[] args) {
        //Variable Declaration & Initialization
        Random rand = new Random();
        int code1, code2, code3;
        JOptionPane.showMessageDialog(null, "Welcome to ComboLockDriver program First set your locker"
                , "ComboLockDriver", JOptionPane.INFORMATION_MESSAGE);
        code1 = Integer.parseInt(JOptionPane.showInputDialog(null
                , "What is the first digit you would like to set?", "Code 1", JOptionPane.QUESTION_MESSAGE));
        code2 = Integer.parseInt(JOptionPane.showInputDialog(null
                , "What is the second digit you would like to set?", "Code 2", JOptionPane.QUESTION_MESSAGE));
        code3 = Integer.parseInt(JOptionPane.showInputDialog(null
                , "What is the third digit you would like to set?", "Code 3", JOptionPane.QUESTION_MESSAGE));
        //Object
        ComboLock lock = new ComboLock(code1, code2, code3);
        JOptionPane.showMessageDialog(null, "Now to open the lock!");
        while (true) {
            code1 = Integer.parseInt(JOptionPane.showInputDialog(null
                    , "What is the first digit?", "Code 1", JOptionPane.QUESTION_MESSAGE));
            code2 = Integer.parseInt(JOptionPane.showInputDialog(null
                    , "What is the second digit?", "Code 2", JOptionPane.QUESTION_MESSAGE));
            code3 = Integer.parseInt(JOptionPane.showInputDialog(null
                    , "What is the third digit?", "Code 3", JOptionPane.QUESTION_MESSAGE));
            //If Statement to check if the code match
            if (lock.checkLock(code1, code2, code3)) {
                JOptionPane.showMessageDialog(null, "Correct Code", "Information", JOptionPane.INFORMATION_MESSAGE);
                break;
            } else
                JOptionPane.showMessageDialog(null, "Incorrect Code", "Information", JOptionPane.INFORMATION_MESSAGE);

        }
        //Object
        lock.setCode1(rand.nextInt(3) + 1);
        lock.setCode2(rand.nextInt(3) + 1);
        lock.setCode3(rand.nextInt(3) + 1);
        JOptionPane.showMessageDialog(null, "Guess the next locks combo, you have 3 try. Each digit is between 1-3");

        for (int i = 0; i < 3; i++) {
            code1 = Integer.parseInt(JOptionPane.showInputDialog(null
                    , "What is the first digit?", "Code 1", JOptionPane.QUESTION_MESSAGE));
            code2 = Integer.parseInt(JOptionPane.showInputDialog(null
                    , "What is the second digit?", "Code 2", JOptionPane.QUESTION_MESSAGE));
            code3 = Integer.parseInt(JOptionPane.showInputDialog(null
                    , "What is the third digit?", "Code 3", JOptionPane.QUESTION_MESSAGE));
            //If Statement to check if the code match
            if (lock.checkLock(code1, code2, code3)) {
                JOptionPane.showMessageDialog(null, "Correct Code", "Information", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
            JOptionPane.showMessageDialog(null, "Incorrect Code", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "3 incorrect guesses! The combo was "
                + lock.getCode1() + " - " + lock.getCode2() + " - " + lock.getCode3());
    }//End Main
}//End Class

