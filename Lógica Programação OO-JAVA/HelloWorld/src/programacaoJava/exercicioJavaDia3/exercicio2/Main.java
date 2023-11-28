package programacaoJava.exercicioJavaDia3.exercicio2;


/*
#################################################################################################################

3. Criar um mini sistema de agenda telef�nica, contendo, no m�nimo, opera��es de adi��o e dele��o de n�meros 
telef�nicos (organizar com vetor)

#################################################################################################################
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendaTelefonica agenda = new AgendaTelefonica();
        int opcao = 0;
        do{
            System.out.println("\nEscolha uma op��o:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Deletar contato");
            System.out.println("3. Listar contatos");
            System.out.println("4. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o n�mero de telefone a ser adicionado: ");
                    String numero = scanner.nextLine();
                    agenda.adicionarContato(numero);
                    break;
                case 2:
                    System.out.print("Digite o n�mero de telefone a ser deletado: ");
                    numero = scanner.nextLine();
                    agenda.deletarContato(numero);
                    break;
                case 3:
                    agenda.listarContatos();
                    break;
                case 4:
                    System.out.println("Saindo da agenda telef�nica.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Op��o inv�lida. Tente novamente.");
                    break;
            }
        }while(opcao !=4);
    }
}