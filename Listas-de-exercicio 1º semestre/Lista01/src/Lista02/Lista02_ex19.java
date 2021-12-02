/*
 19.Faça um programa que calcule a conta de luz de um cliente dado que 
100 kilowatts custa 1/7 de um salário mínimo (atribua o valor que quiser); 
O programa deverá receber o gasto de um mês qualquer informado pelo cliente e 
retornar o valor final da conta com 10% de desconto.
 */
package Lista02;
import java.util.Scanner;

/**
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex19 {
   public static void main(String[] args) {
   
    Scanner ler = new Scanner(System.in);
     
    int conta;
    double valorgasto;
    double min = 1000;
    double totalkilowatts;
    double k100;
    double desconto;
    
    
    System.out.print("Digite o seu valor gasto por mês em kilowatts: ");
    valorgasto = ler.nextDouble();
    
    k100 = min / 7;
    totalkilowatts = (k100 * valorgasto) / 100;
    desconto = totalkilowatts - (10 * totalkilowatts) / 100;
    
    System.out.print("Digite 1 para ver o valor com desconto:  ");
    conta = ler.nextInt();
    
    switch (conta){
        
        case 1:
          System.out.println("O valor total é: R$ " + desconto);
          break;
        case 2:
          System.out.println("Digite novamente em números. ");
          break; 
    }
  } 
}
