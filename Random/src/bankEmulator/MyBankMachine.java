package bankEmulator;

import javax.swing.*;

public class MyBankMachine {
    public static void main(String[] args) {
        //Variable Declaration & Initialization
        double deposit, balance = 0, withdraw, oldBalance;
        int choice, optionDailyInterest;
        boolean redo = true;
        JTextField interest = new JTextField();
        JTextField day = new JTextField();
        Object[] inputFields = {"Interest (%)", interest, "Day", day};
        Object[] options = {"Deposit", "Withdraw", "Current Money", " Daily Interest", "Cancel"};
        String[] listBankName = {"Royal Bank of Canada (RBC)", "Toronto-Dominion Bank (TD)"
                , "Bank of Nova Scotia (Scotiabank)", "Bank of Montreal (BMO)"
                , "Canadian Imperial Bank of Commerce (CIBC)"};
        Object bankName = "";
        try {
            bankName = JOptionPane.showInputDialog(null
                    , "Welcome to MyBankMachine\n This program simulate a real ATM\nSelect your bank: "
                    , "Set bank name", JOptionPane.PLAIN_MESSAGE, null, listBankName, "Royal Bank of Canada (RBC)");
            if (bankName == null) //If Statement to check if user click on cancel
            {
                JOptionPane.showMessageDialog(null
                        , "Exit Program.", "Exit", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }//End If Statement
            balance = Double.parseDouble(JOptionPane.showInputDialog(null
                    , "Set your starting balance", "Set balance", JOptionPane.QUESTION_MESSAGE));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null
                    , "Error input balance, Exit Program.", "Error Input", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null
                    , "Exit Program.", "Exit", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        Atm bank = new Atm(String.valueOf(bankName), balance);
        while (redo) {
            choice = JOptionPane.showOptionDialog(null
                    , "Welcome to " + bank.getBankName(), bank.getBankName()
                    , JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[4]);
            switch (choice) {
                case 0:

                    try {
                        deposit = Double.parseDouble(JOptionPane.showInputDialog(null
                                , "Please enter your amount of deposit"
                                        + "\n( note: Deposit cannot be greater than 200 )"
                                , "Deposit", JOptionPane.QUESTION_MESSAGE));
                        bank.deposit(deposit);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null
                                , "Error of input", "Error", JOptionPane.ERROR_MESSAGE);
                    } catch (NullPointerException ignored) {
                    }
                    break;
                case 1:

                    try {
                        withdraw = Double.parseDouble(JOptionPane.showInputDialog(null
                                , "Please enter your amount of withdraw\nYour balance: " + bank.getMoney()
                                , "Withdraw", JOptionPane.QUESTION_MESSAGE));
                        bank.withdraws(withdraw);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null
                                , "Error of input", "Error", JOptionPane.ERROR_MESSAGE);
                    } catch (NullPointerException ignored) {
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null
                            , "Your balance: " + bank.getMoney() + " CAD$"
                            , "Account info (Balance)", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    interest.setText("");
                    day.setText("");
                    optionDailyInterest = JOptionPane.showConfirmDialog(null, inputFields, "Daily interest"
                            , JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    oldBalance = bank.getMoney();
                    if (optionDailyInterest == JOptionPane.OK_OPTION)//If Statement to check if user click OK or Cancel
                    {
                        try {
                            JOptionPane.showMessageDialog(null, "You will have " + (double) Math.round((bank.dailyInterest
                                    (Double.parseDouble(interest.getText())
                                            , Integer.parseInt(day.getText())) - oldBalance) * 100) / 100
                                    + " CAD$ with a interest of " + interest.getText()
                                    + "% in " + day.getText() + " day(s)."
                                    + "Your new Balance: " + bank.getMoney() + " CAD$");
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null
                                    , "Error of input", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null
                            , "Program exit", "Exit", JOptionPane.PLAIN_MESSAGE);
                    System.exit(0);
                    break;
            }
        }
    }//End Main
}//End Class