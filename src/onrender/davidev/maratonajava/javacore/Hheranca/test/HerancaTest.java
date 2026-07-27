package onrender.davidev.maratonajava.javacore.Hheranca.test;

import onrender.davidev.maratonajava.javacore.Hheranca.dominio.Endereco;
import onrender.davidev.maratonajava.javacore.Hheranca.dominio.Funcionario;
import onrender.davidev.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua SRI 2 ");
        endereco.setCep("70.256-230");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("David Souza");
        pessoa.setCpf("111.111.111-20");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("=".repeat(20)); //.repeat metodo usado para repetir String

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Mariana Fernandes ");
        funcionario.setCpf("111.111.111-20");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(9200);
        funcionario.imprime();
    }
}
