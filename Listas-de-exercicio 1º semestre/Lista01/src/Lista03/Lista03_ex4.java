/*
  4) Leia o nome e um número qualquer do usuário. Escreva seu nome na 
  tela a mesma quantidade de vezes do número digitado. 
 */
package Lista03;

import java.util.Scanner;

/**
 *
 * @author Pedro Henrique Damaso
 */
public class Lista03_ex4 {
   public static void main(String[] args) {
      
    Scanner ler = new Scanner(System.in);
    String nome;
    int n;
    
    System.out.print("Digite seu nome: ");
    nome = ler.next();
    
    System.out.print("Digite um número: ");
    n = ler.nextInt();
    
    for(int i = 0; i < n; i++){
      System.out.println(nome);   
    }  
  } 
}
