import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a ordem da matriz quadrada: ");
        int ordem = input.nextInt();
        int[][] matriz = new int[ordem][ordem];
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }
        int somaDiagonal = 0;
        for (int i = 0; i < ordem; i++) {
            somaDiagonal += matriz[i][i];
        }
        System.out.println("A matriz é:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("A soma da diagonal principal é: " + somaDiagonal);
    }
}