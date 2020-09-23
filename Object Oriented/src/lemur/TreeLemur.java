package lemur;

public class TreeLemur extends Lemur {
    //Instance Variable
    private final String food;
    private final String colour;
    private final String packSize;

    //Default Constructor
    public TreeLemur() {
        super();
        food = "";
        colour = "";
        packSize = "";
    }

    //Constructor
    public TreeLemur(int age, double weight, boolean gender) {
        super(age, weight, gender);
        food = "Fruit";
        colour = "Red";
        packSize = "Large Groups";
    }

    //toString Method
    public String toString() {
        return super.toString() + "Food = " + food + "\nColour = " + colour + "\nPack Size = " + packSize + "\n";
    }
}//End Class
