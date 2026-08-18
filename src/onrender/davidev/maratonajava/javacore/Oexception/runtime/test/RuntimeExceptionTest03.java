package onrender.davidev.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexão();
        abreConexão2();
    }

    private static String abreConexão() {
        try {
            System.out.println("Abrindo arquivo ");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            System.out.println("Fechando o recurso liberado pelo SO");
            return null;
        }
    }

    private static void abreConexão2() {
        try {
            System.out.println("Abrindo arquivo 2 ");
            System.out.println("Escrevendo dados no arquivo");
        } finally{
            System.out.println("Fechando o recurso liberado pelo SO");
        }
    }
}
