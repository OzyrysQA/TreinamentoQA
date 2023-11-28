package programacaoJava.exercicioJavaDia3.exercicio3;

public class Produto {
    /**
     * Get do atributo id.
     * @return o atributo id.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Set do atributo id.
     * @param id - conteudo a ser atribuido ao atributo id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get do atributo nome.
     * @return o atributo nome.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Set do atributo nome.
     * @param nome - conteudo a ser atribuido ao atributo nome.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    private int id;
    private String nome;

   public Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
