package Samples.Animal;

public class Whale extends Mammal implements Aquatic

{

    @Override
    public void swim() {
        System.out.println("Animal Nadando");

    }

    @Override
    public void born() {
        System.out.println("Animal Nascendo");

    }

    @Override
    public void die() {
        System.out.println("Animal Morrendo");

    }

    @Override
    public void eat() {
        System.out.println("Animal Comendo");

    }

    @Override
    public void grows() {
        System.out.println("Animal Nascendo");

    }

    @Override
    public void reproduces() {
        System.out.println("Baleia Reproduz");
    }

}
