package Section4_1.stringbuildervsbuilder;

public class StringBuilderDemo

{
    public static void main(String[] args)

    {
        StringBuilder sbr = new StringBuilder("Aprendendo Java com a Oracle");
        System.out.println(sbr);

        System.out.println(sbr.reverse()); // permanece alterado

        sbr.reverse();
        System.out.println(sbr);

        sbr.append(" é legal");
        System.out.println(sbr);

        sbr.delete(10, 15);
        System.out.println(sbr);

        sbr.insert(11, "Java Programming ");
        System.out.println(sbr);

        System.out.println(sbr.indexOf(" ", 16));

        StringBuilder sbr1 = new StringBuilder("10");
        int str1 = Integer.parseInt(sbr1.toString()); // convertendo StringBuilder para String
        System.out.println(str1 + 3);

    }
}
