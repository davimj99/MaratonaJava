package onrender.davidev.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("Foi criada uma pasta? " + isDiretorioCreated );

//        File fileAqruivoDiretorio = new File("D:\\devdavi\\Maratona-java\\pasta\\aqruivo.txt");
//        boolean isFileCreated = fileAqruivoDiretorio.createNewFile();
//        System.out.println(isFileCreated + " = Foi criado usando o path absoluto que foi copiado: " + fileAqruivoDiretorio);

        File fileAqruivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileAqruivoDiretorio.createNewFile();
        System.out.println(isFileCreated + " = foi criada um arquivo passando o fileDiretorio como parametro: " + fileAqruivoDiretorio);

        File fileRenamed = new File(fileDiretorio , "arquivo_renomeado.txt");
        boolean isRenamed = fileAqruivoDiretorio.renameTo(fileRenamed);
        System.out.println("O arquivo foi renomeado? " + isRenamed);

        File direotiroRenamed = new File("pasta2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(direotiroRenamed);
        System.out.println("O diretório foi renomeado? " + isDiretorioRenomeado);
    }
}
