package Samples.Animal;

public class Cow extends Mammal implements Terrestrial

{

    @Override
    public void born() {
        System.out.println("Vaca nascendo");

    }

    @Override
    public void die() {
        System.out.println("Vaca morrendo");
    }

    @Override
    public void eat() {
        System.out.println("Vaca comendo");
    }

    @Override
    public void grows() {
        System.out.println("Vaca nascendo");
    }

    @Override
    public void reproduces() {
        System.out.println("Vaca reproduz");
    }

    @Override
    public void walk() {
        System.out.println("Vaca andando");

    }

}
