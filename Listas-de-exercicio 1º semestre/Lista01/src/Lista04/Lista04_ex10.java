/*
10)Faca um programa que receba a idade e o peso de sete pessoas. Calcule e mostre; 
    - a quantidade de pessoas com mais de 90 quilos; 
    - a média das idades das sete pessoas

 */
package Lista04;

import java.util.Scanner;

public class Lista04_ex10 {
    public static void main(String[] args) {
        
    //int p1,p2,p3,p4,p5,p6,p7;
   
    int idade, i = 0;
    int maiorpeso = 0, soma = 0;
    float peso, media;
    Scanner ler = new Scanner (System.in);

        do {
        i++;
        System.out.println("Digite a sua idade: ");
        idade = ler.nextInt();
        
        System.out.println("Digite seu peso: ");
        peso = ler.nextFloat();
        
        if(peso > 90){
        maiorpeso++;
        }
        
        soma = soma + idade;
        } while (i <= 6);
   
    media = soma / 7;
    //A)
    System.out.println("A quantidade de pessoas com mais de 90 quilos é: " + maiorpeso);
    //B)
    System.out.println("Média das idades é: " + media);
    }
}
