/*
5.Faça um programa que receba quatro notas, calcule e mostre a média aritmética 
entre elas, caso a media aritmética seja:
• Media maior ou igual a 7 – ALUNO APROVADO
• Media maior ou igual a 5 e menor que 7 – ALUNO DE EXAME FINAL
• Media menor que 5 – ALUNO REPROVADO

 */
package Lista02;

import java.util.Scanner;

 /**
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex5 {
    public static void main(String[] args) {
    
    int nota1;
    int nota2;
    int nota3;
    int nota4;
    int media;
        Scanner ler = new Scanner(System.in);
    
        System.out.print("Digite sua nota 1: ");
        nota1 = ler.nextInt();
        System.out.print("Digite sua nota 2: ");
        nota2 = ler.nextInt();
        System.out.print("Digite sua nota 3: ");
        nota3 = ler.nextInt();
        System.out.print("Digite sua nota 4: ");
        nota4 = ler.nextInt();
    
    media = (nota1 + nota2 + nota3 + nota4)/4;
        
        System.out.println("A média das notas é: " + media);
    
    if(media >=7){
    System.out.println("Aluno foi aprovado");
    }else if(media >=5 && media <7){
    System.out.println("Aluno está de exame final");
    }else{
    System.out.println("Aluno foi reprovado");
    }
  }
}

