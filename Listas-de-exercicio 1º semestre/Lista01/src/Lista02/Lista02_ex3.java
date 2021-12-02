/*
3. Faça um programa para ler um inteiro e imprimir uma mensagem caso ele 
seja menor que 3 ou maior que 25.
 */
package Lista02;
import java.util.Scanner;

/**
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex3 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
     
    int num;
     
    System.out.print("Digite um número inteiro menor que 3 ou maior que 25: ");
    num = ler.nextInt();
    
    
    if(num<3||num>25){
    System.out.println("Esse número É menor que 3 ou maior que 25");
    } else{
    System.out.println("Esse número NÃO é menor que 3 ou maior que 25");
    }
}
}
