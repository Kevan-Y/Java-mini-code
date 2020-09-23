package bankEmulator;

import java.math.*;
import javax.swing.*;

public class Atm {
    //Instance Variable
    private String bankName;
    private double balance;

    //Default Constructor
    public Atm() {
        this.bankName = "";
        this.balance = 0;
    }

    //Constructor
    public Atm(String bankName, double money) {
        this.bankName = bankName;
        this.balance = money;
    }

    //Method setMoney
    void setMoney(double money) {
        this.balance = money;
    }

    //Method setBankName
    void setBankName(String bankName) {
        this.bankName = bankName;
    }

    //Method getBankName
    public String getBankName() {
        return bankName;
    }

    //Method getMoney
    public double getMoney() {
        return balance;
    }

    //Deposit Method
    public void deposit(double deposit) {
        //If Statement to check if user deposit more than 200 $
        if (deposit > 200)
            JOptionPane.showMessageDialog(null
                    , " You cannot deposit more than 200 CAD$", "Warning", JOptionPane.WARNING_MESSAGE);
        else {
            //Round two decimal place
            BigDecimal twoDecimalDigit = new BigDecimal(this.balance + deposit);
            twoDecimalDigit = twoDecimalDigit.setScale(2, RoundingMode.HALF_UP);
            this.setMoney(twoDecimalDigit.doubleValue());
            JOptionPane.showMessageDialog(null
                    , "Deposit: " + deposit + " CAD$\nYour new balance: " + this.balance + " CAD$"
                    , "Account info (Deposit)", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //Withdraws Method
    public void withdraws(double withdraw) {
        //If Statement to check if user withdraw more than it show on the balance
        if ((this.balance - withdraw) < 0.00)
            JOptionPane.showMessageDialog(null
                    , "Sorry in you have only " + this.balance
                            + " CAD$\nyou cannot withdraw more than your balance"
                    , "Warning", JOptionPane.WARNING_MESSAGE);
        else {
            //Round two decimal place
            BigDecimal twoDecimalDigit = new BigDecimal(this.balance - withdraw);
            twoDecimalDigit = twoDecimalDigit.setScale(2, RoundingMode.HALF_UP);
            this.setMoney(twoDecimalDigit.doubleValue());
            JOptionPane.showMessageDialog(null
                    , "Withdraw: " + withdraw + "CAD$\nYour new balance: " + this.balance + " CAD$"
                    , "Account info (Withdraw)", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //DailyInterest Method
    public double dailyInterest(double interest, int day) {
        //Round two decimal place
        BigDecimal twoDecimalDigit = BigDecimal.valueOf((this.balance) * Math.pow((1 + ((interest / 100) / 365)), day));
        twoDecimalDigit = twoDecimalDigit.setScale(2, RoundingMode.HALF_UP);
        this.setMoney(twoDecimalDigit.doubleValue());
        return twoDecimalDigit.doubleValue();
    }
}//End Class