/*
10.(Deve ser feito usando o SWITCH-CASE) Crie um algoritmo que peça o gênero 
de uma pessoa utilizando um dos caracteres (M ou F) e a idade como entrada. 
O algoritmo deve classificar a pessoa em “Criança”, “Adolescente” e “Adulto” 
além de dizer qual o gênero informado. Exemplo: “Uma criança de 5 anos do 
gênero Feminino”.
 */
package Lista02;
import java.util.Scanner;

/**
 * @author Pedro Henrique Damaso
 */
public class Lista02_ex10 {
  public static void main(String[] args) {
      
    Scanner ler = new Scanner(System.in);
    String genero;
    int M;
    int F;
    double idade;
    
    System.out.print("Qual seu gênero (M para masculino, F para feminino): ");
    genero = ler.next();
    
    System.out.print("Digite sua idade:  ");
    idade = ler.nextInt();
    
    
    switch(genero){
    
        case "M":
            if(idade <= 12){
                System.out.println("Um criança de " + idade + " anos do gênero " + genero);
            } else if (idade >12 && idade <= 18){
                System.out.println("Um adolescente de " + idade + " anos do gênero " + genero);
            } else if (idade > 18){
                System.out.println("Um adulto de " + idade + " anos do gênero " + genero);
            }
            break;
        case "F":
            if(idade <= 12){
                System.out.println("Um criança de " + idade + " anos do gênero " + genero);
            } else if (idade >12 && idade <= 18){
                System.out.println("Um adolescente de " + idade + " anos do gênero " + genero);
            } else if (idade > 18){
                System.out.println("Um adulto de " + idade + " anos do gênero " + genero);
            }
            break;  
        default:
            System.out.println("Dados inválidos");
    }
    
  
  
  
  
  
  
  
  
  
  }  
}

