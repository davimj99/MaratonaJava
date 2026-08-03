package onrender.davidev.maratonajava.javacore.Kenum.test;

import onrender.davidev.maratonajava.javacore.Kenum.dominio.Cliente;
import onrender.davidev.maratonajava.javacore.Kenum.dominio.TipoPagamento;
import onrender.davidev.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("David Souza", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Mariana Fernandes", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
