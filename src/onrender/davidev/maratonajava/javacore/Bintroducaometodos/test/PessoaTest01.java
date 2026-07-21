package onrender.davidev.maratonajava.javacore.Bintroducaometodos.test;

import onrender.davidev.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "David dev";
        pessoa.setNome("David Dev");

//        pessoa.idade = 26;
        pessoa.setIdade(26);

//        pessoa.imprime();
        System.out.println(pessoa.getNome()); //usando get para pegar o objeto
        System.out.println(pessoa.getIdade());
    }
}
