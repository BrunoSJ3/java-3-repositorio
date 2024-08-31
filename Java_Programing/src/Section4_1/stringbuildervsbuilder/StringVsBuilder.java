package Section4_1.stringbuildervsbuilder;

public class StringVsBuilder

{
    public static void main(String[] args)

    {
        StringBuilder sbr = new StringBuilder("Teste de imutabilidade");
        String str = new String("Teste de imutabilidade");

        System.out.println("Endereço da String Builder: " + sbr.hashCode());
        System.out.println("Endereço da String Normal: " + str.hashCode());

        sbr.replace(0, sbr.length(), "Hello World");
        // str.replace("Teste de imutabilidade", "Hello World");
        // como não mudou então:
        str = "Hello World";

        System.out.println(sbr);
        System.out.println(str);

        System.out.println("Endereço da String Builder: " + sbr.hashCode());
        System.out.println("Endereço da String Normal: " + str.hashCode());

    }
}
