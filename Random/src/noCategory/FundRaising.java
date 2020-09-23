package noCategory;

import javax.swing.*;
import java.util.Arrays;

public class FundRaising {
    public static void main(String[] args) {
        //Variable Declaration & Initialization
        int donationChoice = 0, schoolChoice = 0, population = 0;
        double[][] totalSchool = new double[9][4];
        double donation = 0, firstRowTotal, secondRowTotal, thirdRowTotal, fourthRowTotal;
        //For loop to set the array to zeros
        for (double[] i : totalSchool) Arrays.fill(i, 0);
        do {
            try {
                // Ask user what school is Fundraising
                schoolChoice = Integer.parseInt(
                        JOptionPane.showInputDialog(null, "Which School is Fundraising?\n"
                                        + "     0 - Catholic Central"
                                        + "\n     1 - Holy Cross\n     2 - John Paul II\n     3 - Mother Teresa"
                                        + "\n     4 - Regina Mundi\n     5 - St Joeseph\n     6 - St Thomas Aquinas"
                                        + "\n     7 - St Mary\n     8 - Exit\n"
                                , "School", JOptionPane.PLAIN_MESSAGE));
            } catch (java.lang.NumberFormatException e) {
                System.err.println("Error Schools Choice cannot be a character\nPlease try again ");
                System.exit(0);
            }
            if (schoolChoice > 8)
                System.err.println("Error Schools Choice cannot be greater or less than the following choice"
                        + "\nPlease try again ");
            if (schoolChoice < 8) {

                try {

                    donationChoice = Integer.parseInt(
                            JOptionPane.showInputDialog(null, "What is the donation amount?\n"
                                            + "   0 - 25cents\n   1 - 50 cents\n   2 - 1 dollar\n   3 - 2 dollars"
                                    , "Donation Choice", JOptionPane.PLAIN_MESSAGE));
                } catch (java.lang.NumberFormatException e) {
                    System.err.println("Error Donation Choice cannot be a character\nPlease try again ");
                    System.exit(0);
                }

                if (donationChoice == 0)
                    donation = .25;
                else if (donationChoice == 1)
                    donation = 0.5;
                else if (donationChoice == 2)
                    donation = 1;
                else if (donationChoice == 3)
                    donation = 2;
                else {
                    System.err.println("Error Donation Choice cannot be greater or less than the following choice"
                            + "\nPlease try again ");
                    System.exit(0);
                }
                try {
                    // Ask user the population of the school
                    population = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the population?"
                            , "Population", JOptionPane.PLAIN_MESSAGE));
                } catch (java.lang.NumberFormatException e) {
                    System.err.println("Error Population cannot be a character\nPlease try again ");
                    System.exit(0);
                }

                totalSchool[schoolChoice][donationChoice] = donation * population;
            }
            firstRowTotal = 0;
            secondRowTotal = 0;
            thirdRowTotal = 0;
            fourthRowTotal = 0;
            //For loop to make the sum a each rows
            for (int count = 0; count <= totalSchool.length - 2; count++) {
                firstRowTotal += totalSchool[count][0];
                totalSchool[8][0] = firstRowTotal;
                secondRowTotal += totalSchool[count][1];
                totalSchool[8][1] = secondRowTotal;
                thirdRowTotal += totalSchool[count][2];
                totalSchool[8][2] = thirdRowTotal;
                fourthRowTotal += totalSchool[count][3];
                totalSchool[8][3] = fourthRowTotal;
            }
        } while (schoolChoice != 8);
        //Decoration
        System.out.printf("%s%n|%45s%36s%n%s%n%s"
                , "|================================================================================|"
                , "FundRaising", "|"
                , "|================================================================================|"
                , "      CathCen  HolyC   JP II  MotherT ReginaM St.Joe  St.Tom  St.Mary  TOTAL  \n\n");

        //For loop to print 4 rows
        for (int r = 0; r < 4; r++) {
            if ((r + 1) == 1)
                System.out.print("$0.25-" + "\t");
            else if ((r + 1) == 2)
                System.out.print("$0.50-" + "\t");
            else if ((r + 1) == 3)
                System.out.print("$1.00-" + "\t");
            else
                System.out.print("$2.00-" + "\t");
            //For loop to print 9 columns
            for (int c = 0; c < 9; c++) {
                System.out.print(totalSchool[c][r]);
                if (totalSchool[c][r] > 999)
                    System.out.print("\t");
                else
                    System.out.print(" \t");
            }
            //Decoration
            System.out.print("\n");
        }
        //Decoration
        System.out.print("\nTOTAL DONATIONS = " + (totalSchool[8][0] + totalSchool[8][1] + totalSchool[8][2] + totalSchool[8][3]));
    }//End Main
}//End Class

