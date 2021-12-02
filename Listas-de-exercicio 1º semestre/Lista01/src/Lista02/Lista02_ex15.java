/*
15.Uma empresa abriu uma linha de crédito para os funcionários. 
O valor da prestação não pode ultrapassar 30% do salário. 
Faça um programa que receba o salário, o valor do empréstimo e o 
número de prestações e informe se o empréstimo pode ser concedido. 
Nenhum dos valores informados pode ser zero ou negativo.
 */
package Lista02;
import java.util.Scanner;

/**
 *
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex15 {
 public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);
    float salario = 0;
    float ValorEmpre;
    int NumPrestacao;
    float ValorPrestacao;
    float percentual;
    
   
    
    do{
     System.out.println("As respostas não podem ser zero ou negativas.");
   
     
     System.out.print("Digite o seu salário: ");
     salario = ler.nextFloat();
    
    if (salario > 0){
      System.out.println("Seu salário: " + salario);
    }else{
     System.out.println("Salario invalido. Coloque um maior que zero por favor");
     System.out.print("Digite o seu salário: ");
     salario = ler.nextFloat();
    }
    break;
    } while(true);
    
    do{
    System.out.print("Digite o valor do empréstimo que deseja: ");
    ValorEmpre = ler.nextFloat();
    
    if (ValorEmpre > 0){
      System.out.println("O empréstimo que deseja é de: " + ValorEmpre);
    } else{
      System.out.println("Valor do empréstimo invalido. Coloque um maior que zero por favor");
      System.out.print("Digite o empréstimo que deseja: ");
      ValorEmpre = ler.nextFloat(); 
    }
     break;
   
    } while(true);
    
    
    do{ 
    System.out.print("Digite quantas prestações deseja: ");
    NumPrestacao = ler.nextInt();
    
    if (NumPrestacao > 0){
      System.out.println("O número de prestações que deseja é de: " + NumPrestacao);
    }else{
     System.out.println("Valor das prestações é invalido. Coloque um maior que zero por favor");
     System.out.print("Digite o número de prestações que deseja: ");
     NumPrestacao = ler.nextInt(); 
    }
    break;
   
    } while(true);
   
    
    
    ValorPrestacao = (ValorEmpre/NumPrestacao);
    percentual = (float) (salario * 0.3);
    
    if(ValorPrestacao <= percentual){
        System.out.println("Emprestimo pode ser concedido");
    } else{
        System.out.println("Emprestimo NÃO pode ser concedido");
    }
  
 }
}
