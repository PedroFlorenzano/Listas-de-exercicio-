/*
 * 8.Faça um programa que leia o valor de um produto X e leia também a 
quantidade em reais de um cofrinho no seguinte formato:
•N moedas de 1 real;
•N moedas de 50 centavos;
•N moedas de 25 centavos;
•N moedas de 10 centavos;
•N moedas de 5 centavos; 
•N moedas de 1 centavos

O programa deverá verificar se o total de reais que contem no cofrinho é o 
bastante para compra o produto X.

 */
package Lista02;

import java.util.Scanner;

/**
 *
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex8 {
    public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);
    float produto;
    int um;
    float cinquenta;
    float vintecinco;
    float dez;
    float cinco;
    float uum;
    float valor;
  
    
   
    System.out.print("Digite o valor do produto: ");
    produto = ler.nextFloat();
    
    System.out.print("Quantas moedas de 1 real tem no cofrinho:  ");
    um = ler.nextInt();
    
    System.out.print("Quantas moedas de 50 centavos tem no cofrinho:  ");
    cinquenta = ler.nextFloat();
    
    System.out.print("Quantas moedas de 25 centavos tem no cofrinho:  ");
    vintecinco = ler.nextFloat();
    
    System.out.print("Quantas moedas de 10 centavos tem no cofrinho:  ");
    dez = ler.nextFloat();
    
    System.out.print("Quantas moedas de 5 centavos tem no cofrinho:  ");
    cinco = ler.nextFloat();
    
    System.out.print("Quantas moedas de 1 centavos tem no cofrinho:  ");
    uum = ler.nextFloat();
    
    valor = ((cinquenta / 1/2) + (um*1) + (vintecinco / 1/4) + (dez / 1/10) + 
            (cinco * 5/100) + (uum * 1/100));
    
    System.out.println( "O valor que você tem no cofrinho é: R$" + valor);
    
    if(valor >= produto){
    System.out.println("Você tem dinheiro suficiente para comprar o produto.");
    }else{
    System.out.println("Você não tem dinheiro suficiente para comprar o produto.");
    } 
  }
}
