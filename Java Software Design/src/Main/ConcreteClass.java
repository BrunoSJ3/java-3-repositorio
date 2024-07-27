package Main;

public class ConcreteClass extends AbstractClass {
    // properties

    // constructors

    public ConcreteClass() {

    }

    public ConcreteClass(int password) {
        super(password);
    }

    // behaviors
    @Override // isso é uma anotation
    public void sayHello() // Deve ter a mesma grafia da classe abstrata
    {
        System.out.println("Iai meu chapa");
    }

    public void originalSayHello() {
        super.sayHello(); // invocando um método da classe pai
    }

    @Override
    public void sayHi() {
        System.out.println("OI");
    }

    @Override
    public void interfaceMothod2() {
        System.out.println("metodo 2 da interface1 na ConcreteClass");
    }

}
