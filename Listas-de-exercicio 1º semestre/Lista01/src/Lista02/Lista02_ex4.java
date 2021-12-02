/*
4.Faça um programa que receba três notas, calcule e mostre a média aritmética 
entre elas, caso a media aritmética seja:
    • Media maior ou igual a 7 – ALUNO APROVADO
    • Media menor que 7 – ALUNO REPROVADO

 */
package Lista02;

import java.util.Scanner;

/**
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex4 {
    public static void main(String[] args) {
    
    int nota1;
    int nota2;
    int nota3;
    
        Scanner ler = new Scanner(System.in);
    
        System.out.print("Digite sua nota 1: ");
        nota1 = ler.nextInt();
        System.out.print("Digite sua nota 2: ");
        nota2 = ler.nextInt();
        System.out.print("Digite sua nota 3: ");
        nota3 = ler.nextInt();
    
        
    int media = (nota1 + nota2 + nota3)/3;
        
        System.out.println("A média das notas é: " + media);
   
    if(media>=7){
    System.out.println("Aluno foi aprovado");
    }else{
    System.out.println("Aluno foi reprovado");
    }
  }
}
