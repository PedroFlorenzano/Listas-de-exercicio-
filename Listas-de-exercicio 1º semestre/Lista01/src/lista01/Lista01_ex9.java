/*
    9. Construa um algoritmo que converta Celsius/Fahrenheit
*/
package lista01;

public class Lista01_ex9 {
     public static void main (String[] args){
        int celsius = 60;
        int fahrenheit;
         
        fahrenheit = celsius *9/5 +32;
        System.out.println("A conversão é: " + fahrenheit);
    }
}