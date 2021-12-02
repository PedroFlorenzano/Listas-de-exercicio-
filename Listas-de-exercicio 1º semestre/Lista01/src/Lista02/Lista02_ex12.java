/*
 12.Faça um programa que receba 3 números via teclado e imprima o maior deles.
 */
package Lista02;
import java.util.Scanner;
/**
 *
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex12 {
    public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in); 
    int num1;
    int num2;
    int num3;

    
    System.out.print("Digite o primeiro número: ");
    num1 = ler.nextInt();
     
    System.out.print("Digite o segundo número: ");
    num2 = ler.nextInt();
     
    System.out.print("Digite o terceiro número: ");
    num3 = ler.nextInt();
      
  
    if(num1>num2 && num1>num3){
       System.out.println("O primeiro número é o maior: " + num1);
    }else if(num2>num1 && num2>num3 ){
       System.out.println("O segundo número é o maior: " + num2);
    }else if(num3>num1 && num3>num2 ){
        System.out.println("O terceiro número é o maior: " + num3);
    }else if (num1 == num2 && num1 == num3){
        System.out.println("Todos os números são iguais");
    }
 }
}
