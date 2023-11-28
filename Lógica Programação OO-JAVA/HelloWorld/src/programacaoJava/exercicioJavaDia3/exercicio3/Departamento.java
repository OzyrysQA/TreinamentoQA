package programacaoJava.exercicioJavaDia3.exercicio3;

import java.util.ArrayList;

public class Departamento {
    /**
     * Get do atributo id.
     * 
     * @return o atributo id.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Set do atributo id.
     * 
     * @param id
     *            - conteudo a ser atribuido ao atributo id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get do atributo nome.
     * 
     * @return o atributo nome.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Set do atributo nome.
     * 
     * @param nome
     *            - conteudo a ser atribuido ao atributo nome.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Get do atributo produtos.
     * 
     * @return o atributo produtos.
     */
    public ArrayList<Produto> getProdutos() {
        return this.produtos;
    }

    /**
     * Set do atributo produtos.
     * 
     * @param produtos
     *            - conteudo a ser atribuido ao atributo produtos.
     */
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    private int id;
    private String nome;
    private ArrayList<Produto> produtos;

    public Departamento(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println(String.format("Produto %s adicionado com sucesso ao departamento %s.", produto.getNome(), this.nome));
    }

    public boolean removerProduto(int produtoId) {
        boolean removed = produtos.removeIf(produto -> produto.getId() == produtoId);
        if (removed) {
            System.out.println(String.format("Produto de ID %d removido com sucesso do departamento %s.", produtoId, this.nome));
        } else {
            System.out.println(String.format("Produto de ID %d não encontrado no departamento %s.", produtoId, this.nome));
        }
        return removed;
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println(String.format("Não há produtos no departamento %s.", this.nome));
        } else {
            System.out.println(String.format("Lista de Produtos no departamento %s:", this.nome));
            for (Produto produto : produtos) {
                System.out.println(String.format("Produto ID %d - Nome: %s", produto.getId(), produto.getNome()));
            }
        }
    }

    public boolean buscarProdutoPorID(int produtoId) {
        if (produtos.isEmpty()) {
            System.out.println(String.format("Não há produtos no departamento %s.", this.nome));

        } else {
            for (Produto produto : produtos) {
                if (produto.getId() == produtoId) {
                    System.out.println(String.format("O produto %s de ID %d foi encontrado no departamento %s", produto.getNome(), produto.getId(), this.nome));
                    return true;
                }
            }
            System.out.println(String.format("O produto de ID %d não foi encontrado no departamento %s", produtoId, this.nome));

        }
        return false;
    }
}
