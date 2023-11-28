package programacaoJava.exercicioJavaDia3.exercicio1;

/*
#################################################################################################################

1. Criar um esquema de interfaces através das seguintes etapas:

1. Criar uma interface `IInstrumentoMusical` contendo um método com a *assinatura* `void emitirSom()`
2. Criar uma interface `ICordas` contendo um método com a *assinatura* `void afinar()` e outro método 
`default void emitirSom()`, atentando-se que será necessária a implementação de um corpo (body) para este último
3. Criar uma classe `Piano` *implementando* a interface `IInstrumentoMusical`. Implementar corpo (body) para o(s) 
método(s) que a interface exigir
4. Criar uma classe `Ukulele` *implementando* a interface `ICordas`. Implementar corpo (body) para o(s) método(s) 
que a interface exigir
5. Criar uma classe `Violao` *implementando* tanto a interface `IInstrumentoMusical` quanto a `ICordas`. 
Implementar corpo (body) para o(s) método(s) que as interfaces exigirem

#################################################################################################################
*/

public class Main {
    public static void main(String[] args) {
        IInstrumentoMusical piano = new Piano();
        ICordas ukulele = new Ukulele();
        IInstrumentoMusical violao = new Violao();

        piano.emitirSom();
        ukulele.afinar();
        ukulele.emitirSom();
        violao.emitirSom();
        ((Violao) violao).afinar();
    }
}

// Lembre-se de organizar as classes e interfaces em pacotes correspondentes em
// seu projeto Java, pois isso é uma boa prática de organização de código.
