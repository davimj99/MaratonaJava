package onrender.davidev.maratonajava.javacore.Bintroducaometodos.test;

import onrender.davidev.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();

        System.out.println("Finalizando CalculadoraTest01... apenas soma e subtração");
    }
}
