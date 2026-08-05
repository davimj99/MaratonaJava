package onrender.davidev.maratonajava.javacore.Lclassesabstratas.test;

import onrender.davidev.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import onrender.davidev.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import onrender.davidev.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Mariana F", 8000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("David L Souza", 10000);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();
    }
}
