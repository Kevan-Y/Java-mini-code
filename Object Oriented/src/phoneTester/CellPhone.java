package phoneTester;

public class CellPhone {
    //Instance Variable
    private String carrier, type;
    private double speed, memory, data;
    private int numApps;

    //Default Constructor
    public CellPhone() {
        carrier = "";
        type = "";
        speed = 0;
        memory = 0;
        numApps = 0;
        data = 0;
    }

    //Constructor
    public CellPhone(String carrier, String type, double speed, double memory, int numApps, double data) {
        this.carrier = carrier;
        this.type = type;
        this.speed = speed;
        this.memory = memory;
        this.numApps = numApps;
        this.data = data;
    }

    //getCarrier Method
    public String getCarrier() {
        return carrier;
    }

    //getType Method
    public String getType() {
        return type;
    }

    //getSpeed Method
    public double getSpeed() {
        return speed;
    }

    //getMemory Method
    public double getMemory() {
        return memory;
    }

    //getNumApps Method
    public int getNumApps() {
        return numApps;
    }

    public double getData() {
        return data;
    }

    //setCarrier Method
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    //setType Method
    public void setType(String type) {
        this.type = type;
    }

    //setSpeed Method
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    //setMemory Method
    public void setMemory(double memory) {
        this.memory = memory;
    }

    //setNumApps Method
    public void setNumApps(int numApps) {
        this.numApps = numApps;
    }

    //setData Method
    public void setData(double data) {
        this.data = data;
    }
}//End Class
