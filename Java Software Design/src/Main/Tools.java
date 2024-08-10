package Main;

public class Tools

{
    // properties
    public static char option = 'A'; // variável de classe (só chamar o objeto sem instância)
    public char alternative = 'a'; // variável de instância (precisa instanciar esta classe)

    // behaviors
    /*
     * public static void display(String str)
     * 
     * {
     * System.out.println(str);
     * }
     * 
     * public static void display(double num)
     * 
     * {
     * System.out.println(num);
     * }
     * 
     * public static void display(float numF) // void não retorna valor
     * 
     * {
     * System.out.println(numF);
     * }
     */
    @Anotation1("Método Genérico Utilizado")
    public static <T> void display(T info) // método genérico

    {
        System.out.println(info);
    }

    public static double sum(double num1, double num2)

    {
        double result = num1 + num2;
        System.out.println(result);
        return result;
    }

    // Behaviors roteiro 6
    @Anotation2
    public static void printOption()

    {
        System.out.println(option);
    }

    public static void printAlternate()

    {
        char altern = 'z';
        System.out.println(altern);
        System.out.println(option);
        // printOP();
        // System.out.println(alternative);
    }

    public void printOP()

    {
        System.out.println(option);
        // printOption();
    }

}
