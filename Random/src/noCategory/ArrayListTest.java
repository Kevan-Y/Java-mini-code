package noCategory;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] arg) {
        //Variable Declaration & Initialization
        ArrayList<String> array = new ArrayList<>();
        String word, del;

        //Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an array of numbers or characters,"
                + " type \"/end\" when finished");

        word = scan.nextLine();

        //While when use type /end it will stop the adding word to ArrayList
        while (!"/end".equals(word)) {
            array.add(word);
            word = scan.nextLine();
        }

        //Decoration
        System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-");

        //For loop to print what is store inside of the ArrayList
        for (String i : array)
            System.out.println(i);


        //Decoration
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println("\nWhat numbers or characters would you like to delete?"
                + " Type \"/end\" when finished");

        del = scan.nextLine();

        //While when use type /end it will stop the program
        while (!"/end".equals(del)) {
            array.remove(del);
            System.out.println("What others numbers or characters would you like to delete?"
                    + " Type \"/end\" when finished");
            del = scan.nextLine();
        }

        //Decoration
        System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-");

        //For loop to print what is store inside of the ArrayList
        for (String i : array)
            System.out.println(i);

        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-");
        scan.close();
    }//End main
}//End class

