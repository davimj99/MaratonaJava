package onrender.davidev.maratonajava.javacore.Jmodficadorfinal.test;

import onrender.davidev.maratonajava.javacore.Jmodficadorfinal.dominio.Carro;
import onrender.davidev.maratonajava.javacore.Jmodficadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);

        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("David ");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Nome da Ferrari : PuroSangue");
        ferrari.imprime();
    }
}
