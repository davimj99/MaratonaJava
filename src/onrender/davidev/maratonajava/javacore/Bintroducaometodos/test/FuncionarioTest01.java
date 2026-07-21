package onrender.davidev.maratonajava.javacore.Bintroducaometodos.test;

import onrender.davidev.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;



public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome ("David Souza");
        funcionario.setIdade(26);
        funcionario.setSalarios(new double[] {2500 , 1500, 890});

        funcionario.imprime();
//        funcionario.imprimeMediaSalario();  -> posso chamar aqui mas chamei no dominio
    }
}
