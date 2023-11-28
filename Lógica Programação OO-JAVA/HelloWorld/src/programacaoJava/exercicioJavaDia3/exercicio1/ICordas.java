package programacaoJava.exercicioJavaDia3.exercicio1;

public interface ICordas {
    void afinar();

    default void emitirSom() {
        System.out.println("Som das cordas sendo tocado");
    }
}
