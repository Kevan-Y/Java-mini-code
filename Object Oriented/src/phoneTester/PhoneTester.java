package phoneTester;

import javax.swing.*;

public class PhoneTester {
    public static void main(String[] args) {
        //Variables Declaration & Initialization
        String carrier, type;
        double speed, memory, data;
        int numApps;
        carrier = JOptionPane.showInputDialog("What is your carrier?");
        type = JOptionPane.showInputDialog("What is your type of phone?");
        speed = Double.parseDouble(JOptionPane.showInputDialog("What is your speed of phone?"));
        memory = Double.parseDouble(JOptionPane.showInputDialog(" What is the capacity of the phone?"));
        numApps = Integer.parseInt(JOptionPane.showInputDialog("How many number of apps?"));
        data = Double.parseDouble(JOptionPane.showInputDialog(" Phone data?"));
        CellPhone phone1 = new CellPhone(carrier, type, speed, memory, numApps, data);//Object
        System.out.println("Carrier = " + phone1.getCarrier());
        System.out.println("Type of phone = " + phone1.getType());
        System.out.println("Speed of phone = " + phone1.getSpeed() + " Ghz");
        System.out.println("Memory = " + phone1.getMemory() + " Gb");
        System.out.println("Number of Apps = " + phone1.getNumApps());
        System.out.println("Data = " + phone1.getData() + " mb");
    }//End Main
}//End Class