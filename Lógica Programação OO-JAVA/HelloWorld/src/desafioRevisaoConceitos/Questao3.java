package desafioRevisaoConceitos;

import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        /*- Elaborar um algoritmo que leia um número do tipo Inteiro e o atribua à variável numero . 
         * - Após, efetuar uma checagem do valor contido na variável numero , atribuindo o resultado desta checagem a uma variável resultado . 
         * - O resultado deve obedecer as seguintes regras de negócio: Números positivos ou 0 são considerados "Positivo" e números negativos são considerados "Negativo". Escrever o resultado da checagem.*/
        
        //ENTRADA (Input)
        Integer numero =0;
        String resultado = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro:");
        numero  = input.nextInt();
        
        System.out.println(String.format("Checando número digitado: %d. ", numero));
              
        //PROCESSAMENTO (Processing)
        //Fazendo a checagem do número digitado
       if(numero >=0)
       {
           resultado = "Positivo";
       }else
       {
           resultado = "Negativo";
       }
          
        //SAÍDA (Output)
       System.out.println(String.format("Resultado da checagem: %s. ", resultado));
    }
}