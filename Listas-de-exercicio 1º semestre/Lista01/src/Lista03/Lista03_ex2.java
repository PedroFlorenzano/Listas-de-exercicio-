/*
 2)Escreva um algoritmo que calcule a soma dos números de 1 a 15. 
 */
package Lista03;

/**
 *
 * @author Pedro Henrique Damaso
 */
public class Lista03_ex2 {
    public static void main(String[] args) {
    
    int resultado = 0;
    
    for(int i = 1; i<=15; i++){
    resultado = resultado + i;
    }
    System.out.println("Soma dos números de 1 a 15 é: " + resultado);  
  }
}
