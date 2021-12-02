/*
9) Escreva um algoritmo que leia 20 números do usuário e exiba 
quantos números são pares.
 */
package Lista03;

import java.util.Scanner;

/**
 *
 * @author Pedro Henrique Damaso
 */
public class Lista03_ex9 {
 public static void main(String[] args) {
    
    int n;
    Scanner ler = new Scanner(System.in);
   
    
    for(int i = 1; i <= 20; i++){
    System.out.print("Digite um número: ");
    n = ler.nextInt();
    
    if(n % 2 == 0){
    System.out.println("Esse número é par");
    } else{
    System.out.println("Esse número é impar");
    }
    } 
 }
}
   
