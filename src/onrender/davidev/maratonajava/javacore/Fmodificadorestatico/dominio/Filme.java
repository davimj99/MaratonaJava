package onrender.davidev.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Filme {
    private String nome;
    private static int[] partes;
    // 0 - Bloco de Inicialização é executado quando a JVM carregar classe
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou quero for passado
    // 3 - Bloco de incialização é executado
    // 4 - Construtor é executado

    static {
        System.out.println("Dentro do bloco de incialização static");
        partes = new int[10];
        for (int i = 0; i < partes.length; i++) {
            partes[i] = i+1;
        }
    }
    static {
        System.out.println("Bloco de inicialização static 2");
    }
    static {
        System.out.println("Bloco de incialização static 3");
    }
    {
        System.out.println("bloco de incialização");
    }

    public int[] getPartes() {
        return partes;
    }

    public String getNome() {
        return nome;
    }

    public Filme(String nome){
        this.nome = nome;
    }

    public Filme(){
        for(int parte : Filme.partes){
            System.out.print(parte + " ");
        }
        System.out.println();
    }
}
