package onrender.davidev.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "David L Souza"; //String constant pool
        String nome2 = "David L Souza";
        nome = nome.concat("Nascimento");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 =  new String("David L Souza");  // 1 variável de referência, 2 objeto do tipo string, 3 uma string no pool string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
