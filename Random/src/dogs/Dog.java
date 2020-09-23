package dogs;

public class Dog {
    //Instance Variable
    private String dogName, dogBreed;
    private int aggression, hunger, dogAge;

    //Default Constructor
    public Dog() {
        dogName = "DogX";
        dogBreed = "BreedX";
        dogAge = 0;
        aggression = 0;
        hunger = 0;
    }

    //Constructor
    public Dog(String dogName, String dogBreed, int dogAge, int aggression, int hunger) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.dogAge = dogAge;
        this.aggression = aggression;
        this.hunger = hunger;
    }

    //Method getName
    public String getName() {
        return dogName;
    }

    //Method getBreed
    public String getBreed() {
        return dogBreed;
    }

    //Method getAge
    public int getAge() {
        return dogAge;
    }

    //Method getAggression
    public int getAggression() {
        return aggression;
    }

    //Method getHunger
    public int getHunger() {
        return hunger;
    }

    //Method setName
    void setName(String dogName) {
        this.dogName = dogName;
    }

    //Method setBreed
    void setBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    //Method setAge
    void setAge(int dgAge) {
        this.dogAge = dgAge;
    }

    //Method setAggression
    void setAggression(int aggression) {
        this.aggression = aggression;
    }

    //Method setHunger
    void setHunger(int hunger) {
        this.hunger = hunger;
    }

    //Method toString
    public String toString() {
        return this.dogName + ":\nBreed: " + this.dogBreed + "\nAge:" + this.dogAge
                + "\nAggression: " + this.aggression + "\nHunger:" + this.hunger;
    }
}//End Class
