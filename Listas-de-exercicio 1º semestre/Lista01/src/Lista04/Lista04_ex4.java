/*
4)Escreva um algoritmo que calcule a média dos números digitados pelo usuário, 
se eles forem pares. Termine a leitura se o usuário digitar zero (0).
 */
package Lista04;

import java.util.Scanner;


public class Lista04_ex4 {
    public static void main(String[] args) {
     
    int num1, num2, num3;
    int media = 0;
    int parar;
    Scanner ler = new Scanner (System.in);
        
    
    do {
        
    System.out.print("Primeiro número: ");
    num1 = ler.nextInt();

    System.out.print("Segundo número: ");
    num2 = ler.nextInt();

    System.out.print("Terceiro número: ");
    num3 = ler.nextInt();
   
    if((num1%2 == 0) || (num2%2 == 0) || (num3%2 == 0)){
    
    media = (num1 + num2 + num3)/3;
    
    }  
    
    System.out.print("Digite 0 (zero) se deseja sair ou 1 (um) para reiniciar: ");
    parar = ler.nextInt();
    
    } while (parar != 0);
    
    System.out.println("A médias dos números pares digitados é: " + media);   
    }
}
