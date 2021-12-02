
package lista01;

/**
 1. Construa um algoritmo que troque o valor de duas variáveis 
  (mostrar antes e depois os valores) sem usar calculo matemático.

 */
public class Lista01 {

    public static void main(String[] args) {
        //ENTRADA
        int valor1 = 10;
        int valor2 = 20;
        int temporaria;
        
        System.out.println("Valor antes");
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
        
       
       //PROCESSAMENTO
        temporaria = valor1;
        valor1 =  valor2;
        valor2 = temporaria;
        
        //SAÍDA
        System.out.println("Valor depois");
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
    }
    
}
