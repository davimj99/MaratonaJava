package onrender.davidev.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("D:\\devdavi\\Maratona-java\\file.txt");
        Path p2 = Paths.get("D:\\devdavi\\Maratona-java", "file.txt");
        Path p3 = Paths.get("D:", "devdavi\\Maratona-java" , "file.txt");
        Path p4 = Paths.get("D:", "devdavi" , "Maratona-java" , "file.txt");
        System.out.println("Este é o path que você indicou com caminho absoluto -> " + p1.getFileName());
        System.out.println("Este é o path -> " + p2.getFileName());
        System.out.println("Este é o path -> " + p3.getFileName());
        System.out.println("Este é o path -> " + p4.getFileName());
    }
}
