/*
 18.Crie um algoritmo que leia dois valores do usuário e a operação que 
    ele deseja executar (Operações: soma, subtração, divisão, multiplicação). 
    Execute a operação desejada e imprima na tela. 
 */
package Lista02;
import java.util.Scanner;
/**
 *
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex18 {
  public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);
    float valor1;
    float valor2;
    float resultado;
    String operacao;
   
    
    System.out.print("Digite o valor 1: ");
    valor1 = ler.nextFloat();
    
    System.out.print("Digite o valor 2: ");
    valor2 = ler.nextFloat();
    
    System.out.println("Escolha a operação que deseja realizar: ");
        System.out.println("Digite 1 para Soma.");
        System.out.println("Digite 2 para Subtração.");
        System.out.println("Digite 3 para Divisão.");
        System.out.println("Digite 4 para Multiplicação.");
    operacao = ler.next();
    
    
    switch(operacao){
        
        case "1":
            resultado = valor1 + valor2;
            System.out.println("A soma deu: " + resultado);
        break;   
        case "2":
            resultado = valor1 - valor2;
            System.out.println("A subtração deu: " + resultado);
        break;
        case "3":
            resultado = valor1 / valor2;
            System.out.println("A divisão deu: " + resultado);
        break;  
        case "4":
            resultado = valor1 * valor2;
            System.out.println("A multiplicação deu: " + resultado);
        break;  
    }
  }
}
