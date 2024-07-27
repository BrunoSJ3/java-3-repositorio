
package Auxiliary;

import Main.AbstractClass;
import Main.ConcreteClass;
import Main.ConcreteClass1;
import Main.ConcreteClass2;

public class AuxiliaryTester {
    public static void main(String[] args) {
        System.out.println("Início do reoteiro 1");
        ConcreteClass1 cc1 = new ConcreteClass1();
        ConcreteClass2 cc2 = new ConcreteClass2();

        cc1.setPassword(5555);
        cc2.setPassword(6666);
        System.out.println(cc2.getPassword());
        System.out.println(cc1.getPassword());
        System.out.println("Fim do reoteiro 1");
        System.out.println("---------------------------");
        // --------------------------------------

        System.out.println("Inicio do reoteiro 2");

        AbstractClass ac1 = new ConcreteClass();
        ConcreteClass cc3 = new ConcreteClass();

        System.out.println(ac1.password);
        ac1.sayHello();
        cc3.sayHello();

        // ac1.originalSayHello();
        cc3.originalSayHello();
        ac1.sayHi();
        cc3.sayHi();
    }
}
