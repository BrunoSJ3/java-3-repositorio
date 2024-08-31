package Section2_4.Assertions;

import java.util.Scanner;

public class AssertExample

{
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor, digite um numero na tela");
        double num = sc.nextDouble();
        System.out.println("O número digitado é: " + num);
        sc.close();

        assert num < 2_147_483_647; // facilita a leitura/ mas usado somente para testes
        int y = (int) num;
        System.out.println("O número transformado para inteiro é:" + y);
    }
}
