package onrender.davidev.maratonajava.javacore.Bintroducaometodos.test;

import onrender.davidev.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora cacluladora = new Calculadora();
        int [] numeros = {1,2,3,4,5};
        cacluladora.somaArray(numeros);
        cacluladora.somaVarArgs(1,2,5,5);
    }
}
