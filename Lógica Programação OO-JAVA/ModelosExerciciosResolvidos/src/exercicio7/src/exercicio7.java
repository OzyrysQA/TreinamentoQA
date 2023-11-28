import java.util.Arrays;
import java.util.Random;

public class exercicio7 {
    public static void main(String[] args) {
        int[] vetor1 = gerarVetorAleatorio(50);
        int[] vetor2 = gerarVetorAleatorio(50);
        System.out.println("Vetor 1 (não ordenado):");
        imprimirVetor(vetor1);
        System.out.println("\nVetor 2 (não ordenado):");
        imprimirVetor(vetor2);
        Arrays.sort(vetor1);
        Arrays.sort(vetor2);
        System.out.println("\nVetor 1 (ordenado):");
        imprimirVetor(vetor1);
        System.out.println("\nVetor 2 (ordenado):");
        imprimirVetor(vetor2);
        int[] vetorCombinado = new int[100];
        System.arraycopy(vetor1, 0, vetorCombinado, 0, vetor1.length);
        System.arraycopy(vetor2, 0, vetorCombinado, vetor1.length, vetor2.length);
        Arrays.sort(vetorCombinado);
        System.out.println("\nVetor combinado e ordenado:");
        imprimirVetor(vetorCombinado);
    }
    public static int[] gerarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(1000);
        }
        return vetor;
    }
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}