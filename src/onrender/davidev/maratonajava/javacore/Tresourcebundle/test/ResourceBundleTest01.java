package onrender.davidev.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle1 = ResourceBundle.getBundle("message", new Locale("pt", "BR"));
        System.out.println(bundle1.getString("hello") + " <-- Usando chave porperties PT BR ");
        System.out.println(bundle1.getString("good.mornig"));
        System.out.println("------------------------------------");

        ResourceBundle bundle2 = ResourceBundle.getBundle("message", new Locale("en", "US"));
        System.out.println(bundle2.getString("hello")+ " <-- Usando chave porperties EN US ");
        System.out.println(bundle2.getString("good.mornig"));

        System.out.println("OBS : Sempre usar a mesma chave do arquivo porperties e passar o mesmo nome no baseName");

    }
}
