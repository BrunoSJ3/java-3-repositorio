package Section4_2.regularexpressionexample;

import java.util.Scanner;

public class RegularExpressionExample

{
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner doc = new Scanner(System.in);

        String resposta = "Nao";
        /*
         * if (getResposta(resposta))
         * 
         * {
         * System.out.println("Esta é uma resposta válida");
         * } else
         * System.out.println("Esta não é uma resposta válida");
         * 
         * // String palavra = "impar";
         * String palavra = sc.next();
         * if (rhymingWord(palavra))
         * 
         * {
         * System.out.println(palavra + ":" + "Esta é uma palavra que rima com mar");
         * } else
         * System.out.println("Esta é uma palavra que não rima com mar");
         * 
         * String data = sc2.next();
         * if (getData(data))
         * 
         * {
         * System.out.println("A data" + data + " Está no padrão correto");
         * } else
         * System.out.println("A data" + data + "não está no padrão correto");
         * System.out.println("digite uma data:");
         */
        String cpf = sc.next();

        if (getCPF(cpf))

        {
            System.out.println("O CPF: " + cpf + ":" + "Está no padrão correto");
        } else
            System.out.println("Este CPF não está no padrão correto");
    }

    public static boolean getResposta(String resposta)

    {
        return resposta.matches("[Ss]im|[Nn]ao"); // isso :| (ele pode procurar o da esquerda ou
                                                  // da direita do |) e o matches é o método para expressões regulares
                                                  // com strings
    }

    public static boolean rhymingWord(String paralvra)

    {
        return paralvra.matches("[a-z|A-Z]*(ar|AR)");
    }

    public static boolean getData(String data)

    {
        return data.matches("[0-9]{2} / [0-9]{2} / [0-9]{4}");
    }

    public static boolean getCPF(String cpf)

    {
        return cpf.matches("[0-9]{3} . [0-9]{3} . [0-9]{3} - [0-9]{2}");
    }
}
