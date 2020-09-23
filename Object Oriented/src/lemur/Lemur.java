package lemur;

public class Lemur extends Mammal {
    //Instance Variable
    private String coat, location, classification;

    //Default Constructor
    public Lemur() {
        super();
        location = "";
        classification = "";
        coat = "";
    }

    //Constructor
    public Lemur(final int age, final double weight, final boolean gender) {
        super(age, weight, gender);
        location = "Madagascar";
        classification = "Prosimian";
        coat = "Fur";
    }

    //getLocation Method
    public String setLocation() {
        return location;
    }

    //getClassification Method
    public String setClassification() {
        return classification;
    }

    //getCoat Method
    public String getCoat() {
        return coat;
    }

    //setLocation Method
    public void setLocation(String location) {
        this.location = location;
    }

    //setClassification Method
    public void setClassification(String classification) {
        this.classification = classification;
    }

    //setCoat Method
    public void setCoat(String coat) {
        this.coat = coat;
    }

    //ToString Method
    public String toString() {
        if (super.getGender())
            return super.toString() + "Location = " + location
                    + "\nClassification = " + classification + "\nCoat = " + coat + "\n";
        else
            return super.toString() + "Location = " + location
                    + "\nClassification = " + classification + "\nCoat = " + coat + "\nFemale Lemur = Dominant Role\n";

    }
}//End Class