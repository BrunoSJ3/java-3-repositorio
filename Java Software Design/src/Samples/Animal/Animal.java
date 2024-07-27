package Samples.Animal;

public abstract class Animal

{
    // properties
    private String scentificName;
    private String popularName;
    private int age;
    private double mass;

    // behavious
    public abstract void born();

    {

    }

    public abstract void eat();

    {
        
    }

    public abstract void grows();

    {

    }

    public abstract void reproduces();

    {

    }

    public abstract void die();

    {

    }

    // getters and setters
    public String getScentificName() {
        return scentificName;
    }

    public void setScentificName(String scentificName) {
        this.scentificName = "Galeocerdo Cuvier";
    }

    public String getPopularName() {
        return popularName;
    }

    public void setPopularName(String popularName) {
        this.popularName = "Tubarão Tigre";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = 20;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = 250;
    }

}
