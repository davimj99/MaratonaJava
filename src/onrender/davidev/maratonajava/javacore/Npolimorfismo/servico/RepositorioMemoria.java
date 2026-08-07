package onrender.davidev.maratonajava.javacore.Npolimorfismo.servico;

import onrender.davidev.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em memória ");
    }
}
