/*
 * 1.Fazer um programa para receber um número e verificar se está 
entre 100 e 200. Se estiver na faixa, imprimir: 
"Você digitou um numero entre 100 e 200", Senão estiver na faixa, imprimir:
" Voce digitou um numero fora da faixa entre 100 e 200.”
 */
package Lista02;

import java.util.Scanner;

/**
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex1 {
    public static void main(String[] args) {
    
    int valor;
    Scanner ler;
        
    ler = new Scanner(System.in);
    
    System.out.print("Digite um número entre 100 e 200: ");
    valor = ler.nextInt();
    
    System.out.println("Você digitou " + valor);
    
        if(valor>=100 && valor<=200){   
        System.out.println("Você digitou um numero entre 100 e 200");
        }else{
        System.out.println
        ("Voce digitou um numero fora da faixa entre 100 e 200");
        }
    }   
 }
        
        
        
        
        
        
        
        
        
        
        