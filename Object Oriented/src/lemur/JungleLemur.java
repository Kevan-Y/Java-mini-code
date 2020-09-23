package lemur;

public class JungleLemur extends Lemur {
    //Instance Variable
    private final String food;
    private final String colour;
    private final String packSize;

    //Default Constructor
    public JungleLemur() {
        super();
        food = "";
        colour = "";
        packSize = "";
    }

    //Constructor
    public JungleLemur(final int age, final double weight, final boolean gender) {
        super(age, weight, gender);
        food = "Mice, Snails, and Insects";
        colour = "Black and Blue";
        packSize = "Small Groups";
    }

    //ToString Method
    public String toString() {
        return super.toString() + "Food = " + food + "\nColour = " + colour + "\nPack Size = " + packSize + "\n";
    }
}//End Class
