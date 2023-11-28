import java.util.Scanner;

public class Idade {
public static void main(String[] args) {
    final int RegraMaioridade = 18;
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o primeiro número: ");
    int idade = input.nextInt();
    boolean maiorDeIdade = idade >= RegraMaioridade;
    
    if (idade >= RegraMaioridade) { 
        System.out.println("Maior");
    } else {
        System.out.println("Menor");
    
    }
    
}
}
