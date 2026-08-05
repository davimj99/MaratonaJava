package onrender.davidev.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados do arquivo");
    }
}
