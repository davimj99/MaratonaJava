package onrender.davidev.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
             bw.write("O davidev é brabo ta ficando afiado no javinha");
             bw.newLine();
             bw.flush();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
// a Classe BufferedWriter encapsula a FileWriter