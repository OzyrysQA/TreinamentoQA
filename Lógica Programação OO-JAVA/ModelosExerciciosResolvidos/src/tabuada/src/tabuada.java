import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite número: ");
        int numero = input.nextInt();
      
        
        for (int multiplicador = 1; multiplicador <=10; multiplicador++) { 
            System.out.println(multiplicador + " x " + numero + " = " + numero*multiplicador);
        
    }
}
}