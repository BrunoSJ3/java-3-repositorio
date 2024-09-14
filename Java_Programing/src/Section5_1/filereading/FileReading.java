package Section5_1.filereading;

import java.io.*; //IO = Input Output
import java.io.FileReader;
import java.io.File;
//import java.nio.file.*;
import java.util.ArrayList;

public class FileReading

{
    public static void main(String[] args)

    {
        ArrayList<String> Employeeslines = new ArrayList<>();
        readFile(Employeeslines);
        displayEmployees(Employeeslines);
    }

    public static void displayEmployees(ArrayList<String> employees)

    {
        for (String employee : employees) {
            System.out.println(employee);
        }
    }

    public static void readFile(ArrayList<String> employees)

    {
        String line = "";
        BufferedReader fileInput = null; // espaço temporário para leitura, lembre de fechar este método
        try {
            fileInput = new BufferedReader(new FileReader(new File("C:/javaprograming/employees.txt")));
            line = fileInput.readLine();
            while (line != null) {
                employees.add(line);
                line = fileInput.readLine();
            }
            fileInput.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Arquivo não encontrado");
        } catch (EOFException exception) {
            System.out.println("Não há linhas para ler");
        } catch (IOException exception) {
            System.out.println("Erro ao ler o arquivo");
        }
    }
}
