/*
5) Escreva um algoritmo que leia 10 números do usuário 
e calcule a soma desses números. 
 */
package Lista03;

import java.util.Scanner;

/**
 *
 * @author Pedro Henrique Damaso
 */
public class Lista03_ex5 {
    public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);
    int soma = 0;
    int numero;
    
    for(int i = 1; i<=10; i++){
    System.out.print("Digite um número: ");
    numero = ler.nextInt();
    
    soma = soma + numero;  
    }
    System.out.println("A soma desses números é: " + soma);     
  }  
}
