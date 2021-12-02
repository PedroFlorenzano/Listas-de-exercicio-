/*
 20.Criar um programa que calcule a média final das notas de um aluno. 
    O programa deve ler as notas dos 4 bimestres e o número de faltas. 
    Em seguida deve calcular a média aritmética das notas e imprimir umas 
    das seguintes mensagens.
        •‘aprovado’ para média entre 7.0 e 10.0 e número de faltas até 36; 
        •‘Exame final’ - média de 4.0 à 7.0 e número de faltas até 36;
        •‘Reprovado’ - média abaixo de 4.0 ou número de faltas maior que 36;

 */
package Lista02;
import java.util.Scanner;
/**
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex20 {
    public static void main(String[] args) {
   
    Scanner ler = new Scanner(System.in);
    double B1;
    double B2;
    double B3;
    double B4;
    double media;
    int faltas;
    
    
    System.out.print("Digite o sua nota no 1º Bimestre:  ");
    B1 = ler.nextDouble();
    
    System.out.print("Digite o sua nota no 2º Bimestre:  ");
    B2 = ler.nextDouble();
    
    System.out.print("Digite o sua nota no 3º Bimestre:  ");
    B3 = ler.nextDouble();
    
    System.out.print("Digite o sua nota no 4º Bimestre:  ");
    B4 = ler.nextDouble();
    
    System.out.print("Digite o total de faltas:  ");
    faltas = ler.nextInt();
   
    media = (B1 + B2 + B3 + B4)/4;
    
    System.out.println("Sua média é de: " + media);
    
    
    if(media >= 7 && media <= 10 && faltas <= 36){
       System.out.println ("Você foi aprovado: " + media);
    } else if(media >= 4 && media <= 7 && faltas <= 36){
       System.out.println ("Você está de exame final: " + media);
    } else if(media < 4 && faltas >36){
       System.out.println ("Você foi reprovado: " + media);
    } else {
       System.out.println ("Dados inválidos");
    }  
  }
}
