/*
 2)	Em uma eleição presidencial existem quatro candidatos. Os votos são 
informados através de códigos. Os dados utilizados para a contagem dos 
votos obedecem à seguinte codificação:  

- 1,2,3,4 = voto para os respectivos candidatos;
- 5 = voto nulo;
- 6 = voto em branco;

Elabore um algoritmo que leia o código do candidado em um voto. Calcule e escreva:

- total de votos para cada candidato;
- total de votos nulos;
- total de votos em branco;

Como finalizador do conjunto de votos, tem-se o valor 0.

 */
package Lista04;

import java.util.Scanner;

public class Lista04_ex2 {
 
public static void main(String[] args) {
//Entrada
Scanner ler = new Scanner(System.in);
int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;
int nulo = 0, branco = 0, voto;

do{
System.out.println("1 = candidato1");
System.out.println("2 = candidato2");
System.out.println("3 = candidato3");
System.out.println("4 = candidato4");
System.out.println("5 = nulo");
System.out.println("6 = branco");
System.out.println("0 = finalizar votação");
System.out.print("Digite seu Voto: ");
voto = ler.nextInt();

switch(voto){
case 1:
candidato1++;
break;

case 2:
candidato2++;
break;

case 3:
candidato3++;
break;

case 4:
candidato4++;
break;

case 5:
nulo++;
break;

case 6:
branco++;
break;

case 0:
System.out.println("Votação Finalizada!!");
break;

default:
System.out.println("Opção Inválida!!!");
break;

}//final do switch

}while(voto != 0);

System.out.println("=== Total de Votos ===");
System.out.println("Candidato 1: " + candidato1);
System.out.println("Candidato 2: " + candidato2);
System.out.println("Candidato 3: " + candidato3);
System.out.println("Candidato 4: " + candidato4);
System.out.println("Nulos: " + nulo);
System.out.println("Brancos: " + branco);

   }//final do main

}//final da classe
        
