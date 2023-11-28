import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Digite números infinitamente. Digite 10 para sair.");
        while (true) {
            System.out.print("Digite um número: ");
            numero = input.nextInt();
            if (numero == 10) {
                System.out.println("Você digitou o número 10. Saindo...");
                break;
            }
        }
    }
}