
package Auxiliary;

import javax.tools.Tool;

import Main.AbstractClass;
import Main.ConcreteClass;
import Main.ConcreteClass1;
import Main.ConcreteClass2;
import Main.Tools;

public class AuxiliaryTester {
    public static void main(String[] args)

    {
        System.out.println("Início do reoteiro 1");
        ConcreteClass1 cc1 = new ConcreteClass1();
        ConcreteClass2 cc2 = new ConcreteClass2(43);

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
        System.out.println("Fim do roteiro 2");
        System.out.println("----------------------------");

        // --------------------------------------------------

        System.out.println("Início do roteiro 4");
        System.out.println(ac1.INTERFACE_VAR);
        System.out.println(cc3.INTERFACE_VAR);

        AuxiliaryClass aux = new AuxiliaryClass();
        // aux.INTERFACE_VAR = true;
        System.out.println(aux.INTERFACE_VAR);
        aux.interfaceMethod1();
        System.out.println("Fim do roteiro 4");
        System.out.println("----------------------------");
        // ---------------------------------------------------
        System.out.println("Início do roteiro 6");

        /*
         * Tools t01 = new Tools();
         * Tools t02 = new Tools();
         * 
         * t01.option = 'B';
         * t02.option = 'C'; // o static tornou uma variável de classe, e não uma
         * variável de instância
         * 
         * System.out.println(t01.option);
         * System.out.println(t02.option);
         */
        /*
         * Tools.option = 'D';
         * // System.out.println(Tools.option);
         * Tools.printOption();
         */

        Tools.display(24.5f);

        double valor = Tools.sum(15, 6);
        System.out.println(valor + 100);
        System.out.println("fim do roteiro 6");
        System.out.println("------------------------");
        // -----------------------------------------
        System.out.println("Início do roteiro 7");
        // ConcreteClass2 cc4 = new ConcreteClass2(7890);
        // ConcreteClass cc5 = new ConcreteClass();
        // AbstractClass ac4 = new ConcreteClass();
    }
}
