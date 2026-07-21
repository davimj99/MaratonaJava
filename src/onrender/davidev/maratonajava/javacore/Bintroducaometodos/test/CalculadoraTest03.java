package onrender.davidev.maratonajava.javacore.Bintroducaometodos.test;

import onrender.davidev.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(10, 5);
        System.out.println(resultado);

        Calculadora calculadora2 = new Calculadora();
        double resultado2 = calculadora2.divideDoisNumeros02(10, 0);
        System.out.println(resultado2);
        System.out.println("----------");
        calculadora2.imprimeDivsaoDeDoisNumeros(25,0);
    }
}
