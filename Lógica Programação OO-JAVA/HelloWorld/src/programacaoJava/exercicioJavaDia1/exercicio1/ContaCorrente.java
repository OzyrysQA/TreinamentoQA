package programacaoJava.exercicioJavaDia1.exercicio1;
  
public class ContaCorrente {

    private Double saldo;

    /**
     * Get do atributo saldo.
     * @return o atributo saldo.
     */
    public Double getSaldo() {
        return this.saldo;
    }

    /**
     * Set do atributo saldo.
     * @param saldo - conteudo a ser atribuido ao atributo saldo.
     */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public ContaCorrente(Double saldoInicial){
        this.saldo = saldoInicial;
    }
    
    public void verificarSaldo() {
        System.out.println(String.format("Seu saldo atual é: R$ %.2f", this.getSaldo()));
    }    
    
    public void  depositar(Double valorDeposito){
        this.saldo += valorDeposito;
        System.out.println("Depósito realizado com sucesso!");
    }
    
    public void  sacar(Double valorSaque){
        if(this.saldo <  valorSaque) {
            System.out.println("Você não possui saldo suficiente para realizar esse saque!");
            return;
        }
        //Realiza débito referente ao saque após a validação
        this.saldo -= valorSaque;
        System.out.println("Saque realizado com sucesso!");
    }
}
