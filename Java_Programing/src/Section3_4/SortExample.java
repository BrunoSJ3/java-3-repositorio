package Section3_4;

public class SortExample {
    public static void main(String[] args)

    {
        int[] numbers = { 40, 7, 59, 4, 1, 20, 204, 6, 27, 99 };
        displayNumbers(numbers);
        selectionSort(numbers);
        displayNumbers(numbers);
        binarySearch(numbers, 204); // valor a ser encontrado depois do sort

    }

    public static void displayNumbers(int[] numbers)

    {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Ordena os elementos de um array usando o algoritmo de ordenação por seleção
    public static void selectionSort(int[] numbers)

    {
        int indexMin = 0;
        for (int i = 0; i < numbers.length; i++) // o i é o indice, a posição

        {
            indexMin = i;

            for (int j = i + 1; j < numbers.length; j++)

            {
                if (numbers[j] < numbers[indexMin])

                {
                    indexMin = j;
                }
            }
            // Troca os elementos na posição i com o elemento com menor valor na posição
            // indexMin
            int temp = numbers[i];
            numbers[i] = numbers[indexMin];
            numbers[indexMin] = temp;
        }
    }

    // Faz uma busca binária em um array para encontrar um determinado valor se os
    // valores estiverem organizados
    public static int binarySearch(int[] numbers, int target)

    {
        int indexMin = 0;
        int indexMax = numbers.length - 1;
        while (indexMin <= indexMax)

        {
            int indexMid = (indexMin + indexMax) / 2;
            if (numbers[indexMid] == target)

            {
                System.out
                        .println("O Numero " + numbers[indexMid] + " está na posição: " + (indexMid + 1) + " da lista");
                return indexMid;
            }

            if (numbers[indexMid] > target) {
                indexMax = indexMid - 1;
            } else {
                indexMin = indexMid + 1;
            }
        }
        System.out.println("O valor " + target + " Não está na lista");
        return -1;
    }
}
