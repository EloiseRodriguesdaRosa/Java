//Aqui todos os exemplos são testados
package vetores;

public class Vetores {

    
    public static void main(String[] args) {
        //Exemplo01:
        System.out.println("30 notas preenchidas:");
        Exemplo01 exemplo1 = new Exemplo01();
        exemplo1.preencher30Notas();
        
        System.out.println("\nPreencher 5 notas manualmente:");
        Exemplo01 exemplo2 = new Exemplo01();
        exemplo2.preencher5Notas();
        
        //Exemplo02:
        System.out.println("\nLer 10 números inteiros e imprimir somente os pares.");
        Exemplo02 exemplo3 = new Exemplo02();
        exemplo3.lerImprimirNumeros();
    }
    
}
