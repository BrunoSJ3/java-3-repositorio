package Samples.Animal;

public class Frog extends Amphibiam {

    @Override
    public void born() {
        System.out.println("Sapo Nascendo");

    }

    @Override
    public void die() {
        System.out.println("Sapo morrendo");

    }

    @Override
    public void eat() {
        System.out.println("Sapo comendo");

    }

    @Override
    public void grows() {
        System.out.println("Sapo Crescendo");

    }

    @Override
    public void reproduces() {
        System.out.println("Sapo reproduzindo");

    }

    @Override
    public void swim() {
        System.out.println("Sapo nadando");

    }

    @Override
    public void walk() {
        System.out.println("Sapo andando (pulando)");

    }

}
