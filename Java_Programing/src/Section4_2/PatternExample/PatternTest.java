package Section4_2.PatternExample;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class PatternTest

{
    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);
        Pattern cpf = Pattern.compile("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");

        System.out.println("Digite seu cpf: ");
        String CPF = input.nextLine();
        System.out.println(isMatch(CPF, cpf));
    }

    public static boolean isMatch(String CPF, Pattern cpf)

    {
        Matcher matcher = cpf.matcher(CPF);
        return matcher.matches();
    }
}
