import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double resultado=0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o operador ( + , - , * , / ou p ): ");
        char operador = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        
        

        switch (operador) {
        case '+':
            resultado = numero1 + numero2;
            break;
        case '-':
            resultado = numero1 - numero2;
            break;
        case '*':
            resultado = numero1 * numero2;
            break;
        case '/':
            resultado = numero1 / numero2;
            break;
        case 'p':
            resultado = Math.pow(numero1, numero2);
            break;
        default:
            System.out.println("Operador inválido!");
            break;
        }
        System.out.println(resultado);

    }
}
