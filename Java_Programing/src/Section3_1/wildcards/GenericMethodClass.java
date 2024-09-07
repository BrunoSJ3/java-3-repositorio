package Section3_1.wildcards;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericMethodClass {

    public <T> void printArray(T[] array) {
        for (T arrTemp : array) {
            System.out.println(arrTemp + "");
        }
        System.out.println();
    }

    public <T> void printArrayList(ArrayList<T> arrayList) {
        for (T arrTemp : arrayList) {
            System.out.println(arrTemp + "");
        }
        System.out.println();
    }

    public void displayArrayList(ArrayList<?> arrayList) // método CORINGA!(wildcard) por causa do ?,
                                                         // utiliza Object como variável

    {
        for (Object arrTemp : arrayList) {
            System.out.println(arrTemp + "");
        }
        System.out.println();
    }

    public double sumOfArrayList(ArrayList<? extends Number> arrayList) {
        double sum = 0.0;
        for (Number arrListTemp : arrayList)

        {
            sum += (double) arrListTemp.doubleValue();
        }
        return sum;
    }
}
