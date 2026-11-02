package metodos;
import java.util.Scanner;
public class Metodos {
    /*1- Crie uma função que receba o valor do produto e a porcentagem de desconto e retorne o valor
    do produto considerando esse desconto*/ 
    public static double valorProdutoComDesconto(double valorProduto, double desconto){
        double produtoComDesconto = valorProduto - (valorProduto*(desconto/100));
        return produtoComDesconto;
     
    }
    
    /*2- Crie um método que transforme um vetor em texto*/
    public static String transformaVetorEmTexto(int vetor[]){
        String texto = "";
        for(int i=0; i<vetor.length;i++){
            texto += vetor[i]+" ";
        }
        return texto;
    }
    /*3- Crie um método que recebe um vetor de números inteiros e inverte os números dele*/
    public static void inverterVetor(int vetor[]){
       for(int i=0; i<vetor.length/2;i++){
           int auxiliar = vetor[i];
           vetor[i] = vetor[vetor.length-1-i];
           vetor[vetor.length-1-i] = auxiliar;
       }
    }
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //1-
        /*System.out.println("Informe o valor do produto: ");
        double valorProduto = entrada.nextDouble();
        System.out.println("Informe o desconto do produto em %: ");
        double desconto = entrada.nextDouble();
        
        System.out.println(valorProdutoComDesconto(valorProduto, desconto));*/
        
        //3-
        int vetor[] = {1, 2, 3, 4, 5};
        inverterVetor(vetor);
        System.out.println(transformaVetorEmTexto(vetor));
    }
    
}
