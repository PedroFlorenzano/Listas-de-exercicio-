/*
8)Uma empresa deseja aumentar seus preços em 20%. Faça um algoritmo que leia o 
código e o preço de custo de cada produto e calcule o preço novo. Calcule também
a média dos preços com e sem aumento. Mostre o código e o preço novo de cada 
produto e, no final, as médias. A entrada de dados deve terminar quando for 
lido um código de produto negativo.
 */
package Lista04;

import java.util.Scanner;

public class Lista04_ex8 {
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);   
    int prod1, prod2, prod3, prod4;
    int prod1n, prod2n, prod3n, prod4n;
    int cod1, cod2, cod3, cod4;
    int mediaA, mediaS;
  
        
        do {
    System.out.println("Para encerrar o processo digite um número negativo na "
            + "parte de código dos produtos."); 
    
    System.out.print("Código do produto 1: ");
    cod1 = ler.nextInt();
    System.out.print("Preço do produto 1: ");
    prod1 = ler.nextInt();
    
    System.out.print("Código do produto 2: ");
    cod2 = ler.nextInt();
    System.out.print("Preço do produto 2: ");
    prod2 = ler.nextInt();
    
    System.out.print("Código do produto 3: ");
    cod3 = ler.nextInt();
    System.out.print("Preço do produto 3: ");
    prod3 = ler.nextInt();    
        
    System.out.print("Código do produto 4: ");
    cod4 = ler.nextInt();
    System.out.print("Preço do produto 4: ");
    prod4 = ler.nextInt();    
    
    prod1n = (int) (prod1 * 1.2);
    prod2n = (int) (prod2 * 1.2);
    prod3n = (int) (prod3 * 1.2);
    prod4n = (int) (prod4 * 1.2);
   
    
    mediaA = (int) ((int) (prod1 * 1.2) + (prod2 * 1.2) + (prod3 * 1.2) + (prod4 * 1.2))/4;
    
    mediaS = (prod1 + prod2 + prod3 + prod4)/4;
    
    
    
    } while (cod1 >= 0 && cod2 >= 0 && cod3 >= 0 && cod4 >= 0);
    
    System.out.println("O valor dos produtos com aumento de 20% é de:" );
    System.out.println("Produto 1 (código " + cod1 + "): R$"  + prod1n );
    System.out.println("Produto 2 (código " + cod2 + "): R$"  + prod2n );
    System.out.println("Produto 3 (código " + cod3 + "): R$"  + prod3n );
    System.out.println("Produto 4 (código " + cod4 + "): R$"  + prod4n );
    
    System.out.println("A média dos preços dos produtos com aumento de 20% é: " + mediaA);
    System.out.println("A média dos preços dos produtos sem aumento é: " + mediaS);   
        
    }
}
