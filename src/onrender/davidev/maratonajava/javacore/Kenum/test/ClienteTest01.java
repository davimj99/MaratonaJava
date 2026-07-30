package onrender.davidev.maratonajava.javacore.Kenum.test;

import onrender.davidev.maratonajava.javacore.Kenum.dominio.Cliente;
import onrender.davidev.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("David Souza", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Mariana Fernandes", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Eduardo", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Bruno", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente5 = new Cliente("DUDU", TipoCliente.PESSOA_JURIDICA2);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);
    }
}
