package onrender.davidev.maratonajava.introducao;

public class SwitchCaseBreakEx {
    public static void main(String[] args) {
        byte dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Erro, opção invalida");
                break;

        }
        if(dia == 1 || dia == 7){
            System.out.println("final de semana");
        }

        byte dia2 = 6;
        switch (dia2) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
