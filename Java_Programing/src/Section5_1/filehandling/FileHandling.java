package Section5_1.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class FileHandling {

    public static void main(String[] args)

    {
        ArrayList<String> Employeeslines = new ArrayList<>();
        readFile(Employeeslines);
        displayEmployees(Employeeslines);
        writeFile(Employeeslines);

    }

    public static void displayEmployees(ArrayList<String> employees)

    {
        for (String employee : employees)

        {
            System.out.println(employee);
        }
    }

    public static void readFile(ArrayList<String> employees)

    {
        String line = "";
        Path path = Paths.get("C:\\javaprograming\\employees.txt");

        try {
            BufferedReader fileInput = Files.newBufferedReader(path, Charset.forName("UTF-8"));
            line = fileInput.readLine();
            while (line != null) {
                employees.add(line);
                line = fileInput.readLine();
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Arquivo não encontrado");
        } catch (EOFException exception) {
            System.out.println("Não há linhas para ler");
        } catch (IOException exception) {
            System.out.println("Erro ao ler o arquivo");
        }
    }

    public static void writeFile(ArrayList<String> employees)

    {
        Path path = Paths.get("C:/javaprograming/usernames.txt");
        try

        {
            BufferedWriter fileOutput = Files.newBufferedWriter(path, Charset.forName("ISO-8859-1"),
                    StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            for (String employee : employees)

            {
                fileOutput.write(employee);
                fileOutput.newLine();
            }
            fileOutput.close();
        } catch (IOException exception) {
            System.out.println("Erro ao escrever o arquivo");
            System.exit(0); // para de tentar gravar
        }
    }
}
