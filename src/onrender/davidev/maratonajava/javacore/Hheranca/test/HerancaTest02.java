package onrender.davidev.maratonajava.javacore.Hheranca.test;

import onrender.davidev.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de incialização estático da superclasse é executado quando a JVM carregar a superclasse
    // 1 - Bloco de incialização estático da subclasse é executado quando a JVM carregar a subclasse
    // 2 - Alocado espaço, em memória pro objeto, da superclasse
    // 3 - Cada atributo de superclasse pai é criado, e incializado com valores default ou o quer for passado
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Contstrutor é executado da superclasse
    // 6 - Alocado espaço em memória pro objeto da sublcasse
    // 7 - Cada atributo de sublcasse é criado e inicializado com valores default ou o que for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Construtor é executado da sublasse

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Eduardo F", "1111.1111.111-50");
    }
}
