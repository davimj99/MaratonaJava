package onrender.davidev.maratonajava.javacore.Oexception.exception.test;

import onrender.davidev.maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import onrender.davidev.maratonajava.javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerAquivo();

    }

    public static void lerAquivo() {
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()) {

        }catch (IOException e){

        }
    }

    public static void lerArquivo1() throws IOException {
        try(Reader reader = new BufferedReader(new FileReader("test.txt"))) {

        }
    }


    public  static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally{
            try {
                if(reader != null){
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
