package Lista04;

/*
Foi feita uma pesquisa entre os 1000 habitantes de uma região para coletar os seguintes dados: 
sexo (0-feminino, 1-masculino), idade e altura. 
Faça um algoritmo que leia as informações coletadas e mostre as seguintes informações: 

a) média da idade do grupo; 

b) média da altura das mulheres; 

c) média da idade dos homens; 

d) percentual de pessoas com idade entre 18 e 35 anos (inclusive). 
*/
import java.util.Scanner;

public class Lista04_ex9{
    public static void main(String[] args) {
        
    int sexo;
    int sair;
    int idadeM = 0, idadeF = 0;
    float alturaM = 0;
    float alturaF = 0;
    int qtdM = 1, qtdF = 1;
    int qtdT = qtdM + qtdF;
    int mediaIg,mediaIh;
    int mediaIM, mediaIF;
    float mediaAf;
    float percentual;
    Scanner ler = new Scanner (System.in);

    do{ 

    System.out.println("Qual o seu sexo (digite 1 - masculino , 0 - feminino): ");
    sexo = ler.nextInt();

    if(sexo == 1){
    qtdM = 0;
    qtdM++;

    System.out.println("Digite a sua altura do senhor: ");
    alturaM = ler.nextFloat();

    System.out.println("Digite sua idade: ");
    idadeM = ler.nextInt();
    } 
    
    if (sexo == 0){
    qtdF = 0;
    qtdF++;

    System.out.println("Digite a sua altura da senhora: ");
    alturaF = ler.nextFloat();

    System.out.println("Digite sua idade: ");
    idadeF = ler.nextInt();    
    }

    //a) média da idade do grupo; 
    mediaIM = idadeM/qtdM;
    mediaIF = idadeF/(qtdF);
    mediaIg = mediaIM + mediaIF / (qtdT - 1);
    
    System.out.println("média da idade do grupo: " + mediaIg);

    //b) média da altura das mulheres; 
    mediaAf = (float) (alturaF / qtdF);
    System.out.println("média da altura das mulheres: " + mediaAf);

    //c) média da idade dos homens; 
    mediaIh = idadeM / qtdM;
    System.out.println("média da idade dos homens: " + mediaIh);

    //d) percentual de pessoas com idade entre 18 e 35 anos (inclusive). 
    if((idadeM >= 18 || idadeF >= 18) && (idadeM <= 35 || idadeF <= 35)){

    percentual =  (float) ((idadeM + idadeF) * 100 / (qtdT));
    System.out.println("Opercentual de pessoas com idade entre 18 e 35 anos é: " + percentual);
    }  

    System.out.println("Digite 0 para sair, 1 para reiniciar");
    sair = ler.nextInt();




    }while(sair != 0);

    System.out.println("média da idade do grupo: " + mediaIg);
    System.out.println("média da altura das mulheres: " + mediaAf);
    System.out.println("média da idade dos homens: " + mediaIh);

    }
}