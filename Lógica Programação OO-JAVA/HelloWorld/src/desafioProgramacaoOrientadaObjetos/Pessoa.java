package desafioProgramacaoOrientadaObjetos;

public class Pessoa {
    /* ##QUESTÃO 15##
     * - Criar uma classe Pessoa, definindo atributos para nome, sobrenome e idade. (OK) 
     * - Criar também um método para escrever os atributos e um método estático main que instancie um objeto da classe Pessoa, 
     *    atualize os valores dos atributos e chame o método de escrita. OK
     */

    private String nome;
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobreNome() {
        return this.sobreNome;
    }
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    public Integer getIdade() {
        return this.idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    private String sobreNome;
    private Integer idade;
    
    @Override
    public String toString() {
        return String.format("Meu nome é %s, meu sobrenome é %s, e minha idade é: %d anos.",this.getNome(), this.getSobreNome(), this.getIdade()) ;
    }
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ozyrys");
        pessoa.setSobreNome("Auler Guimarães");
        pessoa.setIdade(34);
        System.out.println(pessoa);
    }
}


