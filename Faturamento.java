package TestesDeConhecimento;
import java.util.Scanner;

public class Faturamento 
{
    
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        //Aqui estou solicitando o número de dias do mês ao usuário
        System.out.print("Digite o número de dias do mês: ");
        int numDias = teclado.nextInt();
        
        // Criando um vetor para armazenar os valores de faturamento diário        
        double[] faturamento = new double[numDias];
        
        //Aqui solicitamos os valores de faturamento diário ao usuário e
        //estamos armazenando no vetor        
        for (int i = 0; i < numDias; i++) 
        {
            System.out.printf("Digite o faturamento do dia %d: ", i+1);
            faturamento[i] = teclado.nextDouble();
        }
        
        double menorFaturamento = faturamento[0];
        double maiorFaturamento = faturamento[0];
        double somaFaturamento = 0;
        int numDiasComFaturamento = 0;
        
        //Aqui vai Percorrendo o vetor de faturamento diário para encontrar o menor
        //e o maior valor de faturamento, acumular a soma dos valores de
        //Aqui o faturamento valido e contar o número de dias com faturamento valido
        
        for (int i = 0; i < numDias; i++) 
        {
            if (faturamento[i] != 0) {
                //Aqui se o faturamento do dia for diferente de zero, atualizamos
                //Aqui as variáveis de menor e maior faturamento, somamos o
                //Aqui o faturamento ao acumulador e contamos o dia como válido
                if (faturamento[i] < menorFaturamento) 
                {
                    menorFaturamento = faturamento[i];
                }
                if (faturamento[i] > maiorFaturamento) 
                {
                    maiorFaturamento = faturamento[i];
                }
                somaFaturamento += faturamento[i];
                numDiasComFaturamento++;
            }
        }
        
        double mediaMensal = somaFaturamento / numDiasComFaturamento;
        
        //aqui estamos contando o numero de dias em que o faturamento diário foi superior
        //e a media mensal
        int numDiasAcimaMedia = 0;
        for (int i = 0; i < numDias; i++) 
        {
            if (faturamento[i] > mediaMensal) 
            {
                numDiasAcimaMedia++;
            }
        }
        //Aqui estamos imprimindo os resultados na tela        
        System.out.printf("Menor faturamento: R$ %.2f%n", menorFaturamento);
        System.out.printf("Maior faturamento: R$ %.2f%n", maiorFaturamento);
        System.out.printf("Número de dias com faturamento acima da média mensal: %d%n", numDiasAcimaMedia);
    
        //Nao consegui fazer com json ou xml
        teclado.close();
    }
}
