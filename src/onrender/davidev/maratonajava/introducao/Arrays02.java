package onrender.davidev.maratonajava.introducao;

public class Arrays02 {
    public static void main(String[] args){

        String[] nomes = new String[5];
        nomes[0] = "Maria";
        nomes[1] = "Davi";
        nomes[2] = "Mariana";
        nomes[3] = "Hugo";
        nomes[4] = "Bruno";

        for(int i= 0 ; i < nomes.length ; i++){
            System.out.println(nomes[i]);
        }
        nomes = new String[5];
    }
}
