/*
14.Uma loja fornece 10% de desconto para funcionários e 5% de desconto para 
clientes vips. Faça um programa que calcule o valor total a ser pago 
por uma pessoa. O programa deverá ler o valor total da compra efetuada e 
um código que identifique se o comprador é um cliente 
comum (1), funcionário (2) ou vip (3). 
 */
package Lista02;
import java.util.Scanner;

/**
 *
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex14 {
    public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);  
    float compra;
    float desconto;
    int comum = 1;
    int funcionario = 2;
    int vip = 3;
    int codigo;
    
    
    
    System.out.print("Digite o valor da sua compra: ");
    compra = ler.nextFloat();
    
    System.out.println("Digite número (1) para cliente comum");
    System.out.println("Digite número (2) para funcionário");
    System.out.println("Digite número (3) para vip");
    codigo = ler.nextInt();
    
    if(codigo == 1){
        System.out.println("Cliente comum não tem desconto ");
        System.out.println ("O valor final fica: " + compra);
    } else if (codigo == 2){
        System.out.println("Funcionário tem desconto de 10% : R$" + (desconto = compra * 1/10));
        System.out.println ("O valor final fica: R$" + (compra - desconto));
    } else if (codigo == 3){
        System.out.println("Clientes Vips recebem desconto de 5% : R$" + (desconto = compra * 5/100));
        System.out.println ("O valor final fica: R$" + (compra - desconto));
    } 
  }
}
