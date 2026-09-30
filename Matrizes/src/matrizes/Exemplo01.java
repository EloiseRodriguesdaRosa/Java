package matrizes;

//Faça um algoritmo que percorra uma matriz e preencha todos os seus campos com o valor 2. Em seguida imprima a matriz.
public class Exemplo01 {
    
    public void percorrerMatriz(){
        
        int qntdLinhas = 3;
        int qntdColunas = 5;
        int [][] minhaMatriz = new int[qntdLinhas][qntdColunas];
        
        for(int linhas=0; linhas<qntdLinhas; linhas++){
            
            System.out.println(" ");
            
            for(int colunas=0; colunas<qntdColunas; colunas++){
                
                minhaMatriz [linhas][colunas] = 2;
                System.out.print(minhaMatriz[linhas][colunas]+" ");
                
            }
        }
    }
}
