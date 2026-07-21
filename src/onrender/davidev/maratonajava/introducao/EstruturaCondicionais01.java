package onrender.davidev.maratonajava.introducao;

public class EstruturaCondicionais01 {
    public static void main(String[] args) {
        int idade = 10;
        boolean isAutorizadoTirarCnh = idade>=18;

        if(isAutorizadoTirarCnh){
            System.out.println("Autorizado a tirar CNH ");
        }else{
            System.out.println("Não está autorizado a tirar CNH não tem idade no else ");
        }
        if(!isAutorizadoTirarCnh){
            System.out.println("Não está autorizado a tirar CNH não tem idade ");
        }
        System.out.println("Fora do if");
    }
}
