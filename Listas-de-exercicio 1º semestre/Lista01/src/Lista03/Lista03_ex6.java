/*
 6) Leia a idade de 20 pessoas e exiba a soma das idades. 
 */
package Lista03;
import java.util.Scanner;

/**
 *
 * @author Pedro Henrique Damaso
 */
public class Lista03_ex6 {
    public static void main(String[] args) {
    
    int idade;
    int soma = 0;
    Scanner ler = new Scanner(System.in);
   
    
    for(int i = 1; i <= 20; i++){
    System.out.print("Digite sua idade: ");
    idade = ler.nextInt();
    soma = soma + idade;
    }
    System.out.println("A soma dessas idades é: " + soma);
    } 
}
