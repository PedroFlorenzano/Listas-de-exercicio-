/*
6.Faça um programa que receba quatro notas, sendo que cada nota só poderá 
receber valores de 0 a 10, calcule e mostre a média aritmética entre elas, 
caso a media aritmética seja:
 • Media maior ou igual a 7 – ALUNO APROVADO
 • Media maior ou igual a 5 e menor que 7 – ALUNO DE EXAME FINAL
 • Media menor que 5 – ALUNO REPROVADO

 */
package Lista02;
import java.util.Scanner;

/**
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex6 {
    public static void main(String[] args) {
    
    int nota1;
    int nota2;
    int nota3;
    int nota4;
    int media;
    Scanner ler = new Scanner(System.in);
    
    
    do{
      System.out.println(" Digite a nota 1: ");
      nota1 = ler.nextInt();
      
    }while(nota1 < 0 && nota1 > 10); 
    
    System.out.print("Digite a nota 2: ");
    nota2 = ler.nextInt();
    
    if(nota2 >= 0 && nota2 <= 10){
      System.out.println("Nota 2 = " + nota2);
    }else{
     System.out.println("Nota 2 inválida. Repita a nota por favor");
     System.out.print("Digite a nota 2: ");
     nota2 = ler.nextInt();
    }
    
    System.out.print("Digite a nota 3: ");
    nota3 = ler.nextInt();
    
    if(nota3 >= 0 && nota3 <= 10){
      System.out.println("Nota 3 = " + nota3);
    }else{
     System.out.println("Nota 3 inválida. Repita a nota por favor");
     System.out.print("Digite a nota 3: ");
     nota3 = ler.nextInt();
    }
    
    System.out.print("Digite a nota 4: ");
    nota4 = ler.nextInt();
    
    if(nota4 >= 0 && nota4 <= 10){
      System.out.println("Nota 4 = " + nota4);
    }else{
     System.out.println("Nota 4 inválida. Repita a nota por favor");
     System.out.print("Digite a nota 4: ");
     nota4 = ler.nextInt();
    }
    
   
    
    
    media = (nota1 + nota2 + nota3 + nota4)/4;
    System.out.println("Sua média é: " + media);
    
    if(media >=7){
    System.out.println("Aluno foi aprovado");
    }else if(media >=5 && media <7){
    System.out.println("Aluno está de exame final");
    }else{
    System.out.println("Aluno foi reprovado");
    }
   
    }
}
