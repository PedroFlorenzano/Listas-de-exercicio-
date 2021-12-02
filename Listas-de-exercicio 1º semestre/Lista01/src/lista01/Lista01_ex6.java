/*
    6. Construa um algoritmo que calcule se um Valor é par ou ímpar
 */
package lista01;

public class Lista01_ex6 {
    public static void main (String[] args){
        //ENTRADA
        int valor1 = 4;
        int resto;
        
        //PROCESSAMENTO
        
        resto = valor1 % 2;
      
        if(resto == 0){
            System.out.println("PAR");      
        }
        else{
            System.out.println("ÍMPAR");
        }
        //SAIDA
    }
}
