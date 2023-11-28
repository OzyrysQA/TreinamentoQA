import java.io.File;

import utils.InputReader;
/* DESAFIO PRÁTICO 23/11
 * O desafio consiste na "manutenção" de um projeto pré existente através do repositório.
 * [ERRO A SER CORRIGIDO:] Os operadores do Sistema PoS têm reportado que quando lançam uma venda para o cliente retirar mais tarde, quando o cliente chega para pegar os produtos, identifica-se que não existem mais produtos em estoque, e olhando o sistema, o estoque está negativo. 
 * É necessária uma investigação detalhada para correção do comportamento defeituoso.
 * -----------------------------------------------------------------------------------------------------------------
 * [MODO DE ENTREGA:] OBS: Faça as devidas tarefas que o desafio solicita, e então retorne essas modificações ao repositório remoto através de commits e pushs
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
