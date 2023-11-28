package programacaoJava.exercicioJavaDia1.exercicio2;

/* 2. Refatorar o algoritmo abaixo fazendo com que o método modificarValor consiga alterar com sucesso a variável valor no
     escopo externo, ou seja, no final deve-se escrever 20 ao invés de 10. 
     - Dica: Há no mínimo 2 formas diferentes de se atingir esse objetivo (explorar boxing, métodos com retorno e classes) */
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
