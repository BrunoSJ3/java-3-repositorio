package Samples.Animal;

public class Shark extends Fish

{
    // specific properties
    private int numverOfFins;

    // constructors
    public Shark()

    {

    }

    public Shark(String scentificName, String PopularName, int age, Double mass, int numverOfFins)

    {
        super(scentificName, PopularName, age, mass);
        this.numverOfFins = numverOfFins;
    }

    // specific behaviors
    @Override
    public void born() {
        System.out.println("Animal Nascendo");

    }

    @Override
    public void eat() {
        System.out.println("Animal Comendo");
    }

    @Override
    public void grows() {
        System.out.println("Animal Crescendo");
    }

    @Override
    public void reproduces() {
        System.out.println("Animal Reproduzindo");
    }

    @Override
    public void die() {
        System.out.println("Animal Morrendo");
    }

    // Geters & setters
    public int getNumverOfFins() {
        return numverOfFins;
    }

    public void setNumverOfFins(int numverOfFins) {
        this.numverOfFins = numverOfFins;
    }

    // Ambientes

    @Override
    public void swim() {
        System.out.println("Tubarão nadando");
    }

}
