import java.io.File;

import utils.InputReader;
/* DESAFIO PR�TICO 23/11
 * O desafio consiste na "manuten��o" de um projeto pr� existente atrav�s do reposit�rio.
 * [ERRO A SER CORRIGIDO:] Os operadores do Sistema PoS t�m reportado que quando lan�am uma venda para o cliente retirar mais tarde, quando o cliente chega para pegar os produtos, identifica-se que n�o existem mais produtos em estoque, e olhando o sistema, o estoque est� negativo. 
 * � necess�ria uma investiga��o detalhada para corre��o do comportamento defeituoso.
 * -----------------------------------------------------------------------------------------------------------------
 * [MODO DE ENTREGA:] OBS: Fa�a as devidas tarefas que o desafio solicita, e ent�o retorne essas modifica��es ao reposit�rio remoto atrav�s de commits e pushs
 */


public class App {
    public static final String DiretorioResources = System.getProperty("user.dir") + File.separator + "resources";

    public static void main(String[] args) throws Exception {
        Estoque.inicializar();

        boolean sair = false;
        do {
            sair = Menu.selecionarOpcao();
        } while (!sair);

        InputReader.finalizar();
      
    }
}
