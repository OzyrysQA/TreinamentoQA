import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Digite n�meros infinitamente. Digite 10 para sair.");
        while (true) {
            System.out.print("Digite um n�mero: ");
            numero = input.nextInt();
            if (numero == 10) {
                System.out.println("Voc� digitou o n�mero 10. Saindo...");
                break;
            }
        }
    }
}