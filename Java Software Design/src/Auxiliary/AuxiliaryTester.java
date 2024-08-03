
package Auxiliary;

import javax.tools.Tool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
import Main.AbstractClass;
import Main.ConcreteClass;
import Main.ConcreteClass1;
import Main.ConcreteClass2;
import Main.Tools;
import Main.Enumeration;
import Main.ImmutableClass;
import Main.Register;
import Main.GenericClass1;
*/
import Main.*; // importa tudo que está comentado acima. Desligue para ver o que o código está importando

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

        System.out.println("fim do roteiro 7");
        System.out.println("------------------------");
        // -----------------------------------------
        System.out.println("Início do roteiro 8");
        // Enumeration ENUM_OBJECT_1 = new Enumerator(); //não é possível isso
        Enumeration test = Enumeration.ENUM_OBJECT_1;
        System.out.println(test);
        System.out.println(Enumeration.ENUM_OBJECT_2);

        // Enumeration.ENUM_OBJECT_1.value1 = 100;
        // System.out.println(test.value1);
        System.out.println(Enumeration.ENUM_OBJECT_1);
        System.out.println(Enumeration.ENUM_OBJECT_1.getValue1());
        System.out.println(Enumeration.ENUM_OBJECT_1.getValue2());
        System.out.println(Enumeration.ENUM_OBJECT_2);
        System.out.println(Enumeration.ENUM_OBJECT_2.getValue1());
        System.out.println(Enumeration.ENUM_OBJECT_2.getValue2());
        System.out.println(Enumeration.ENUM_OBJECT_3);
        System.out.println(Enumeration.ENUM_OBJECT_3.getValue1());
        System.out.println(Enumeration.ENUM_OBJECT_3.getValue2());

        for (int i = 0; i < Enumeration.values().length; i++)

        {
            System.out.println(Enumeration.values()[i]);
        }

        for (Enumeration enumTemp : Enumeration.values()) // foreach

        {
            System.out.println(enumTemp);
            System.out.println(enumTemp.getValue1());
            System.out.println(enumTemp.getValue2());
        }

        System.out.println("fim do roteiro 8");
        System.out.println("------------------------");
        // -----------------------------------------
        System.out.println("Início do roteiro 9");

        // todo esse código permite que a lista seja mutável, que perde o propósito da
        // classe imutável, então deverá ter alterações.

        List<String> habitat = new ArrayList<>();
        /*
         * habitat.add("Florestas Tropicais");
         * habitat.add("Florestas Deciduas");
         * habitat.add("Bosques de arbustos");
         * habitat.add("Terra firme");
         * habitat.add("Savanas");
         */

        habitat.addAll(Arrays.asList("Florestas Tropicais", "Florestas Deciduas", "Bosques de arbustos", "Terra firme",
                "Savanas"));
        ImmutableClass ic1 = new ImmutableClass("Mustela putorius", "furão", 4, 2.5, habitat);

        System.out.println(ic1);
        System.out.println(ic1.getHabitat());

        habitat.clear();
        habitat.add("Oceano");
        ImmutableClass ic2 = new ImmutableClass("Galeocerdo cuvier", "Tubarão tigre", 20, 250, habitat);
        System.out.println(ic2);

        System.out.println("fim do roteiro 9");
        System.out.println("------------------------");
        // -----------------------------------------
        System.out.println("Início do roteiro 10");

        List<String> habitat2 = new ArrayList<>();

        habitat2.addAll(Arrays.asList("Florestas Tropicais", "Florestas Deciduas", "Bosques de arbustos", "Terra firme",
                "Savanas"));

        Register reg1 = new Register("Mustela putorius", "furão", 4, 2.5, habitat2);

        habitat2.add("Oceanos");
        System.out.println(reg1);

        System.out.println("fim do roteiro 10");
        System.out.println("------------------------");
        // -----------------------------------------
        System.out.println("Início do roteiro 11");

        /*
         * GenericClass1 gc1 = new GenericClass1();
         * System.out.println(gc1.getPassword());
         * gc1.setPassword(6666);
         * Object password = (int) gc1.getPassword();
         * password = (int) password + 1111;
         * System.out.println(password);
         * gc1.setPassword("SENHA");
         * System.out.println(gc1.getPassword());
         */

        GenericClass1<String> gc1 = new GenericClass1<>();
        gc1.setPassword("senha");
        System.out.println(gc1.getPassword());

        GenericClass1<Integer> gc2 = new GenericClass1<>(); // as memórias de primi
        gc2.setPassword(6666);
        System.out.println(gc2.getPassword());

        GenericClass2<Integer, String> gc3 = new GenericClass2<>();
        gc3.setPassword(7777);
        gc3.setDescription("Um texto qualquer");
        System.out.println(gc3.getPassword());
        System.out.println(gc3.getDescription());
    }
}
