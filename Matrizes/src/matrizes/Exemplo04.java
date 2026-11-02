package matrizes;
import java.util.Scanner;

/*Faça um algoritmo que armazene 20 números em uma matriz de 5 linhas por 4 colunas e depois
percorre e descobre qual é o maior valor.
*/
public class Exemplo04 {
    
    public String descobreMaiorValor(){
        double matriz[][] = new double [5][4];
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.printf("Informe o valor [%d][%d] da matriz: ", i, j);
                matriz[i][j] = entrada.nextDouble();
            }
        }
        //fim da entrada de dados
        
        //Conferir qual é o maior valor
        double maior_valor = matriz[1][1];
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                if(matriz[i][j]>maior_valor){
                    maior_valor = matriz[i][j];
                }
            }
        }
        return "O maior valor da matriz é: " + maior_valor;
    }
    
}
