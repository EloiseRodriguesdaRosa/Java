package vetores;
import java.util.Scanner;

//Faça um algoritmo que leia 10 números inteiros e depois imprima os números pares.
public class Exemplo02 {
    
    public void lerImprimirNumeros(){
        
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);
        
        for(int i=0; i<numeros.length; i++){
            System.out.printf("Digite o número %d: ",i+1);
            numeros[i] = scanner.nextInt();
        }
        
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]%2==0){
                System.out.println(numeros[i]);
            }
        }
    }
}
