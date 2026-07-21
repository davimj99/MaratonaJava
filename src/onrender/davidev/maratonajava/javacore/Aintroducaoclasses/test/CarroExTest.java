package onrender.davidev.maratonajava.javacore.Aintroducaoclasses.test;

import onrender.davidev.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroExTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Gol Bolinha";
        carro1.modelo = "Volkswagen";
        carro1.ano = 2000;
        carro1.cor = "Vermelho";

        Carro carro2 = new Carro();
        carro2.nome = "Civic";
        carro2.modelo = "Honda";
        carro2.ano = 2022;
        carro2.cor = "Preto";

        System.out.println("=== CARRO 1 ===");
        System.out.println("Nome: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);
        System.out.println("Cor: " + carro1.cor);

//        System.out.println();  foi so pra pular mais uma linha mas é melhor usar \n

        System.out.println("\n=== CARRO 2 ===");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
        System.out.println("Cor: " + carro2.cor);
    }
}