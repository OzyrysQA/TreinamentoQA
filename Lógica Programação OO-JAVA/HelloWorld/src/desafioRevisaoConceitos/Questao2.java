package desafioRevisaoConceitos;

import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        /*Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a possuir o valor da variável B
         * e a variável B passe a possuir o valor da variável A. Apresente os valores trocados. */
        
        //ENTRADA (Input)
        Integer A =0;
        Integer B =0;
        Integer aux = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um inteiro para a variável A:");
        A = input.nextInt();
        
        System.out.print("Digite um inteiro para a variável B:");
        B = input.nextInt();
        
        System.out.println(String.format("Valor variável A antes troca: %d\nValor variável B antes troca: %d ", A , B));
        
        //PROCESSAMENTO (Processing)
        //Trocando os valores das variáveis entre si utilizando uma variável auxiliar para não perder o valor ao realizar a primeira troca.
        aux = A;
        A = B;
        B = aux;
          
        //SAÍDA (Output)
        System.out.println(String.format("Valor variável A após troca: %d\nValor variável B após troca: %d ", A , B));
    }
}