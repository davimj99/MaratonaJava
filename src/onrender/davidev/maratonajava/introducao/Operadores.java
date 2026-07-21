package onrender.davidev.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        double numero3 = 30;

        System.out.println(" a multiplicação dos numeros é " + (numero1 * numero2));
        System.out.println(" a soma dos numeros é " + (numero1 + numero2));
        System.out.println(" a divisão dos numeros é " + (numero1 / numero3));
        System.out.println(" a subtração dos numeros é " + (numero2 - numero1));

        int resto = 27 % 2;
        System.out.println("O resto da divisão é " + resto);

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta =  idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " +  isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " +  isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlay = 5000;
        boolean isPlayCincoCompravel = valorTotalContaCorrente > valorPlay || valorTotalContaPoupanca > valorPlay;
        System.out.println("isPlayCincoCompravel " + isPlayCincoCompravel);

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 1000;
        bonus /= 1000;
        bonus %= 1000;

        System.out.println(bonus);

        int contador = 7;
        //contador += 1;
        contador ++;
        contador --;
        System.out.println(contador);

    }
}
