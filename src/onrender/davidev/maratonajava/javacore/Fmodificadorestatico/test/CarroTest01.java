package onrender.davidev.maratonajava.javacore.Fmodificadorestatico.test;

import onrender.davidev.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("MERCEDES", 275);
        Carro carro3 = new Carro("AUDI", 290);

        Carro.velocidadeLimite = 180;

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
