package Main;

public class MainTester

{
    public static void main(String[] args) {
        System.out.println("inicio do roteiro 1");

        ConcreteClass1 cc1 = new ConcreteClass1();
        ConcreteClass2 cc2 = new ConcreteClass2();

        cc1.setPassword(5555);
        cc2.setPassword(6666);

        System.out.println(cc1.getPassword());
        System.out.println(cc2.getPassword());

        System.out.println("Fim do roteiro 1");
        System.out.println("--------------------------");
        // -----------------------------------------

        System.out.println("inicio do roteiro 2");

        AbstractClass ac1 = new ConcreteClass();
        ConcreteClass cc3 = new ConcreteClass();

    }
}
