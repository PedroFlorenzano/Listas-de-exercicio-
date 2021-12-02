/*
2. Crie um algoritmo que peça ao usuário um número inteiro no intervalo 
de 1 e 12 e tendo como base o número exiba o um mês do ano de acordo com o 
número digitado pelo usuário. Exemplo: se ele digitou 1 o algoritmo deve 
imprimir “Janeiro”. Caso o usuário digitar um número diferente de q e 12 o 
algoritmo deverá dizer “número inválido”
 */

package Lista02;
import java.util.Scanner;

/**
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex2 {
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     
     int mes = 0;
     
     System.out.print("Digite um número inteiro entre 1 e 12: ");
     mes = ler.nextInt();
     
     switch(mes){
         case 1:
            System.out.println("Janeiro");
            break;
         case 2:
            System.out.println("Fevereiro");
            break;
         case 3:
            System.out.println("Março");
            break;
         case 4:
            System.out.println("Abril");
            break;
         case 5:
            System.out.println("Maio");
            break;
         case 6:
            System.out.println("Junho");
            break;
         case 7:
            System.out.println("Julho");
            break;
         case 8:
            System.out.println("Agosto");
            break;
         case 9:
            System.out.println("Setembro");
            break;
         case 10:
            System.out.println("Outubro");
            break;
         case 11:
            System.out.println("Novembro");
            break;
         case 12:
            System.out.println("Dezembro");
            break;
         default:
           System.out.println("Número digitado não corresponde a nenhum mês!");
            break; 
     }
    }
}
