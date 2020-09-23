package lemur;

import java.util.*;
import javax.swing.*;

public class LemurDatabase {
    public static void main(String[] args) {
        //Variable Declaration & Initialization
        Random rand = new Random();
        ArrayList<String> list = new ArrayList<>();
        int numOfLemur, raceLemur;
        numOfLemur = Integer.parseInt(JOptionPane.showInputDialog(null
                , "How many Lemurs do you want to add to the list?", "Lemur", JOptionPane.QUESTION_MESSAGE));
        //For Loop ask what kind of Lemurs
        for (int i = 0; i < numOfLemur; i++) {
            raceLemur = Integer.parseInt(JOptionPane.showInputDialog(null
                    , "Please enter the type of Lemur to add:"
                            + "\n1 - Tree Lemur\n2 - Desert Lemur\n3 - Jungle Lemur"
                    , "Types of Lemur", JOptionPane.QUESTION_MESSAGE));
            //Switch Statement check what kind the user select
            switch (raceLemur) {
                case 1 -> {
                    TreeLemur treeL = new TreeLemur
                            (rand.nextInt(20) + 1, 7 + (10 - 7) * rand.nextDouble(), rand.nextBoolean());
                    list.add(treeL.toString());
                    System.out.println("Creating Tree Lemur.");
                }
                case 2 -> {
                    DesertLemur desertL = new DesertLemur
                            (rand.nextInt(20) + 1, 7 + (10 - 7) * rand.nextDouble(), rand.nextBoolean());
                    list.add(desertL.toString());
                    System.out.println("Creating Desert Lemur.");
                }
                case 3 -> {
                    JungleLemur jungleL = new JungleLemur
                            (rand.nextInt(20) + 1, 7 + (10 - 7) * rand.nextDouble(), rand.nextBoolean());
                    list.add(jungleL.toString());
                    System.out.println("Creating Jungle Lemur.");
                }
            }
        }
        System.out.println("Displaying the list of Lemurs:\n-------------------------------------------");

        for (String printList : list)
            System.out.println(printList);

    }//End Main
}//End Class
