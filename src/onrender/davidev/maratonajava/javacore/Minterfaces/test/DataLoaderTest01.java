package onrender.davidev.maratonajava.javacore.Minterfaces.test;

import onrender.davidev.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import onrender.davidev.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import onrender.davidev.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        databaseLoader.load();

        FileLoader fileLoader = new FileLoader();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retriveMaxDataSize();
        DatabaseLoader.retriveMaxDataSize();
    }
}
