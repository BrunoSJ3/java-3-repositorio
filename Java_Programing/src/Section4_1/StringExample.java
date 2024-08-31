package Section4_1;

import java.util.ArrayList;

public class StringExample {
    public static void main(String[] args)

    {
        String strg = ("o rato roeu a roupa do rei de roma");
        String strR = strg.replace("r", "l");
        System.out.println(strR);

        String str = ("Um texto qualquer");

        ArrayList<String> lista = new ArrayList<>();

        String[] lista2 = strg.split(" "); // exemplo do que em java , não tem em C (garbage collector)
        for (String arrTemp : lista2) {
            System.out.println(arrTemp);
        }

        // parseString(strg);

        String str1 = str.substring(0, 2);
        String str2 = str.substring(3, 8);
        String str3 = str.substring(9);

        lista.add(str1);
        lista.add(str2);
        lista.add(str3);

        for (int i = lista.size() - 1; i >= 0; i--)

        {
            System.out.print(lista.get(i)); // a função get pega um elemento da lista na posição que for passada a
                                            // função
        }

        for (int i = str.length() - 1; i >= 0; i--)

        {
            System.out.print(str.charAt(i)); // a função charAt busca o carater na posição que for passada a função
        }
        System.out.println();

        for (int i = 0; i < str.length(); i++)

        {
            System.out.print(str.charAt(i)); // a função charAt busca o carater na posição que for passada a função
        }
        System.out.println();

        searchChar(str, 'u', 'U');

    }

    public static void searchChar(String str, char c, char C)

    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)

        {
            if (str.charAt(i) == c || str.charAt(i) == C)

            {
                count++;
            }
        }
        System.out.println(count);

    }
    /*
     * public static void parseString(String str)
     * 
     * {
     * ArrayList<String> lista = new ArrayList<>();
     * while (str.length() >= 0) {
     * if()
     * 
     * {
     * 
     * }
     * int index = str.indexOf(" ");
     * lista.add(str.substring(0, index));
     * str = str.substring(index + 1);
     * }else {
     * break;
     * }
     * 
     * }
     */

}
