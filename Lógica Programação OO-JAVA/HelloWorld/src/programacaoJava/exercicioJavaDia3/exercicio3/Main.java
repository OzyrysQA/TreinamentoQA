package programacaoJava.exercicioJavaDia3.exercicio3;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Departamento roupas = new Departamento(1, "Roupas");
        Departamento eletronicos = new Departamento(2, "Eletrônicos");
        Departamento brinquedos = new Departamento(3, "Brinquedos");
        Departamento alimentos = new Departamento(4, "Alimentos");
        Departamento esportes = new Departamento(5, "Esportes");

        roupas.adicionarProduto(new Produto(101, "Camiseta"));
        eletronicos.adicionarProduto(new Produto(102, "TV"));
        brinquedos.adicionarProduto(new Produto(103, "Boneca"));
        alimentos.adicionarProduto(new Produto(104, "Pão"));
        esportes.adicionarProduto(new Produto(105, "Bola"));

        loja.adicionarDepartamento(roupas);
        loja.adicionarDepartamento(eletronicos);
        loja.adicionarDepartamento(brinquedos);
        loja.adicionarDepartamento(alimentos);
        loja.adicionarDepartamento(esportes);

        loja.listarDepartamentos();

        loja.consultarDepartamentoProdutoPorId(101);
        roupas.removerProduto(101);
        roupas.removerProduto(666);
        loja.consultarDepartamentoProdutoPorId(101);
        
        loja.removerDepartamento(1);

        loja.listarDepartamentos();
        
        loja.removerDepartamento(2);
        loja.removerDepartamento(3);
        loja.removerDepartamento(4);
        loja.removerDepartamento(5);
        loja.removerDepartamento(666);
        
        loja.listarDepartamentos();
    }
}
