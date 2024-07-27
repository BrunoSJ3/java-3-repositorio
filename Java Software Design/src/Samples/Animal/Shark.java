package Samples.Animal;

public class Shark extends Fish

{
    // properties
    private int numverOfFins;

    // behaviors
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

}
