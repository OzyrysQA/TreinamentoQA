package programacaoJava.exercicioJavaDia1.exercicio3;

/*3. Criar dentro do m�todo main um algoritmo que percorra todos
os meses e escreva o n�mero do m�s, o nome do m�s (conforme contido no
pr�prio enum) e o n�mero de dias. Por exemplo:
1 JANEIRO - 31 dias (OK)
2 FEVEREIRO - 28 dias (OK)
3 MARCO - 31 dias (OK)
4 ABRIL - 30 dias (OK)
5 MAIO - 31 dias (OK)
6 JUNHO - 30 dias (OK) 
7 JULHO - 31 dias (OK)
8 AGOSTO - 31 dias (OK)
9 SETEMBRO - 30 dias (OK)
10 OUTUBRO - 31 dias (OK)
11 NOVEMBRO - 30 dias (OK)
12 DEZEMBRO - 31 dias (OK)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Imprimindo os meses do ano:");
        for (MesesDoAno mes : MesesDoAno.values()) {
            System.out.println(String.format("M�s n�mero %d - Nome %s - Quantidade de dias: %d", mes.getNumeroDoMes(), mes.name(), mes.getDiasNoMes() ));
            
        }
    }
}
