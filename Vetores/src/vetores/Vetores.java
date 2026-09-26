//Aqui todos os exemplos de vetores são testados.
package vetores;

public class Vetores {

    
    public static void main(String[] args) {
        //Exemplo01:
        System.out.println("Imprimir 30 notas preenchidas:");
        Exemplo01 exemplo1 = new Exemplo01();
        exemplo1.preencher30Notas();
        
        System.out.println("\nImprimir 5 notas que serão preenchidas manualmente:");
        Exemplo01 exemplo2 = new Exemplo01();
        exemplo2.preencher5Notas();
        
        //Exemplo02:
        System.out.println("\nLer 10 números inteiros e imprimir somente os pares.");
        Exemplo02 exemplo3 = new Exemplo02();
        exemplo3.lerImprimirNumeros();
        
        //Exemplo03
        System.out.println("\nExibir o maior entre 10 números recebidos: ");
        Exemplo03 exemplo4 = new Exemplo03();
        System.out.println(exemplo4.maiorValor());
       
        //Exemplo04
        System.out.println("\nImprimir 10 números digitados na ordem inversa: ");
        Exemplo04 exemplo5 = new Exemplo04();
        exemplo5.imprimirInverso();
    }
    
}
