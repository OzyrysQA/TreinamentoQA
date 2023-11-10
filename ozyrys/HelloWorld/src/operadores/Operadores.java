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
        // 1º imprime, depois incrementa pela ordem de precedência
        System.out.println(numero1++);
        // 1º incrementa, depois imprime pela ordem de precedência
        System.out.println(++numero1);
        
        // Atalhos de operadores envolvendo a variável inicial
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
    // Método que realiza uma soma simples
    public static void soma(int a, int b)
    {
        int resultado = a + b;
        System.out.println("Resultado da soma:" + resultado);
    }
    
    // Método que realiza uma subtração simples
    public static void subtracao(int a, int b)
    {
        int resultado = a - b;
        System.out.println("Resultado da subtração:" + resultado);
    }
    
    // Método que realiza uma multriplicação simples
    public static void multriplicacao(int a, int b)
    {
        int resultado = a * b;
        System.out.println("Resultado da multiplicação:" + resultado);
    }
    
    // Método que realiza uma divisão simples
    public static void divisao(float a, float b)
    {
        float resultado = a / b;
        System.out.println("Resultado da divisão:" + resultado);
    }
    
    // Método que realiza uma divisão simples
    public static void restoDivisao(float a, float b)
    {
        float resultado = a % b;
        System.out.println("Resultado do resto da divisão:" + resultado);
    }
       
}
