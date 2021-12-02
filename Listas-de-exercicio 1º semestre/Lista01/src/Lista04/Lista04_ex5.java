/*
5)Escrever um algoritmo que leia uma quantidade desconhecida de números e 
conte quantos deles estão nos seguintes intervalos: [0.25], [26,50], [51,75] 
e [76,100]. A entrada de dados deve terminar quando for lido um número negativo.
 */
package Lista04;

import java.util.Scanner;

public class Lista04_ex5 {
    public static void main(String[] args) {
        int num = 0;
        int vintecinco = 0, cinquenta = 0, setentacinco = 0, cem = 0;
        Scanner ler = new Scanner (System.in);
        
        do {
            System.out.print("Escreva um número: ");
            num = ler.nextInt();
            
            if(num >= 0 && num <= 25){
                vintecinco++;
            } else if(num >= 0 && num >= 26 && num <= 50){
                cinquenta++;
            } else if(num >= 0 && num >= 51 && num <= 75){
                setentacinco++;
            } else if(num >= 0 && num >= 76 && num <= 100){
                cem++;
            }
            
            System.out.println
 ("A quantidade de números entre 0 e 25 é: " + vintecinco + " ,entre 26-50 é: " + cinquenta + 
  " ,entre 51-75 é: " + setentacinco + " ,e entre votos 76-100 é: " +cem);   
        } while (num >= 0); 
    }
}
