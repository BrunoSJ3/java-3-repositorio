package Section2_4.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tools

{
    public static void divide(Scanner scanner) throws Exception, InputMismatchException // o trows exception remove a
                                                                                        // necessidade de criar um
    // catch novo

    {
        double num1 = 0, num2 = 0, result = 0;
        String answer = "SIM";

        do {
            try {
                System.out.println("Informe o primeiro numero (numerador)");

                num1 = scanner.nextDouble();

                System.out.println("Informe o segundo número (denominador)");
                num2 = scanner.nextDouble();
                if (num2 == 0) {

                    throw new Exception("PC não lê numeros divisiveis por 0 (ZERO)");
                }
            } finally {

            }

            // finally {
            // num1 = 100;
            // num2 = 15;
            // }

            result = num1 / num2;
            System.out.println(result);
            System.out.println("O resultado desta divisão é: )" + result);

            System.out.println("voce deseja realizar uma nova divisão? (SIM/NAO)");
            answer = scanner.next();

            while (!answer.equalsIgnoreCase("SIM") && !answer.equalsIgnoreCase("NAO"))

            {
                System.out.println("Opção inválida! Por favor, informe SIM ou NAO.");
                answer = scanner.next();
                while (!(answer.equalsIgnoreCase("SIM")) && !(answer.equalsIgnoreCase("NAO")))
                    ;
            }

        } while (answer.equalsIgnoreCase("SIM"));

        System.out.println("Programa Concluído");
        scanner.close();
    }
}
