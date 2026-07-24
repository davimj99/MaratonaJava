package onrender.davidev.maratonajava.javacore.Gassociacao.test;

import java. util.Scanner;

public class LeituraDoTecladoEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Software de previsão ");
        System.out.println("Digite sua pergunta e eu irei responder SIM OU NÃO ");

        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        }else {
            System.out.println("NÃO");
        }
    }
}
