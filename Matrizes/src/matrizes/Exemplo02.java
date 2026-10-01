package matrizes;
import java.util.Scanner;

//Faça um algoritmo que receba o número de alunos a serem cadastrados e cadastre 3 notas para cada um dos alunos.
public class Exemplo02 {
    
    public void cadastrarNotas(){
        
        Scanner entrada = new Scanner(System.in);
        double[][] notas;
        
        System.out.println("Informe a quantidade de alunos: ");
        int qntdLinhas = entrada.nextInt();
        
        notas = new double[qntdLinhas][3];
        
        for(int i=0; i<notas.length; i++){
            
            for(int j=0; j<notas[i].length;j++){
                
                System.out.println("Informe a nota "+(j+1)+" do aluno "+(i+1));
                notas[i][j] = entrada.nextDouble();
            }    
        }
        //fim da entrada de dados
        
        //início da saída de dados
        for(int i=0; i<notas.length;i++){
            
            System.out.println("\nNotas do aluno "+(i+1)+": ");
            
            for(int j=0; j<notas[i].length;j++){
                System.out.print(notas[i][j]+" ");
            }
        }
    }
}
 
