package cars;

public class Car {
    //Instance Variable
    private String material, model, color, fuel;
    private int year;
    private double price;

    //Default Constructor
    public Car() {
        this.material = "Boron steel";
        this.model = "Tesla Model x";
        this.year = 2014;
        this.price = 130000.99;
        this.color = "White";
        this.fuel = "Electric";
    }

    //Constructor
    public Car(String make, String model, String year, String price) {
        this.material = make;
        this.model = model;
        this.year = Integer.parseInt(year);
        this.price = Double.parseDouble(price);
        this.color = "Black";
        this.fuel = "Diesel";
    }

    //Constructor
    public Car(String make, String model, String year, String price, String color, String fuel) {
        this.material = make;
        this.model = model;
        this.year = Integer.parseInt(year);
        this.price = Double.parseDouble(price);
        this.color = color;
        this.fuel = fuel;
    }

    //Method getColor
    public String getColor() {
        return color;
    }

    //Method getMake
    public String getMake() {
        return material;
    }

    //Method getModel
    public String getModel() {
        return model;
    }

    //Method getPrice
    public double getPrice() {
        return price;
    }

    //Method getfuel
    public String getfuel() {
        return fuel;
    }

    //Method getYear
    public int getYear() {
        return year;
    }

    //Method setColor
    void setColor(String color) {
        this.color = color;
    }

    //Method setMake
    void setMake(String material) {
        this.material = material;
    }

    //Method setModel
    void setModel(String model) {
        this.model = model;
    }

    //Method setPrice
    void setPrice(double price) {
        this.price = price;
    }

    //Method setFuel
    void setFuel(String fuel) {
        this.fuel = fuel;
    }

    //Method setYear
    void setYear(int year) {
        this.year = year;
    }

    //Honk Function
    public String honk() {
        if (this.year <= 2000)
            return "bip bip";
        else
            return "Honk Hong";
    }

    //Method toString
    public String toString() {
        return "\nYour car is made of: " + this.material + "\nCar model: " + this.model
                + "\nYear of car: " + this.year + "\nPrice of the car: " + this.price + "£"
                + "\nColor of the car: " + this.color + "\nKind of fuel: " + this.fuel + "\nHonk:" + this.honk() + "\n\n";
    }
}//End Class