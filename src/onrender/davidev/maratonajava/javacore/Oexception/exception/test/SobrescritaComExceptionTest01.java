package onrender.davidev.maratonajava.javacore.Oexception.exception.test;

import onrender.davidev.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import onrender.davidev.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import onrender.davidev.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
