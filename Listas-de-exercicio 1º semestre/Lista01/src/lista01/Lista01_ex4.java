/*
    
  4. Construa um algoritmo que calcule o antecessor 
     e sucessor de um número qualquer.

 */
package lista01;
import java.util.Scanner;


public class Lista01_ex4 {
     public static void main (String[] args){
        //ENTRADA
        int numero = 10;
        int antecessor;
        int sucessor;
        
        //PROCESSAMENTO
        antecessor = numero - 1;
        sucessor = numero + 1;
        //SAIDA
         System.out.println("antecessor: " + antecessor);
         System.out.println("sucessor: " + sucessor);
    }
}
