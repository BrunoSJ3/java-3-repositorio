package Main;

public interface Interface1

{
    final Boolean INTERFACE_VAR = true;

    default void interfaceMethod1()

    {
        System.out.println("Método 1 da interface1");
    }

    public void interfaceMothod2();
}
