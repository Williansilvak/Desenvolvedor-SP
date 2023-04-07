package TestesDeConhecimento;

public class Fibonacci 
{
	
	public static boolean fibonacci(int n) 
	{
		//Aqui define o primeiro número da sequência de fibonacci
        int a = 0; 
        //Aqui define o segundo número da sequência de fibonacci
        int b = 1; 
        
        //Aqui enquanto o próximo número da sequencia de fibonacci for menor que n
        while (b < n) 
        { 
        //Aqui armazena temporariamente o valor de b
            int temp = b; 
        //Aqui atualiza o valor de b com a soma dos valores anteriores
            b += a; 
        //Aqui atualiza o valor de a com o valor anterior de b (armazenado em temp)
            a = temp;
        }
        //Aqui verifica se o numero n pertence a sequencia de fibonacci ou se e zero (0)
        return b == n || n == 0;
    }

    public static void main(String[] args) 
    {
    	//Aqui define o numero a ser verificado
        int numero = 13;        
        //Aqui verifica se o numero pertence à sequência de fibonacci
        if (fibonacci(numero)) 
        { 
            System.out.println(numero + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence a sequencia de Fibonacci.");
        }
    }
}
