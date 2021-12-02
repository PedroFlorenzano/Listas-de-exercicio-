/*
10) Faça um algoritmo que leia 20 números e, ao final, 
escreva quantos estão entre 0 e 100
 */
package Lista03;

import java.util.Scanner;

/**
 *
 * @author Pedro Henrique Damaso
 */
public class Lista03_ex10 {
    public static void main(String[] args) {
    
    int n;
    Scanner ler = new Scanner(System.in);
   
    
    for(int i = 1; i <= 20; i++){
    System.out.print("Digite um número: ");
    n = ler.nextInt();
    
    if(n >= 0 && n<= 100 ){
    System.out.println("Esse número está no intervalo entre 0 e 100");
    } else{
    System.out.println("Esse número não está no intervalo entre 0 e 100");
    }
    } 
 }
}
    
