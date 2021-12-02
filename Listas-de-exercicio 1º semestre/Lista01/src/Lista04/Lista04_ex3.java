/*
3)Escreva um algoritmo que calcule a média aritmética das 3 notas dos 
alunos de uma classe. O algoritmo deverá ler, além das notas, o código do 
aluno e deverá ser encerrado quando o código for igual a zero.
 */
package Lista04;

import java.util.Scanner;


public class Lista04_ex3 {
    public static void main(String[] args) {
     
     int nota1, nota2, nota3;
     int media = 0;
     int codigo;
     Scanner ler = new Scanner (System.in);
        
        do {
         System.out.println("Digite 0 (zero) no código se quiser sair");
        
         System.out.print("Digite o seu código de aluno: ");
         codigo = ler.nextInt();
         
            if(codigo != 0){
            System.out.print("Nota 1: ");
            nota1 = ler.nextInt();
         
            System.out.print("Nota 2: ");
            nota2 = ler.nextInt();

            System.out.print("Nota 3: ");
            nota3 = ler.nextInt();

            media = (nota1 + nota2 + nota3)/3;

           
            }
 
        } while (codigo != 0);
        System.out.println("Sua média é: " + media);
    }
}
