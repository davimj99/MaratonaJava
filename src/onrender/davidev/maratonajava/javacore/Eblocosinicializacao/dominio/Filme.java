package onrender.davidev.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Filme {
    private String nome;
    private int[] partes;
    {
        System.out.println("Dentro do bloco de incialização");
        partes = new int[10];
        for (int i = 0; i < partes.length; i++) {
            partes[i] = i+1;
        }
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
        for(int parte : this.partes){
            System.out.print(parte + " ");
        }
        System.out.println();
    }
}
