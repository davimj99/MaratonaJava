package onrender.davidev.maratonajava.javacore.Bintroducaometodos.test;

import onrender.davidev.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

import javax.print.attribute.standard.Media;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "David Souza";
        funcionario.idade = 26;
        funcionario.salarios = new double[] {2500 , 1500, 890};

        funcionario.imprime();
//        funcionario.imprimeMediaSalario();  -> posso chamar aqui mas chamei no dominio
    }
}
