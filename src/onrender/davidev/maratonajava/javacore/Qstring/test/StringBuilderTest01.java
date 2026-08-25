package onrender.davidev.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "David Luiz Souza";
        nome.concat(" Curso do DevDojo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("David Luiz Souza");
        sb.append(" Curso do DevDojo").append(" Javinha on fire");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
