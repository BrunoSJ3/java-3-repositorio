package Main;

public class ConcreteClass extends AbstractClass
{
    //properties
    public int password = 3333;

    //behaviors
    @Override //isso é uma anotation
    public void sayHello() //Deve ter a mesma grafia da classe abstrata
    {
        System.out.println("Iai meu chapa");
    }

    public void originalSayHello()
    {
        super.sayHello(); // invocando um método da classe pai
    }
    
    @Override
    public void sayHi()
    {
        System.out.println("OI");
    }

}
