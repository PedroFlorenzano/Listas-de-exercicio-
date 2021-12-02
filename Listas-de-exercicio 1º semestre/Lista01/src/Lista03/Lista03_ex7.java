/*
7) Leia a idade de 20 pessoas e exiba a média das idades. 
 */
package Lista03;

import java.util.Scanner;

/**
 *
 * @author Pedro Henrique Damaso
 */
public class Lista03_ex7 {
    public static void main(String[] args) {
    
    int idade;
    int media = 0;
    int soma = 0; 
    Scanner ler = new Scanner(System.in);
   
    
    for(int i = 1; i <= 20; i++){
    System.out.print("Digite sua idade: ");
    idade = ler.nextInt();
    soma = soma + idade;
    media = soma/20;
    }
    System.out.println("A média dessas idades é: " + media);
 }
}
