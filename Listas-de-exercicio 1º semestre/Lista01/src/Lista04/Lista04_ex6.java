/*
6)Faça um algoritmo que leia vários números inteiros e calcule o 
somatório dos números negativos. O fim da leitura será indicado pelo número 0.
 */
package Lista04;

import java.util.Scanner;


public class Lista04_ex6 {
    public static void main(String[] args) {
         
    int num;
    int soma = 0;
    int qtd = 0;
    Scanner ler = new Scanner (System.in);
    
        do {
            
        System.out.print("Escreva um número (digite 0 para sair): ");
        num = ler.nextInt();  
        
        if(num < 0){
        qtd++;
        soma = soma + num;
        }
      
        } while (num != 0);
        
        System.out.println("A quantidade de números negativos digitados foi: " +qtd);
        System.out.println("A soma dos números negativos é: " + soma);
         
    }
}
