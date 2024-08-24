package Section3_2.classlist;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
    public static void main(String[] args)

    {
        ArrayList<String> studentNames = new ArrayList<String>();

        addStudents(studentNames);
        displayStudents(studentNames);
        Collections.sort(studentNames);
        displayStudents(studentNames);
    }

    private static void addStudents(ArrayList<String> studentNames) {
        studentNames.add("Carlos");
        studentNames.add("Henrique");
        studentNames.add("Marco");
        studentNames.add("Maria");
        studentNames.add("Carlos");
        studentNames.add("Allan");
    }

    private static void displayStudents(ArrayList<String> studentNames) {
        for (String arrTemp : studentNames) {
            System.out.println("Nome do estudante é:" + arrTemp);
        }
    }
}
