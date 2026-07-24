package onrender.davidev.maratonajava.javacore.Gassociacao.EX.test;

import onrender.davidev.maratonajava.javacore.Gassociacao.EX.dominio.Aluno;
import onrender.davidev.maratonajava.javacore.Gassociacao.EX.dominio.Local;
import onrender.davidev.maratonajava.javacore.Gassociacao.EX.dominio.Professor;
import onrender.davidev.maratonajava.javacore.Gassociacao.EX.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Cruzeiro novo");
        Aluno aluno = new Aluno("David Souza", 26);
        Professor professor = new Professor("Dev Dojo", "Javeiro Brabo");

        Aluno[] alunoParaSeminario = {aluno};
        Seminario seminarios = new Seminario("Maratona Java", alunoParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminarios};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
