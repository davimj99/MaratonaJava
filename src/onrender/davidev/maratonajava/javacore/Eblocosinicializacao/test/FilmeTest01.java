package onrender.davidev.maratonajava.javacore.Eblocosinicializacao.test;

import onrender.davidev.maratonajava.javacore.Eblocosinicializacao.dominio.Filme;

public class FilmeTest01 {
    public static void main(String[] args) {
        Filme filme = new Filme();

        for (int parte: filme.getPartes()) {
            System.out.print(parte + " ");
        }
    }
}
