import java.util.Scanner;

public class AlgoritmosDeterministicos {
    public static void main(String[] args) {
        /* 
         * Problema: Tornar qualquer n�mero positivo.
         * */
        
    // ENTRADAS (Inputs)
        // Classe que captura informa��es do usu�rio
        System.out.print("Informe um n�mero:");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        
    // PROCESSAMENTO
        numero = Math.abs(numero);
        
    // SA�DA
        System.out.println("N�mero transformado em positivo:" + numero);
}
}
