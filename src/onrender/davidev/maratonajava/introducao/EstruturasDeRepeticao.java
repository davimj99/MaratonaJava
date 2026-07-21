package onrender.davidev.maratonajava.introducao;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        int count = 0;
        while(count < 10){
            count++;
            // count = count + 1; count += 1; mesma coisa que a linha de cima
            System.out.println(count);
        }
        do {
            System.out.println("Dentro do do-while");
        }while(count < 10);

        for(int i = 0; i < 10; i++){
            System.out.println("for" + i);
//            count++;
        }
    }
}
