package vetores;
import java.util.Scanner;
//Faça um algoritmo que armazene 10 números (double) em um vetor. Em seguida percorra o vetor e descubra qual é o maior valor.
public class Exemplo03 {
    double[] numeros = new double[10];
    Scanner scanner = new Scanner(System.in);
    
    public double maiorValor(){
        
        for(int i=0; i<numeros.length; i++){
            System.out.printf("Informe o %d número: ", (i+1));
            numeros[i] = scanner.nextDouble();
        }
        
        double maior = numeros[0];
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]>maior){
                maior = numeros[i];
            }
        }
        return maior;
    }
}
