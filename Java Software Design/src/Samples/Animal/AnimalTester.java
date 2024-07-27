package Samples.Animal;

public class AnimalTester

{

    public static void main(String[] args)

    {
        Shark shark = new Shark();

        shark.getScentificName();
        shark.getPopularName();
        shark.getAge();
        shark.getMass();
        shark.setNumverOfFins(2);

        System.out.println(shark.getScentificName());
        System.out.println(shark.getPopularName());
        System.out.println(shark.getAge());
        System.out.println(shark.getMass());

        shark.born();
        shark.die();
        shark.eat();
        shark.grows();
        shark.reproduces();
        shark.swim();

    }

}
