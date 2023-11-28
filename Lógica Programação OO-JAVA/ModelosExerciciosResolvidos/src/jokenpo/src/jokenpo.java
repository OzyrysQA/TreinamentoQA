import java.util.Scanner;

public class jokenpo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha entre 1-Pedra, 2-Papel ou 3-Tesoura:");
        int escolha1 = input.nextInt();

        System.out.println("Escolha entre 1-Pedra, 2-Papel ou 3-Tesoura:");
        int escolha2 = input.nextInt();

        if (escolha1 == escolha2) {
            System.out.println("Empate!");
        } else if (escolha1 == 1 && escolha2 == 3 ||
                   escolha1 == 3 && escolha2 == 2 ||
                   escolha1==2 && escolha2 == 1) {
            System.out.println("Jogador 1 venceu!");
        } else {
            System.out.println("Jogador 2 venceu!");
        }
    }
}



