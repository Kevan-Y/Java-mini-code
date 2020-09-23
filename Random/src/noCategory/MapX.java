package noCategory;

import javax.swing.*;

public class MapX {
    public static void main(String[] arg) {
        //Variable Declaration & Initialization
        int x = 0, y = 0, again = 0, generation = 1;
        int[][] map;
        JPanel myPanel = new JPanel();
        JTextField hField = new JTextField(5);
        JTextField vField = new JTextField(5);
        //JPanel configuration
        myPanel.add(new JLabel("Your grid is"));
        myPanel.add(hField);
        myPanel.add(Box.createHorizontalStrut(1));
        myPanel.add(new JLabel("by "));
        myPanel.add(vField);
        //Variable
        int coordinate = JOptionPane.showConfirmDialog(null, myPanel,
                "Grid Dimension", JOptionPane.OK_CANCEL_OPTION);
        if (coordinate == JOptionPane.OK_OPTION) {
            try {
                map = new int[Integer.parseInt(hField.getText())][Integer.parseInt(vField.getText())];
                //Decoration
                System.out.printf("%s%n|%30s%24s%n%s%n"
                        , "|=====================================================|"
                        , "Mapping X", "|"
                        , "|=====================================================|");
                do {
                    while (again == 0) {
                        x = Integer.parseInt(JOptionPane.showInputDialog(null
                                , "Enter your first X-coordinate [x,y] of a grid of " + map.length + " by " + map[0].length
                                , "X-coordinate", JOptionPane.QUESTION_MESSAGE));
                        y = Integer.parseInt(JOptionPane.showInputDialog(null
                                , "Enter your first Y-coordinate [" + x + ",y] of a grid of " + map.length + " by " + map[0].length
                                , "Y-coordinate", JOptionPane.QUESTION_MESSAGE));
                        again++;
                        try {
                            map[x - 1][y - 1] = 1;
                        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                            System.err.print("\nYour coordinate is out of grid\nPlease enter the right coordinate of a grid of "
                                    + map.length + " by " + map[0].length + "\n");
                            again = 0;
                        }
                    }
                    //Decoration
                    System.out.printf("%s%n", "Your input [" + x + "," + y + "], Generation " + generation);
                    //Nested Loop
                    for (int[] i : map) {
                        for (int j : i) {
                            if (j == 0)
                                System.out.print("◻");
                            else
                                System.out.print("⬛");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    again = 0;
                    generation++;
                } while (JOptionPane.showInputDialog(null
                        , "If you want to put another star press 1\nOr press any other key to exist or click to the cancel button"
                        , "Again or Exist", JOptionPane.PLAIN_MESSAGE).equals("1"));
            } catch (java.lang.NumberFormatException e) {
                System.err.print("Wrong input, your input can only be digital integer number");
                System.exit(0);
            } catch (java.lang.NullPointerException e) {
                System.exit(0);
            }
        } else
            System.exit(0);

    }//End Main
}//End Class

