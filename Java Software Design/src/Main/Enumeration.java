package Main;

public enum Enumeration

{
    // Objects
    // Enumeration ENUM_OBJECT_1 = new Enumerator(); isso não funciona
    ENUM_OBJECT_1(123, "Texto1"),
    ENUM_OBJECT_2(456, "Texto2"),
    ENUM_OBJECT_3(789, "Texto3"); // instanciando objetos dentro da própria classe do tipo enum

    // Properties
    private final int value1;
    private final String value2;

    // Constructors
    Enumeration()// por padrão ele é privado

    {
        value1 = 000;
        value2 = "Texto";
    }

    /*
     * private Enumeration(int value1, String value2)
     * 
     * {
     * this.value1 = value1;
     * // this.value2 = value2;
     * }
     */

    Enumeration(int value1)// por padrão ele é privado

    {
        this.value1 = value1;
        value2 = "Texto";
    }

    Enumeration(int value1, String value2)// por padrão ele é privado

    {
        this.value1 = value1;
        this.value2 = "Texto";
    }

    // getters, mas NÃO setters
    public int getValue1()

    {
        return value1;
    }

    public String getValue2()

    {
        return value2;
    }

    // Behaviors

}
