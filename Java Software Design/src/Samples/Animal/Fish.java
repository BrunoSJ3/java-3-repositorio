package Samples.Animal;

public abstract class Fish extends Chordate implements Aquatic

{
    // properties
    // constructors
    public Fish()

    {

    }

    public Fish(String scientificName, String popularName, int age, double mass) {
        super(scientificName, popularName, age, mass);

    }

    // behaviors
    @Override
    public void swim() {
        System.out.println("Peixe nadando");
    }
}
