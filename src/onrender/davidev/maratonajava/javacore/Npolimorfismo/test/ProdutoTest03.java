package onrender.davidev.maratonajava.javacore.Npolimorfismo.test;

import onrender.davidev.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import onrender.davidev.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import onrender.davidev.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import onrender.davidev.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Tomate Pequeno", 5);
        tomate.setDataValidade("11/12/2026");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
