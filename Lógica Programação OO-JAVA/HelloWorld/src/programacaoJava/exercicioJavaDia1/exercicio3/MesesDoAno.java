package programacaoJava.exercicioJavaDia1.exercicio3;
/* 3. Criar um enum MesesDoAno que contemple cada um dos meses do ano,
armazenando os equivalentes numéricos desses meses.
Exemplo: DEZEMBRO(12). Após, vincular também a cada um desses meses o
seu respectivo número de dias (ignorar a lógica de ano bissexto em Fevereiro,
ou seja, trabalhar sempre com 28 dias). Dica: estado dentro de enums.*/
public enum MesesDoAno {
    JANEIRO(1, 31),
    FEVEREIRO(2, 28),
    MARCO(3, 31),
    ABRIL(4, 30),
    MAIO(5, 31),
    JUNHO(6, 30),
    JULHO(7, 31),
    AGOSTO(8, 31),
    SETEMBRO(9, 30),
    OUTUBRO(10, 31),
    NOVEMBRO(11, 30),
    DEZEMBRO(12, 31);

    private final int NUMERO_DO_MES;
    private final int DIAS_NO_MES;

    MesesDoAno(int numero, int dias) {
        this.NUMERO_DO_MES = numero;
        this.DIAS_NO_MES = dias;
    }

    public int getNumeroDoMes() {
        return NUMERO_DO_MES;
    }

    public int getDiasNoMes() {
        return DIAS_NO_MES;
    }
}
