package onrender.davidev.maratonajava.javacore.Gassociacao.test;

import onrender.davidev.maratonajava.javacore.Gassociacao.dominio.Jogador;
import onrender.davidev.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador( "NEYMAR");
        Jogador jogador2 = new Jogador( "VINI JR");
        Time time = new Time("BRASIL");
        Jogador[] jogadores = {jogador , jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}
