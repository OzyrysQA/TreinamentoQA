import java.util.Scanner;

public class Produto {
public static void main(String[] args) {
   
    
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o produto: ");
    String produto = input.nextLine();
   
    System.out.print("Digite o preço: ");
    float preço = input.nextFloat();
  
    System.out.print("Digite o quantidade: ");
    int quantidade = input.nextInt();
    float valor = quantidade * preço;
    
    if (quantidade <= 10) {
        System.out.println(produto + ", R$ " + valor);
    }else if (quantidade >= 21 && quantidade <= 50){
        float desconto20 = valor * 0.8f;
        System.out.println(produto + ", R$ " + desconto20);
    }else {
        float desconto25 = valor * 0.75f;
        System.out.println(produto + ", R$ " + desconto25);        
    }
}
}
