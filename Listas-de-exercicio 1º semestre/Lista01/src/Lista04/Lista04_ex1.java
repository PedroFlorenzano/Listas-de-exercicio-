/*
    1)Construir um algoritmo que calcule a média aritmética de vários valores 
    inteiros positivos. O final da leitura acontecerá quando for lido um 
    valor negativo.
 */
package Lista04;

import java.util.Scanner;

public class Lista04_ex1 {
    public static void main(String[] args) {
        int numero = 0, soma = 0, media, qtdMedia = 0;
        Scanner ler = new Scanner(System.in);
        
        do{
            System.out.println("Digite um númeor: ");
            numero = ler.nextInt();
            if(numero >= 0){
            soma = soma + numero;
            qtdMedia++;
        }
        }while(numero >= 0);
        
        media = soma / qtdMedia;
        
        System.out.println("Média: " + media);
        
        
    }
}
