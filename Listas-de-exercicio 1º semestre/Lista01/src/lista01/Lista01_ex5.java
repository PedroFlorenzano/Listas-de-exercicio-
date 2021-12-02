/*
    5. Construa um algoritmo que exemplifique 4 operações aritméticas.

 */
package lista01;



public class Lista01_ex5 {
    public static void main (String[] args){
        //  ENTRADA
        int valor1 = 10;
        int valor2 = 10;
        int soma, sub, div, mult;
        
        
        //PROCESSAMENTO
        soma = valor1 + valor2;
        sub = valor1 - valor2;
        mult = valor1 * valor2;
        div = valor1 / valor2;
        
        
        //SAIDA
        System.out.println("Soma:" + soma);
        System.out.println("Sub:" + sub);
        System.out.println("Mult:" + mult);
        System.out.println("Div:" + div);
}
}
