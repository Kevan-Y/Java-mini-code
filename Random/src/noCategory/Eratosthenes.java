package noCategory;

import java.util.*;

public class Eratosthenes {
    public static void main(String[] args) {
        //Variable Declaration & Initialization
        ArrayList<Integer> array = new ArrayList<Integer>();
        boolean[] numbers = new boolean[1000];
        numbers[0] = false;
        int count = 10;
        //Decoration
        System.out.printf("%s%n%s%40s%14s%n%s%n%n%s%n%n%s%n"
                , "\t\t_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_"
                , "\t\t|", "Welcome to Eratosthenes program", "|"
                , "\t\t_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_"
                , "The prime numbers from 1 - 1000 are:"
                , "|============================================="
                        + "======================================================|");
        //For loop tell all numbers in the boolean to be true
        for (int i = 1; i < numbers.length; i++)
            numbers[i] = true;

        //For loop check number if it is a prime number
        for (int j = 2; j <= numbers.length; j++) {

            if (numbers[j - 1]) {
                array.add(j);//To add every prime number to the ArrayList
                //For loop, all other multiples numbers
                for (int n = j * j; n <= numbers.length; n += j)
                    numbers[n - 1] = false;
            }
        }
        //Try and Catch the IndexOutOfBoundsException then end the program
        try {

            while (count <= array.size()) {
                System.out.print("|");
                //For loop to print the each number from the ArrayList
                for (int c = 0; c <= count; c++) {
                    System.out.print("\t" + array.get(c));
                    //If Statement each 10 numbers then jumps to the next line
                    if (c == count) {
                        System.out.print("\t" + "    |\n|");
                        count += 11;
                    }
                }
            }
        } catch (java.lang.IndexOutOfBoundsException e) {
            //Decoration
            System.out.printf("%74s%n%s"
                    , "|", "|================================================"
                            + "===================================================|");
            System.exit(0);
        }
    }//End main
}//End class
