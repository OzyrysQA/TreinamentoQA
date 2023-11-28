import java.util.Scanner;

public class AlgoritmosDeterministicos {
    public static void main(String[] args) {
        /* 
         * Problema: Tornar qualquer número positivo.
         * */
        
    // ENTRADAS (Inputs)
        // Classe que captura informações do usuário
        System.out.print("Informe um número:");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        
    // PROCESSAMENTO
        numero = Math.abs(numero);
        
    // SAÍDA
        System.out.println("Número transformado em positivo:" + numero);
}
}
