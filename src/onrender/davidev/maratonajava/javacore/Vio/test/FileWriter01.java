package onrender.davidev.maratonajava.javacore.Vio.test;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedRead

import java.io.File;
import java.io.FileWriter;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("O davidev é brabo ta ficando afiado no javinha\n");
            fw.flush();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
