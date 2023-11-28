import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o operador ( + , - , * , / ou p ): ");
        char operador = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        double resultado;

        if (operador == '+') {
            resultado = numero1 + numero2;
        } else if (operador == '-') {
            resultado = numero1 - numero2;
        } else if (operador == '*') {
            resultado = numero1 * numero2;
        } else if (operador == '/') {
            resultado = numero1 / numero2;
        } else if (operador == 'p') {
            resultado = Math.pow(numero1, numero2);
        } else {
            System.out.println("Operador inválido!");
            return;
        }
        System.out.println(resultado);

    }
}
