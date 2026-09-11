package onrender.davidev.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try {
//            boolean isDeleted = file.delete();
            boolean isCreated = file.createNewFile();
            System.out.println("O arquivo foi criado: " + isCreated);

            System.out.println("O arquivo que foi criado foi : " + file.getPath());
            System.out.println("O path que o arquivo foi criado foi : " + file.getAbsolutePath());
            System.out.println("O arquivo é um diretório?: " + file.isDirectory());
            System.out.println("O arquivo é um arquivo?: " + file.isFile());
            System.out.println("O arquivo é um arquivo oculto?: " + file.isHidden());

            System.out.println("Quando o arquivo foi modificado: " + new Date(file.lastModified()));
            System.out.println("Quando o arquivo foi modificado: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));

            boolean exists  = file.exists();
            if (exists){
                 System.out.println("O arquivo foi deletado : " + file.delete());
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
