package onrender.davidev.maratonajava.introducao;

public class EstruturaDeRepeticao03 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for(int parcela = 0; parcela < valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if(valorParcela >= 1000){
                System.out.println("Parcela " + parcela + "R$ "+valorParcela);
            }else{
                break;
            }
            System.out.println("Fora do if, mas dentro do for " + parcela);
        }
    }
}
