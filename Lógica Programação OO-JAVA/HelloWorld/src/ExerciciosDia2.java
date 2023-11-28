import java.util.Scanner;

public class ExerciciosDia2 {
    static final int REGRA_MAIORIDADE = 18;
    
    public static void main(String[] args) {
         //Exercicio1();
        Exercicio2();
    }

    public static void Exercicio1() {
    /*
     * Ler a idade de uma pessoa e escrever se ela � maior de idade oun�o utilizando a estrutura if 
     */
    // ENTRADA (Input)
        System.out.print("Informe a sua idade:");
        Scanner input = new Scanner(System.in);
        int idade = input.nextInt();
        
    // PROCESSAMENTO (Processing)
       String resultado = "Idade informada:" + idade;
       if(idade>=REGRA_MAIORIDADE)
       {
           resultado+= "\nVoc� � maior de idade.";
       }else {
           resultado+= "\nVoc� � menor de idade.";
       }
        
    // SA�DA (Output)
        System.out.println(resultado);
    }
    
    public static void Exercicio2()
    {
    /*
    * 2. Para cada produto lido (nome, pre�o e quantidade), escrever onome do produto comprado e o valor total a ser pago, 
    *considerando que s�o oferecidos descontos pelo n�mero deunidades (quantidade) compradas, segundo as regras de neg�cio abaixo:
    *   - At� 10 unidades - sem desconto
    *  - 21 a 50 unidades - 20% de desconto
    *   - Acima de 50 unidades - 25% de desconto
    * Resolver atrav�s dos comandos de decis�o if, else ou else if
    */
        // ENTRADA (Input)
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o nome do produto:");
        String nomeProduto = input.next();
        
        System.out.print("Informe o pre�o do produto:");
        Float precoProduto = input.nextFloat();
        
        System.out.print("Informe a quantidade do produto:");
        int quantidadeProduto = input.nextInt();
        
    // PROCESSAMENTO (Processing)
       float desconto = 0.0f;
       String textoDesconto =  String.format("Voc� comprou menos de 21 unidades do produto %s, portanto n�o ter� desconto.", nomeProduto); 
       if(quantidadeProduto >= 21 && quantidadeProduto <= 50)
       {
           desconto = 0.20f;
           textoDesconto = String.format("Voc� comprou %d unidades do produto %s, ent�o ganhar� 20%% de desconto.", quantidadeProduto, nomeProduto);
       }else if(quantidadeProduto > 50)
       {
           desconto = 0.25f;
           textoDesconto = String.format("Voc� comprou %d unidades do produto %s, ent�o ganhar� 25%% de desconto.", quantidadeProduto, nomeProduto);
       }
        
       float precoComDesconto = precoProduto * (1 - desconto);
        
    // SA�DA (Output)
        System.out.println(String.format("%s\nPre�o Total: R$ %.2f \nPre�o Total com Desconto: R$ %.2f ", textoDesconto, precoProduto, precoComDesconto));
        
        
      
    
    }
}
