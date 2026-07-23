package onrender.davidev.maratonajava.javacore.Gassociacao.test;

import onrender.davidev.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Ronaldo");
        Jogador jogador3 = new Jogador("Ronaldinho");

//        Jogador[] jogadores = new Jogador[3];  // aray diretamente
        Jogador[] jogadores = new Jogador[]{jogador1 , jogador2 , jogador3};
//        Jogador[] jogadores ={jogador1 , jogador2 , jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
