package searching;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class Psalms {
    public static void main(String[] args) throws IOException {
        //Variables Declaration & Initialization
        ArrayList<String> quote = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        int input, quoteNum;
        String text;

        File file = new File("src/searching/resources/Psalms.txt");
        BufferedReader readFile = new BufferedReader(new FileReader(file));
        input = Integer.parseInt(JOptionPane.showInputDialog(null
                , "What psalms number would you like to see?(1-99)", "Search", JOptionPane.QUESTION_MESSAGE));
        while ((text = readFile.readLine()) != null)

            quote.add(text);

        //For Loop to separate num and word
        for (int i = 0; i < quote.size(); i++) {
            num.add(Integer.parseInt(quote.get(i)));
            quote.remove(i);
        }
        if ((quoteNum = binarySearch(num, input)) != -1)
            JOptionPane.showMessageDialog(null
                    , "Your number " + input + " has been found.\n" + input + "." + quote.get(quoteNum)
                    , "Psalm found it", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null
                    , "The number isn't in the .txt", "Error", JOptionPane.ERROR_MESSAGE);
        readFile.close();
    }//End Class

    //binarySearch
    public static int binarySearch(ArrayList<Integer> quoteNum, int input) {
        int mid, low = 0, high = quoteNum.size() - 1;
        while (low <= high) {
            System.out.print("Searching array: ");
            for (int i = low; i <= high; i++)
                System.out.print("[" + quoteNum.get(i) + "]");
            System.out.println(" for " + input);
            mid = (low + high) / 2;
            if (input > quoteNum.get(mid))//If Statement if the digit get is less than the input go to right
                low = mid + 1;
            else if (input < quoteNum.get(mid))//if the digit get is greater than the input go to left
                high = mid - 1;
            else if (quoteNum.get(mid) == input)//if the digit get is equal to input stop the loop
                return mid;
        }
        return -1;
    }
}//End Class
