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
        System.out.println(String.format("Seu saldo atual �: R$ %.2f", this.getSaldo()));
    }    
    
    public void  depositar(Double valorDeposito){
        this.saldo += valorDeposito;
        System.out.println("Dep�sito realizado com sucesso!");
    }
    
    public void  sacar(Double valorSaque){
        if(this.saldo <  valorSaque) {
            System.out.println("Voc� n�o possui saldo suficiente para realizar esse saque!");
            return;
        }
        //Realiza d�bito referente ao saque ap�s a valida��o
        this.saldo -= valorSaque;
        System.out.println("Saque realizado com sucesso!");
    }
}
