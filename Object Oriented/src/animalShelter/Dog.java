package animalShelter;

public class Dog {
    //Instance Variable
    private int age;
    private double weight;
    private String name, breed;

    //Default Constructor
    public Dog() {
        name = "";
        breed = "";
        age = 0;
        weight = 0;
    }

    //Constructor
    public Dog(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    //getName Method
    public String getName() {
        return name;
    }

    //getBreed Method
    public String getBreed() {
        return breed;
    }

    //getAge Method
    public int getAge() {
        return age;
    }

    //getWeight Method
    public double getWeight() {
        return weight;
    }

    //setName Method
    public void setName(String name) {
        this.name = name;
    }

    //setBreed Method
    public void setBreed(String breed) {
        this.breed = breed;
    }

    //setAge Method
    public void setAge(int age) {
        this.age = age;
    }

    //setWeight Method
    public void setWeight(double weight) {
        this.weight = weight;
    }

    //toString Method
    public String toString() {
        return "Name = " + name + "\nBreed = " + breed + "\nAge = " + age + "\nWeight = " + weight + "\n\n";
    }
}//End class