package TestesDeConhecimento;

public class InvertendoString 
{
    public static void main(String[] args) 
    {
        //Aqui eu defini a palavra que vai ser invertida
        String palavra = "exemplo";
        //Aqui cria uma nova String para armazenar a palavra invertida
        String palavraInvertida = "";

        //Aqui vai percorrer a String de trás para frente
        for (int i = palavra.length() - 1; i >= 0; i--) 
        {
        //e aqui vai adiciona o caractere atual da String original na nova String
            palavraInvertida += palavra.charAt(i);
        }

        //Aqui vai exibir a palavra original na tela
        System.out.println("Palavra original: " + palavra);
        //e aqui exibe a palavra invertida na tela
        System.out.println("Palavra invertida: " + palavraInvertida);
        
        
        //foi legal de fazer este
    }
}