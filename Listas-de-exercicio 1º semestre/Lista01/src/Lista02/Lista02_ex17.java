/*
17.Um comerciante comprou um produto e quer vendê-lo com lucro de 45% se o 
    valor da compra for menor que 20,00; caso contrário, o lucro será de 30%. 
    O programa deverá receber o valor do produto e imprimir o valor da venda.
 */
package Lista02;
import java.util.Scanner;
/**
 *
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex17 {
   public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);
    double preco;
    
    System.out.print("Digite o preço pago no produto: ");
    preco = ler.nextFloat();
    
    if(preco < 20){
     System.out.println("Valor da venda do produto deve ser de: " + (preco * 1.45));   
    } else{
       System.out.println("Valor da venda do produto deve ser de: " + (preco * 1.30));
    }
    
 }  
}
