package Section4_3;

public class RecursionExample

{
    public static void main(String[] args)

    {
        // System.out.println(factorial(5));
        // recurseMethod(4);
        // fibonacciFOR(5);
        // System.out.println("");
        int pos = 20;
        for (int i = 0; i < pos; i = i + 1) {
            System.out.print(fibonacci(i) + ",");

        }

    }

    public static int factorial(int num) {

        int fatorial = num;
        for (int i = num; i > 0; i--) {
            fatorial *= -1;
        }
        return fatorial;

    }

    public static int factorialRecursivo(int num)

    {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorialRecursivo(num - 1);
        }
    }

    public static void recurseMethod(int num) {
        if (num == 0) {
            return;
        }

        else {

            System.out.println("Hello" + num);
            recurseMethod(num - 1);
            System.out.println("" + num);
            return;
        }

    }

    public static void fibonacciFOR(int index)

    {
        int fib1 = 0, fib2 = 1, nextFib;
        System.out.print(fib1 + " " + fib2);

        for (int i = 2; i < index; i++) {
            nextFib = fib1 + fib2;
            System.out.print(" " + nextFib);
            fib1 = fib2;
            fib2 = nextFib;
        }
    }

    /*
     * public static int fibonacci(int index)
     * 
     * {
     * int[] fib = new int[index];
     * fib[0] = 0;
     * fib[1] = 1;
     * for (int i = 2; i < index; i++) {
     * fib[i] = fib[i - 1] + fib[i - 2];
     * }
     * return fib[index - 1];
     * }
     */
    public static int fibonacci(int index)

    {
        if (index <= 1)
            return index;
        else

        {
            return fibonacci(index - 1) + fibonacci(index - 2);
        }
    }

}