package teste;

import java.io.Console;

public class PasswordExample {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.out.println("Console não disponível");
            System.exit(1);
        }

        char[] passwordArray = console.readPassword("Digite sua senha: ");
        String password = new String(passwordArray);

        System.out.println("Sua senha é: " + password);
    }
}
