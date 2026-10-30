package matrizes;
import java.util.Scanner;
/*Faça um algoritmo que leia uma tabela de valores reais com 2 linhas e 3 colunas
e depois imprima os números ímpares
*/
public class Exemplo03 {
    
    public void receberValores(){
        
        Scanner entrada = new Scanner(System.in);
        double [][] valores = new double[2][3];
        
        for(int i=0;i<valores.length;i++){
            for(int j=0;j<valores[i].length;j++){
                System.out.printf("Informe o valor para a posicao (%d, %d) da tabela:",(i+1),(j+1));
                valores[i][j] = entrada.nextDouble();
            }
        }
        //Fim da entrada de dados
        
        //Início da saída de dados
        for(int i=0;i<valores.length;i++){
            for(int j=0;j<valores[i].length;j++){
                if(valores[i][j]%2==1){
                    System.out.print(valores[i][j]+" ");
                }
            }
        }
    }
}
