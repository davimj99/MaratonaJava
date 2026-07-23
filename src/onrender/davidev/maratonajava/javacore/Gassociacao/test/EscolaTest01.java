package onrender.davidev.maratonajava.javacore.Gassociacao.test;

import onrender.davidev.maratonajava.javacore.Gassociacao.dominio.Escola;
import onrender.davidev.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("DevDojo");
        Professor professor2 = new Professor("Pc");
        Professor[] professores = {professor1, professor2};

        Escola escola = new Escola("Maratona Java", professores);

        escola.imprime();
    }
}
