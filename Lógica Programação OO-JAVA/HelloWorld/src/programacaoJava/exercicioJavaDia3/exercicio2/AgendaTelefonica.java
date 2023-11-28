package programacaoJava.exercicioJavaDia3.exercicio2;


import java.util.ArrayList;

public class AgendaTelefonica {
    private ArrayList<String> contatos;

    public AgendaTelefonica() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(String numero) {
        contatos.add(numero);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void deletarContato(String numero) {
        if (contatos.remove(numero)) {
            System.out.println("Contato deletado com sucesso!");
        } else {
            System.out.println("Contato não encontrado na agenda.");
        }
    }

    public void listarContatos() {
        System.out.println("Lista de Contatos na Agenda:");
        int i = 1;
        for (String contato : contatos) {
            System.out.println(i + ". " + contato);
            i++;
        }
    }
}
