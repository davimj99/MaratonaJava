package onrender.davidev.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/davi/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println("Não normalizado = " + path1);
        System.out.println("Normalizado = " + path1.normalize());

        System.out.println("--------------------------------------------");

        Path path2 = Paths.get("home/./davi/./dev/");
        System.out.println("Não normalizado = " + path2);
        System.out.println("Normalizado = " + path2);

    }
}
