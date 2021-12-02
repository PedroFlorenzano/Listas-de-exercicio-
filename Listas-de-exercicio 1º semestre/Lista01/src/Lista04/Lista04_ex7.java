/*
7)Faça um algoritmo que leia vários números inteiros e positivos e 
calcule o produtório dos números pares. O fim da leitura será indicado pelo 
número 0.
 */
package Lista04;

import java.util.Scanner;


public class Lista04_ex7 {
    public static void main(String[] args) {
    
    int num;
    int produtorio = 1;
    Scanner ler = new Scanner (System.in);
    
        do {
        
        System.out.print("Escreva um número (digite 0 para sair): ");
        num = ler.nextInt();  
       
        
        if (num % 2 == 0) {
        
        produtorio = produtorio * num;
        
        System.out.println("O produtório dos números pares é: " + produtorio);
        }
        
        } while (num != 0);
        
       
        
        
                
        
    }
}
