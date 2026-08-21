package onrender.davidev.maratonajava.javacore.Oexception.exception.test;

import onrender.davidev.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }
    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "David";
        String passwordDB = "12345";
        System.out.println("Digite seu username: ");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Digite sua password: ");
        String passwordDigitada = teclado.nextLine();
        if (!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitada)) {
            throw new LoginInvalidoException("Usuario ou senha inválidos");
        }
        System.out.println("Login realizado com sucesso!");
    }
}
