/*
16.(Deve ser feito usando o SWITCH-CASE) Crie um algoritmo que dado o valor de 
um sapato e a forma de pagamento. (somente 1= à vista e 2= à prazo) deve 
calcular o preço do sapato da seguinte forma: 

    a. se for pago à vista aplique um desconto de 10% antes de mostrar o valor 
       final
    
    b. senão informe o mesmo valor do produto.

 */
package Lista02;
import java.util.Scanner;

/**
 *
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex16 {
    public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);
    double valor;
    String forma;
    int vista = 1;
    int prazo = 2;
    
    System.out.print("Digite o valor do sapato: ");
    valor = ler.nextFloat();
    
    System.out.print("Digite a forma de pagamento que deseja, sendo à vista (digite 1) ou à prazo (digite 2): ");
    forma = ler.next();
    
    switch(forma){
    
        case "1":
            valor = valor * 0.9;
            System.out.println ("O preço final do sapato fica: R$ " + valor);
            break;
            
        case "2":
            System.out.println ("O preço final não possui desconto, sendo: R$ " + valor);
            break;
        default:
            System.out.println("Forma de pagamento inválida");
    }    
  }
}
