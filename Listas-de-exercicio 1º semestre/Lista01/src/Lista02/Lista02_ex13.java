/*
 13.Faça um programa que recebe dois números e efetua a adição entre eles. 
Caso o valor somado seja maior que 20, este deverá ser apresentado 
somando-se a ele 8; caso o valor somado seja menor ou igual a 20, 
este deverá ser apresentado subtraindo-se 5.
 */
package Lista02;
import java.util.Scanner;

/**
 *
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex13 {
   public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);  
    int num1;
    int num2;
    int soma;
    
    
    System.out.print("Digite o primeiro número: ");
    num1 = ler.nextInt();
     
    System.out.print("Digite o segundo número: ");
    num2 = ler.nextInt();
    
    soma = num1 + num2;
    
    System.out.println("A soma deles dá: " + soma);

    
    if(soma>20){
     System.out.println("Soma + 8 =  " + (soma+8));
    }else if (soma <= 20){
     System.out.println("Soma - 5 =  " + (soma-5));
    }
   
   
 }
}
