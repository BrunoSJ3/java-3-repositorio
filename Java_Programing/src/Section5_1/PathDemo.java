package Section5_1;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo

{
    public static void main(String[] args)

    {
        Path[] path = new Path[5];

        for (int i = 0; i < path.length; i++) {
            System.out.println("Caminho do path: [" + i + "]" + path[i]);
        }

        path[0] = Paths.get("C:\\javaprograming\\NIO2\\DemoFile.txt");
        path[1] = Paths.get("C:/javaprograming/NIO2/DemoFile");
        path[2] = Paths.get("C:", "javaprograming", "NIO2", "DemoFile");
        path[3] = Paths.get("DemoFile.txt");
        path[4] = Paths.get(URI.create("file:///C:/Java%20Programing/~/DemoFile.txt")); // %20 é o código de espaço

        System.out.println(path[0].getFileName());
        System.out.println(path[0].getParent());
        System.out.println(path[0].getNameCount());
        System.out.println(path[0].isAbsolute());
        System.out.println(path[0].toAbsolutePath());
        System.out.println(path[0].toFile());
        System.out.println(path[0].toUri());

        Path relativePath = Paths.get("C:/javaprograming/IO/..//DemoFile.txt");
        System.out.println(relativePath.normalize() + " [" + relativePath.normalize() + "]");

        Path sp = Paths.get("C:/javaprograming/IO/..//DemoFile.txt");
        System.out.println(sp.normalize().subpath(0, 2)); // subnível da hierarquia de pastas
    }

    public static void printTerminal() {

    }
}
