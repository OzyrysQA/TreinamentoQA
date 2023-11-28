package desafioRevisaoConceitos;

import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        /*Leia dois valores para as vari�veis A e B, e efetuar as trocas dos valores de forma que a vari�vel A passe a possuir o valor da vari�vel B
         * e a vari�vel B passe a possuir o valor da vari�vel A. Apresente os valores trocados. */
        
        //ENTRADA (Input)
        Integer A =0;
        Integer B =0;
        Integer aux = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um inteiro para a vari�vel A:");
        A = input.nextInt();
        
        System.out.print("Digite um inteiro para a vari�vel B:");
        B = input.nextInt();
        
        System.out.println(String.format("Valor vari�vel A antes troca: %d\nValor vari�vel B antes troca: %d ", A , B));
        
        //PROCESSAMENTO (Processing)
        //Trocando os valores das vari�veis entre si utilizando uma vari�vel auxiliar para n�o perder o valor ao realizar a primeira troca.
        aux = A;
        A = B;
        B = aux;
          
        //SA�DA (Output)
        System.out.println(String.format("Valor vari�vel A ap�s troca: %d\nValor vari�vel B ap�s troca: %d ", A , B));
    }
}