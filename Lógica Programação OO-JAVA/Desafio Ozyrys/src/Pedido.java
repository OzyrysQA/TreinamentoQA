import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import utils.InputReader;

public class Pedido {
    private static  ArrayList<PedidoItem> itens = new ArrayList<PedidoItem>();

    public static ArrayList<PedidoItem> getListaItens() {
        return itens;
    }
    
    public static void limparCarrinho()
    {
        itens = new ArrayList<PedidoItem>();
    }

    public static void adicionarItem() {
        String nome = InputReader.getString("\nInforme o nome do produto: ");

        Produto produto = Estoque.encontrarProduto(nome);

        if (produto == null) {
            System.out.println("\nProduto nao encontrado!");

            return;
        }

        int quantidade = InputReader.getInt("Informe a quantidade: ");

        boolean sucesso = adicionarItem(produto, quantidade);

        if (sucesso)
            System.out.printf("\nAdicionado %d unidade(s) do produto %s com sucesso!\n", quantidade, produto.getNome());
        // Mensagem retirada pois a validação de estoque foi adicionada no método Estoque.baixarEstoque()
        //else
            //System.out.printf("\nNao foi possivel adicionar %d unidades do produto %s!\n", quantidade, produto.getNome());
    }

    public static void imprimirPedido() {
        ArrayList<PedidoItem> listaItens = getListaItens();

        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("|                                PEDIDO                                |");
        System.out.println("|----------------------------------------------------------------------|");
        System.out.println("| ID   | NOME             | PRECO UN     | QUANTIDADE    | TOTAL       |");
        System.out.println("|----------------------------------------------------------------------|");

        if (listaItens.isEmpty()) {
            System.out.println("| Ainda nao existem itens no pedido!                                   |");
        } else {
            for (PedidoItem itemPedido : listaItens) {
                System.out.printf(
                        "| %-4d | %-16s | R$%-10.2f | %-13d | R$%-10.2f|\n",
                        itemPedido.getProduto().getId(),
                        itemPedido.getProduto().getNome(),
                        itemPedido.getProduto().getPreco(),
                        itemPedido.getQuantidade(),
                        itemPedido.getValorTotal());
            }
        }

        System.out.println("|----------------------------------------------------------------------|");
        System.out.printf("| %59s%-9.2f |\n", "R$", getValorTotal());
        System.out.println("------------------------------------------------------------------------");
    }

    public static double getValorTotal() {
        double valorTotal = 0;

        for (PedidoItem itemPedido : getListaItens())
            valorTotal += itemPedido.getValorTotal();

        return valorTotal;
    }

    private static boolean adicionarItem(Produto produto, int quantidade) {
        // Verifica se o item já existe na lista para somar a quantidade de unidades 
        for (PedidoItem itemPedido : getListaItens()) {
            if (itemPedido.getProduto().getNome().equalsIgnoreCase(produto.getNome())) {
                
                //CORREÇÃO DO BUG: Adicionada validação de quantidade de estoque
                if(Estoque.baixarEstoque(itemPedido.getProduto().getId(), quantidade)) {
                    itemPedido.setQuantidade(itemPedido.getQuantidade() + quantidade);
                    return true;
                }else
                {
                    return false;
                }
                
            }
        }
        //CORREÇÃO DO BUG: Adicionada validação de quantidade de estoque, só adiciona item se 
        if(Estoque.baixarEstoque(produto.getId(), quantidade)) {
            itens.add(new PedidoItem(produto, quantidade));
            return true;
        }else {
            return false;
        }
            

       
    }

    public static void realizarPagamento( ) {
        double valorPago = 0;
        Scanner scanner = new Scanner(System.in);
        double valorTotalPedido = getValorTotal();
        if(valorTotalPedido == 0.0) {
            System.out.println("Seu carrinho está vazio, não há necessidade de pagamento.");
            return;
        }
        System.out.println("Por favor informe o valor em dinheiro para realizar o pagamento.");
        valorPago = scanner.nextDouble();
        double troco = valorPago - valorTotalPedido;
        double trocoOriginal = troco;
        if (troco < 0.0) {
            System.out.println("Valor pago é menor que o valor total do pedido. Por favor, pague o valor correto.");
            return;
        }else if (troco == 0.0)
        {
            System.out.println("Você pagou o valor exato do pedido, não há troco.");
            limparCarrinho();
            return;
        }

        double[] notas = {200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01};
        Map<Double, Integer> resultado = new TreeMap<>(Collections.reverseOrder());

        for (double nota : notas) {
            int count = 0;
            while (troco >= nota) {
                troco -= nota;
                count++;
            }
            if (count > 0) {
                resultado.put(nota, count);
            }
        }
        
        System.out.println(String.format("O total do seu troco foi R$ %.2f que será pago com a seguinte quantidade de notas e/ou moedas:", trocoOriginal));
        for (Map.Entry<Double, Integer> entry : resultado.entrySet()) {
            System.out.println(String.format("R$ %.2f: %d", entry.getKey(), entry.getValue()));
        }
        limparCarrinho();
    }
}
