package sorting;

import java.util.*;
import javax.swing.*;

public class SortingRoutines {
    public static void main(String[] args) {
        //Variable Decoration & Initialization
        int choice = 0, choice2 = 0, numGen = 0;
        Object[] option1 = {"Selection Sort", "Bubble Sort", "Insertion Sort", "Quick Sort", "Exit"};
        Object[] option2 = {"Ascending", "Descending", "Exit"};
        numGen = Integer.parseInt(JOptionPane.showInputDialog(null, "How many random number you wish to generate?"
                , "Generate random number", JOptionPane.QUESTION_MESSAGE));
        int[] nums = new int[numGen];
        generateRandomNum(nums);
        System.out.println("The unsorted list is:");
        printArray(nums);
        choice = JOptionPane.showOptionDialog(null, "What type of sort would you like to perform?", "Select an option"
                , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option1, option1[4]);
        choice2 = JOptionPane.showOptionDialog(null, "In what order do you want the numbers sorted", "Select an option"
                , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[2]);
        checkChoice(choice, choice2, nums);
        //Display output with short If Statement
        System.out.println("\n---------------------------------\n"
                + (choice2 == 0 ? "Performing Ascending " : "Performing Descending ")
                + (choice == 0 ? "Selection Sort"
                : choice == 1 ? "Bubble Sort" : choice == 2 ? "Insertion Sort" : "Quick Sort")
                + "\nThe sorted list is:");
        printArray(nums);
    }//End Main

    //checkChoice
    public static void checkChoice(int choice, int choice2, int[] nums) {

        switch (choice) {
            case 0 -> selectionSort(nums);
            case 1 -> bubbleSort(nums);
            case 2 -> insertionSort(nums);
            case 3 -> quickSort(nums, 0, nums.length - 1);
            case 4 -> {
                JOptionPane.showMessageDialog(null, "Exit program.");
                System.exit(0);
            }
        }

        switch (choice2) {
            case 1 -> reverse(nums, 0, nums.length - 1);
            case 2 -> {
                JOptionPane.showMessageDialog(null, "Exit program.");
                System.exit(0);
            }
        }
    }

    //generateRandomNum
    public static void generateRandomNum(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000);
        }
    }

    //PrintArray
    public static void printArray(int[] array) {
        for (int i : array)
            System.out.print(i + " ");

    }

    //reverse Method
    public static void reverse(int[] nums, int start, int end) {
        int tempNum;

        while (start < end) {
            tempNum = nums[start];
            nums[start] = nums[end];
            nums[end] = tempNum;
            start++;
            end--;
        }
    }//End reverse Method

    //selectionSort Method
    public static void selectionSort(int[] nums) {
        int smallest;
        //For Loop
        for (int i = 0; i < nums.length - 1; i++) {
            smallest = i;
            for (int index = i + 1; index < nums.length; index++)
                if (nums[index] < nums[smallest])
                    swap(nums, smallest, index);


        }
    }

    //bubbleSort Method
    public static void bubbleSort(int nums[]) {
        boolean flag = false;
        for (int pass = 1; pass < nums.length && !flag; pass++) {
            flag = true;

            for (int element = 0; element < nums.length - 1; element++) {

                if (nums[element] > nums[element + 1]) {
                    swap(nums, element, element + 1);
                    flag = false;
                }

            }
        }
    }

    //insertionSort Method
    public static void insertionSort(int[] nums) {
        int insert;

        for (int next = 1; next < nums.length; next++) {
            insert = nums[next];
            int moveItem = next;

            while (moveItem > 0 && nums[moveItem - 1] > insert) {
                nums[moveItem] = nums[moveItem - 1];
                moveItem--;
            }
            nums[moveItem] = insert;
        }
    }

    //quickSort Method
    public static void quickSort(int[] nums, int low, int high) {
        //If Statement
        if (low < high + 1) {
            int pivot = partition(nums, low, high);
            quickSort(nums, low, pivot - 1);
            quickSort(nums, pivot + 1, high);
        }
    }

    //partition Method
    public static int partition(int[] nums, int low, int high) {
        int pivot = (low + high) / 2;
        swap(nums, low, pivot);
        int i = low + 1;

        for (int j = i; j <= high; j++)
            if (nums[j] < nums[low])
                swap(nums, j, i++);

        swap(nums, low, i - 1);
        return i - 1;
    }

    //swap Method
    public static void swap(int[] nums, int i, int j) {
        int tempNum = nums[i];
        nums[i] = nums[j];
        nums[j] = tempNum;
    }
}//End Class