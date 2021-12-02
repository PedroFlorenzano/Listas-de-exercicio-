/*
9.Faça um programa onde o usuário irá escolhe se que Converte graus 
Celsius para Fahrenheit ou Fahrenheit para Celsius.
 */
package Lista02;
import java.util.Scanner;
/**
 *
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex9 {
    public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);
    float celsius;
    float fahrenheit;
    double temp;
    double convert;
    int escolha;
    
    
    
    System.out.print("Digite uma temperatura: ");
    temp = ler.nextFloat();
    
    System.out.println
("Agora você irá escolher para qualquer temperatura deseja converter: Celsius ou Fahrenheit");
    
    System.out.print("Digite 1 para celsius ou 2 para fahrenheit: ");
    escolha = ler.nextInt();
    
    if(escolha == 1){
    convert = (temp - 32) / 1.8;
    System.out.println("A temperatura em Celsius é: " + convert + "ºC");
    } else if ( escolha == 2){
    convert = (temp * 1.8) + 32;
    System.out.println("A temperatura em Fahrenheit é: " + convert + "ºF");
    } else{
    System.out.println("Escolha inexistente");
    }
    
    
    
       
       
       
       
       
       
       
       
       
       
       
       
  }
}
