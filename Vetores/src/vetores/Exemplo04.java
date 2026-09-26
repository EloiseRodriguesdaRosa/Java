package vetores;
import java.util.Scanner;

//Faça um algoritmo que receba 10 números inteiros e depois imprima-os na ordem inversa.
public class Exemplo04 {
    int[] numeros = new int[10];
    Scanner scanner = new Scanner(System.in);
    
    public void imprimirInverso(){
        for(int i=0; i<numeros.length; i++){
            System.out.printf("Informe o %d número: ", (i+1));
            numeros[i] = scanner.nextInt();
        }
        
        for(int i=(numeros.length-1); i>=0; i--){
            System.out.print(numeros[i]+" ");
        }
    }
    
}
