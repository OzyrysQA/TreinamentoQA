package desafioRevisaoConceitos;

import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        /*- Elaborar um algoritmo que leia um n�mero do tipo Inteiro e o atribua � vari�vel numero . 
         * - Ap�s, efetuar uma checagem do valor contido na vari�vel numero , atribuindo o resultado desta checagem a uma vari�vel resultado . 
         * - O resultado deve obedecer as seguintes regras de neg�cio: N�meros positivos ou 0 s�o considerados "Positivo" e n�meros negativos s�o considerados "Negativo". Escrever o resultado da checagem.*/
        
        //ENTRADA (Input)
        Integer numero =0;
        String resultado = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um n�mero inteiro:");
        numero  = input.nextInt();
        
        System.out.println(String.format("Checando n�mero digitado: %d. ", numero));
              
        //PROCESSAMENTO (Processing)
        //Fazendo a checagem do n�mero digitado
       if(numero >=0)
       {
           resultado = "Positivo";
       }else
       {
           resultado = "Negativo";
       }
          
        //SA�DA (Output)
       System.out.println(String.format("Resultado da checagem: %s. ", resultado));
    }
}