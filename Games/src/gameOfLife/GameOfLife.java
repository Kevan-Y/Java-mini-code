package gameOfLife;

import java.util.*;
import javax.swing.*;

public class GameOfLife {
    public static void main(String[] args) {
        //Variable Declaration & Initialization
        Random rand = new Random();
        int[][] cells = new int[20][20];
        int[][] futureCells = new int[20][20];
        int newCells = 1, x, y, numbCellsStart = 0, generation = 0, aliveNeighbour;
        //Try and catch
        try {
            numbCellsStart = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Welcome to the game of life !"
                                    + "\nPlease enter how many cells you wish to start the game with."
                            , "Number of Cells ", JOptionPane.QUESTION_MESSAGE));
        } catch (java.lang.NumberFormatException e) {
            System.err.println("Error cells number cannot be a character\nPlease try again ");
            System.exit(0);
        }//End Try and catch
        //Do While to initial the number of cells alive
        do {
            x = rand.nextInt(cells.length);
            y = rand.nextInt(cells[x].length);
            //If Statement to check if the cells are death
            if (cells[x][y] == 0) {
                cells[x][y] = 1;
                newCells++;
            }//End if Statement
        } while (newCells <= numbCellsStart);//End Do While
        System.out.println("\n-------Generation " + generation + "-------");
        //For loop to print the grid
        for (int[] cell : cells) {
            //For loop
            for (int i : cell) {
                if (i == 0) {
                    System.out.print("◻");
                } else {
                    System.out.print("⬛");
                }//End If Statement
            }//End for loop
            System.out.println();
        }//End for loop
        System.out.println();
        //Do while to keep generate when press 1
        try {
            while (JOptionPane.showInputDialog(null, "Press 1 to advance generation\nPress any key to exit"
                    , "Generation " + generation, JOptionPane.PLAIN_MESSAGE).equals("1")) {
                //For Loop
                for (int h = 1; h < futureCells.length - 1; h++) {
                    //For Loop
                    for (int v = 1; v < futureCells.length - 1; v++) {
                        aliveNeighbour = 0;
                        //For loop to make the sum a the rows
                        for (int i = -1; i <= 1; i++)
                            //For loop to make the sum a the columns
                            for (int j = -1; j <= 1; j++)
                                aliveNeighbour += cells[h + i][v + j];
                        //Substrate itself
                        aliveNeighbour -= cells[h][v];
                        //Cell dies to lonely
                        if ((cells[h][v] == 1) && (aliveNeighbour < 2))
                            futureCells[h][v] = 0;
                            //Cell dies to over population
                        else if ((cells[h][v] == 1) && (aliveNeighbour > 3))
                            futureCells[h][v] = 0;
                            //Cell born
                        else if ((cells[h][v] == 0) && (aliveNeighbour == 3))
                            futureCells[h][v] = 1;
                            //Same
                        else
                            futureCells[h][v] = cells[h][v];

                    }//End for loop
                } //End for loop
                generation++;
                //Decoration
                System.out.println("\n-------Generation " + generation + "-------");
                //For loop to print the new grid
                for (int[] futureCell : futureCells) {
                    //For loop
                    for (int i : futureCell) {
                        //If Statement
                        if (i == 0) {
                            System.out.print("◻");
                        } else {
                            System.out.print("⬛");
                        }//End If Statement
                    } //End for loop
                    System.out.println();
                }//End for loop
                cells = futureCells;
            }//End  while
        } catch (java.lang.NullPointerException e) {
            System.out.printf("%n%22S", "End of Generation");
            System.exit(0);
        }
    }//End main
}//End class


