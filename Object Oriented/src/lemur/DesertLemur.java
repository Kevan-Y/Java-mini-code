package lemur;

public class DesertLemur extends Lemur {
    //Instance Variable
    private final String food;
    private final String colour;

    //Default Constructor
    public DesertLemur() {
        super();
        food = "";
        colour = "";
    }

    //Constructor
    public DesertLemur(final int age,final double weight,final boolean gender) {
        super(age, weight, gender);
        food = "Cacti";
        colour = "White";
    }

    //ToString Method
    public String toString() {
        return super.toString() + "Food = " + food + "\nColour = " + colour + "\nBaby Death Rate = 0.66\n";
    }
}//End Class
