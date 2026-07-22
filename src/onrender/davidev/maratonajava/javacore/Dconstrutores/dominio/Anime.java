package onrender.davidev.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;

    public Anime(String nome, String tipo, int episodios, String genero){
        System.out.println("Dentro do construtor");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public int getEpisodios() {
        return this.episodios;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setGenero(){
        this.genero = "Ação";
    }
    public String getGenero(){
        return this.genero;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episodios: " + this.episodios);
        System.out.println("Genero: " + this.genero);

    }

}
