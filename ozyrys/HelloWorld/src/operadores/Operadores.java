package operadores;

public class Operadores {
    public static void main(String[] args)
    {
        int numero1 =5;
        int numero2 = numero1;
        System.out.println(numero1 + " "  + numero2);
        // Testando Operadores
        soma(5,5);
        subtracao(5,5);
        multriplicacao(5,5);
        divisao(5,5);
        restoDivisao(5,4);
        
        // Testando incremento / decremento
        numero1 = 0;
        numero1++;
        numero1--;
        // 1� imprime, depois incrementa pela ordem de preced�ncia
        System.out.println(numero1++);
        // 1� incrementa, depois imprime pela ordem de preced�ncia
        System.out.println(++numero1);
        
        // Atalhos de operadores envolvendo a vari�vel inicial
        numero1 = 1;
        numero1 +=1;
        System.out.println(numero1);
        numero1 -=1;
        System.out.println(numero1);
        numero1 *=1;
        System.out.println(numero1);
        numero1 /=1;
        System.out.println(numero1);
    }
    // M�todo que realiza uma soma simples
    public static void soma(int a, int b)
    {
        int resultado = a + b;
        System.out.println("Resultado da soma:" + resultado);
    }
    
    // M�todo que realiza uma subtra��o simples
    public static void subtracao(int a, int b)
    {
        int resultado = a - b;
        System.out.println("Resultado da subtra��o:" + resultado);
    }
    
    // M�todo que realiza uma multriplica��o simples
    public static void multriplicacao(int a, int b)
    {
        int resultado = a * b;
        System.out.println("Resultado da multiplica��o:" + resultado);
    }
    
    // M�todo que realiza uma divis�o simples
    public static void divisao(float a, float b)
    {
        float resultado = a / b;
        System.out.println("Resultado da divis�o:" + resultado);
    }
    
    // M�todo que realiza uma divis�o simples
    public static void restoDivisao(float a, float b)
    {
        float resultado = a % b;
        System.out.println("Resultado do resto da divis�o:" + resultado);
    }
       
}
