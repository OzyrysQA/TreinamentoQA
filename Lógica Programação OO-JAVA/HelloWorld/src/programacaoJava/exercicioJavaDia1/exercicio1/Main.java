package programacaoJava.exercicioJavaDia1.exercicio1;

import java.util.Scanner;
// Refatorar o algoritmo estruturado abaixo, o alterando para uma abordagem orientada a objetos:
public class Main {
    public static double saldo = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente(100d);
        int opcao = 0;
        do {
       
            System.out.println("1. Verificar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
             opcao = scanner.nextInt();
             Double valor =0d;
            switch (opcao) {
            case 1:
                conta.verificarSaldo();
                break;
            case 2:
                System.out.print("Digite o valor a ser depositado: ");
                valor = scanner.nextDouble();
                conta.depositar(valor);
                break;    
            case 3:
                System.out.print("Digite o valor a ser sacado: ");
                valor = scanner.nextDouble();
                conta.sacar(valor);
                break;   
            default:
                System.out.println("Opção inválida, favor escolha uma opção válida!");
                break;
            }
            
        }while (opcao !=0) ;
    }
}
