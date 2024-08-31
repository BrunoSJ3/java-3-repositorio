package Section3_3;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver

{
    public static void main(String[] args)

    {
        // criando estudantes
        Student stu1 = new Student("Carlos Eduardo", "Machado de Oliveira", 100);
        Student stu2 = new Student("Mark", "Zukenberg", 95);
        Student stu3 = new Student("Beth", "Tween", 78);
        Student stu4 = new Student("Andrew", "Apic", 45);
        // System.out.println(stu1);

        // Criando lista de estudantes
        ArrayList<Student> lista = new ArrayList<>();
        lista.add(stu1);
        lista.add(stu2);
        lista.add(stu3);
        lista.add(stu4);

        displayLista(lista);

        // System.out.println(stu1);

        // classificando a lista de estudantes de forma lexcográfica
        Collections.sort(lista);

        String str1 = "Carlos";
        String str2 = "Eduardo";
        // System.out.println(str2.compareTo(str1));
    }

    public static void displayLista(ArrayList<Student> lista) {

        for (Student stu : lista) {
            System.out.println(stu);
        }
    }
}
