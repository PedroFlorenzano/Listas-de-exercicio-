/*
 3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes. 
 */
package Lista03;

import java.util.Scanner;

/**
 *
 * @author Pedro Henrique Damaso
 */
public class Lista03_ex3 {
    public static void main(String[] args) {
    String nome;
    Scanner ler = new Scanner(System.in);
    
    System.out.print("Digite seu nome: ");
    nome = ler.next();
    
    for(int i = 0; i <=10; i++){
    System.out.println(nome);
    }

  }
}
