package programacaoJava.exercicioJavaDia3.exercicio3;

import java.util.ArrayList;

public class Loja {
    private ArrayList<Departamento> departamentos;

    /**
     * Get do atributo departamentos.
     * @return o atributo departamentos.
     */
    public ArrayList<Departamento> getDepartamentos() {
        return this.departamentos;
    }

    /**
     * Set do atributo departamentos.
     * @param departamentos - conteudo a ser atribuido ao atributo departamentos.
     */
    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public Loja() {
        departamentos = new ArrayList<>();
    }

    public void adicionarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
        System.out.println(String.format("Departamento %s adicionado com sucesso.", departamento.getNome()));
    }

    public void removerDepartamento(int departamentoId) {
        boolean removed = departamentos.removeIf(departamento -> departamento.getId() == departamentoId);
        if (removed) {
            System.out.println(String.format("Departamento de ID %d removido com sucesso.", departamentoId));
        } else {
            System.out.println(String.format("Departamento de ID %d não encontrado.", departamentoId));
        }
    }

    public  void listarDepartamentos() {
        if (departamentos.isEmpty()) {
            System.out.println("Não há departamentos na loja BanriShopping.");
        } else {
            for (Departamento departamento : departamentos) {
                departamento.listarProdutos();
            }
        }
    }
    
    public void consultarDepartamentoProdutoPorId(int produtoId) {
        for (Departamento departamento : departamentos) {
            if(departamento.buscarProdutoPorID(produtoId))
            {
                break;
            }
        }
    
    }
}
