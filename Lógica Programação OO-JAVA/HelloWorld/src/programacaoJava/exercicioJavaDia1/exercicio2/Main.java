package programacaoJava.exercicioJavaDia1.exercicio2;

/* 2. Refatorar o algoritmo abaixo fazendo com que o m�todo modificarValor consiga alterar com sucesso a vari�vel valor no
     escopo externo, ou seja, no final deve-se escrever 20 ao inv�s de 10. 
     - Dica: H� no m�nimo 2 formas diferentes de se atingir esse objetivo (explorar boxing, m�todos com retorno e classes) */
public class Main {
    static int  valor = 0;
    public static void main(String[] args) {
        Main.valor = 10;
        modificarValor(20);
        System.out.println("Valor: " + valor);
    }

    public static void modificarValor(int novoValor) {
        Main.valor = novoValor;
    }
}
