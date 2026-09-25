package vetores;
import java.util.Scanner;
public class Exemplo01 {
    
    // 1-Faça um vetor de notas com 30 posições, todas preenchidas com valor 5.5, e imprima.
    public void preencher30Notas(){
        double[] notas;
        notas = new double[30];
    
    for(int i=0; i<30; i++){
        notas[i] = 5.5;
        System.out.println("Nota "+(i+1)+": "+notas[i]);
    }
    
    }
    
    public void preencher5Notas(){
        
        //2-Faça um vetor de notas com 5 posições, onde as notas possam ser preenchidas manualmente, e imprima.
        Scanner scanner = new Scanner(System.in);
        
        double[] notas = new double[5];
        
        for(int i=0; i<5; i++){
            System.out.printf("Digite a nota %d: ",(i+1));
            notas[i] = scanner.nextDouble();
        }
        
        for(int i=0; i<5;i++){
            System.out.println("Nota "+(i+1)+": "+notas[i]);
        }
    }
    
}
