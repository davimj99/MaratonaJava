package onrender.davidev.maratonajava.javacore.Aintroducaoclasses.test;

import onrender.davidev.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "DevDojo";
        professor.idade = 26;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " Idade: " +  professor.idade + " Sexo: " + professor.sexo);
    }
}
