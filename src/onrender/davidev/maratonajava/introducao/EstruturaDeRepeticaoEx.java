package onrender.davidev.maratonajava.introducao;

public class EstruturaDeRepeticaoEx {
    public static void main(String[] args) {
        long count = 0;

        // for (int i = 1 ; i <= 1000000 ; i++){}
        while (count <= 1000000) {
            if (count % 2 == 0) {
                System.out.println(count);
            }
            count++;
        }
    }
}