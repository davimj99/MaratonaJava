package onrender.davidev.maratonajava.introducao;

public class EstruturaCondicionais02 {
    public static void main(String[] args) {
    int idade = 25;
    String categoria;
    if (idade <= 15){
        categoria = "Categoria infatil";

        } else if(idade > 15 && idade < 18){
            categoria = "Categoria juvenil";
        } else if(idade > 18){
            categoria = "Categoria adulto";
        } else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
