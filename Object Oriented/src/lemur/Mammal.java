package lemur;

public class Mammal {
    //Instance Variable
    private int age;
    private double weight;
    boolean gender;

    //Default Constructor
    public Mammal() {
        age = 0;
        weight = 0;
        gender = true;
    }

    //Constructor
    public Mammal(final int age, final double weight, final boolean gender) {
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    //getAge Method
    public int getAge() {
        return age;
    }

    //getWeight Method
    public double getWeight() {
        return weight;
    }

    //getGender Method
    public boolean getGender() {
        return gender;
    }

    //setAge Method
    public void setAge(int age) {
        this.age = age;
    }

    //setWeight Method
    public void setWeight(double weight) {
        this.weight = weight;
    }

    //setGender Method
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    //toString
    public String toString() {
        if (gender)
            return "Age = " + age + "\nWeight = " + (double) Math.round(weight * 100) / 100 + "\nGender = Male"
                    + "\n";
        else
            return "Age = " + age + "\nWeight = " + (double) Math.round(weight * 100) / 100 + "\nGender = Female"
                    + "\n";

    }
}//End Class
