package Auxiliary;

import Main.Interface1;
import Main.Interface2;

public class AuxiliaryClass implements Interface1, Interface2

{
    @Override
    public void interfaceMethod1() {
        System.out.println("Outra coisa");
    }

    @Override
    public void interfaceMothod2() {
        System.out.println("Método 2 da interface1");

    }
}
