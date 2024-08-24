package Section3_1.wildcards;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericMethodDriver {
    public static void main(String[] args) {
        String[] stringArray = { "Esta", "é", "uma", "Matriz" };
        Integer[] intArray = { 1, 2, 3, 4 }; // para funcionar nos métodos genericos, inserir variáveis não stack

        GenericMethodClass gmc = new GenericMethodClass();
        gmc.printArray(stringArray);
        gmc.printArray(intArray);

        ArrayList<Double> array1 = new ArrayList<>();
        array1.add(25.84);
        array1.add(32.78);
        array1.add(45.69);
        array1.add(95.49);
        gmc.printArrayList(array1);
        gmc.displayArrayList(array1);

        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(10);
        array2.add(20);
        array2.add(30);
        array2.add(40);
        gmc.printArrayList(array2);
        gmc.displayArrayList(array2);

        ArrayList<String> array3 = new ArrayList<>();
        array3.add("Esta");
        array3.add("é");
        array3.add("Outra");
        array3.add("Matriz");
        gmc.printArrayList(array3);
        gmc.displayArrayList(array3);

        System.out.println(gmc.sumOfArrayList(array2));

    }

    public void addNumbers(ArrayList<? super Integer> arraylist) {
        for (int i = 0; i < 10; i++) {
            arraylist.add(i);
        }
    }
}
