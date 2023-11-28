package programacaoJava.exercicioJavaDia3.exercicio1;

public class Violao implements IInstrumentoMusical, ICordas {
    @Override
    public void emitirSom() {
        System.out.println("Som do violão sendo tocado");
    }

    @Override
    public void afinar() {
        System.out.println("Violão sendo afinado");
    }
}