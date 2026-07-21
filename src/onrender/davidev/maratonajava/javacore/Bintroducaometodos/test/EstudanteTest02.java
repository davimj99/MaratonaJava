package onrender.davidev.maratonajava.javacore.Bintroducaometodos.test;

import onrender.davidev.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;


public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "David Souza";
        estudante01.idade = 26;
        estudante01.sexo = 'M';

        estudante02.nome = "Mariana Fernandes";
        estudante02.idade = 23;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
