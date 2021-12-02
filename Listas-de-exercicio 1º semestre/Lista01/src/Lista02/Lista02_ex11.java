/*
 11.Faça um programa que receba um número via teclado e 
verifique se este número é par ou ímpar.
 */
package Lista02;

import java.util.Scanner;

/**
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex11 {
    public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);
    int num;
    int resto;
    
    
    System.out.print("Digite um número: ");
    num = ler.nextInt();
    
    resto = num%2;
    
    if(resto==0){
        System.out.println("Esse número é PAR");     
    } else {
        System.out.println("Esse número é ÍMPAR");
    }
    
    
    
    
    
    
    
    
    
    
    }
}
