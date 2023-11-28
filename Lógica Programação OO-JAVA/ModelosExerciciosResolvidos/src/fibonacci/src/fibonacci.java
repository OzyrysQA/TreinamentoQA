import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro não-negativo: ");
        int numero = input.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        System.out.println("Sequência de Fibonacci mais próxima de " + numero + ":");
        System.out.println(numero);
        while (fib1 <= numero) {
            System.out.print(fib1 + " ");
            int soma = fib1 + fib2;
            fib1 = fib2;
            fib2 = soma;
        }
    }
}
