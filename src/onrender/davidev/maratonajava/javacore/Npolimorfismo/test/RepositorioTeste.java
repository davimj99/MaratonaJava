package onrender.davidev.maratonajava.javacore.Npolimorfismo.test;

import onrender.davidev.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import onrender.davidev.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import onrender.davidev.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import onrender.davidev.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Curirin");
        System.out.println(list);


        Repositorio repositorio2 = new RepositorioArquivo();
        repositorio2.salvar();

        Repositorio repositorio3 = new RepositorioMemoria();
        repositorio3.salvar();


    }
}
