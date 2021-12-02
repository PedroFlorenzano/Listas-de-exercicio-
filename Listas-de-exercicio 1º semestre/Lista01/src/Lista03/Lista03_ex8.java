/*
8) Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade. 
 */
package Lista03;

import java.util.Scanner;

/**
 *
 * @author Pedro Henrique Damaso
 */
public class Lista03_ex8 {
    public static void main(String[] args) {
    
    int idade;
    Scanner ler = new Scanner(System.in);
   
    
    for(int i = 1; i <= 20; i++){
    System.out.print("Digite sua idade: ");
    idade = ler.nextInt();
    
    if(idade > 18){
    System.out.println("Essa pessoa é maior de idade.");
    } else{
    System.out.println("Essa pessoa é menor de idade.");
    }
    } 
 }
}
