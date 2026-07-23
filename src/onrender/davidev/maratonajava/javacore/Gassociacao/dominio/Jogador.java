package onrender.davidev.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    public void imprime() {
        System.out.println("Nome do craque: " + this.nome);
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
