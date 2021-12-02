/*
Nesta atividade você deverá construir um programa na linguagem JAVA tendo como 
base o fluxograma abaixo demonstrado.
Observações:
- Considere Início com uma tela de boas-vindas ao usuário.
- Considere o CPF como sendo: “123.456.789-00”.
- Considere a Senha como sendo: 01020304.
- Considere o Saldo inicial como sendo: R$1.000,00.
- Considere o seguinte Menu:
o 1 – Saldo (deverá exibir o saldo atual)
o 2 – Depósito (deverá requisitar o valor do depósito e somar ao saldo atual)
o 3 – Saque (deverá requisitar o valor do saque e subtrair o saldo atual)
o 0 – Sair
*/

package código_caixa;
import java.util.Scanner;

public class caixa {
    public static void main(String[] args) {
        //Declarações
        Scanner ler = new Scanner(System.in);
        String cpfCorreto = "123.456.789-00";
        String cpfDigitado;
        String senhaCorreta = "123456";
        String senhaDigitada;
        int menu;
        int voltar = 0;
        int opcao = 15;
        int chances = 2;
        int tentativas = 0; 
        double saldo = 1000;
        double deposito;
        double saque;
                
    while(opcao != 0){
        //Inicio
        System.out.println("------------------------------");
        System.out.println("Seja bem-vindo ao Banco Facens");
        System.out.println("------------------------------");
        
        //Colher informação do CPF
        System.out.print("Digite seu CPF: ");
        cpfDigitado = ler.next();
        
        //Verificar CPF
        if(cpfDigitado.equals(cpfCorreto)){
            //Colher informação da Senha
            System.out.print("Digite sua senha: ");
            senhaDigitada = ler.next();
            
            //Verificar senha
            if(senhaDigitada.equals(senhaCorreta)){
                do {
                //Menu
                System.out.println("1 - Saldo");
                System.out.println("2 - Depósito");
                System.out.println("3 – Saque");
                System.out.println("0 – Sair");
                System.out.print("Escolha a operação que deseja realizar: ");
                menu = ler.nextInt();    
                
                switch (menu) {
                    case 1:
                        System.out.println("Saldo: R$ " + saldo);
                        
                        System.out.print("Deseja realizar outra operação? \n 1 - Sim \n 2 - Não \n Resposta: ");
                        voltar = ler.nextInt();
                        
                        break;
                    case 2:
                        System.out.print("Digite o valor do depósito: R$ ");
                        deposito = ler.nextDouble();
                        
                        saldo = deposito + saldo;
                        
                        System.out.println("Saldo atualizado é: R$" + saldo);
                        
                        System.out.print("Deseja realizar outra operação? \n 1 - Sim \n 2 - Não \n Resposta: ");
                        voltar = ler.nextInt();
                        break;
                    case 3:
                        System.out.print("Digite o valor do saque: R$ ");
                        saque = ler.nextDouble();
                        
                        if (saque <= saldo){
                            saldo = (saldo - saque);
                            System.out.println("Você fez um saque de R$ " + saque + " e seu saldo é de R$ " + saldo);
                        }else{
                            System.out.println("Seu saldo é insuficiente");
                        }
                        
                        System.out.print("Deseja realizar outra operação? \n 1 - Sim \n 2 - Não \n Resposta: ");
                        voltar = ler.nextInt();
                        
                        break;
                    case 0:
                        opcao = 0;
                        break;
                }
                } while (opcao != 0 && voltar != 2);{
                System.out.println("/*/*/*/*/*/*/*/");
                System.out.println("Obrigado por utilizar o Banco Facens");
                System.out.println("/*/*/*/*/*/*/*/");

            }
            // 2 tentativas de senhas
            } else{
                
                do {
                
                if(tentativas != chances){
          
                System.out.print("Digite sua senha (nova tentativa): ");
                senhaDigitada = ler.next();      
                tentativas++;
                
                    if (tentativas == chances && !senhaDigitada.equals(senhaCorreta)) {
                        System.out.println("Conta bloqueada");
                    }
               
                
                    if(senhaDigitada.equals(senhaCorreta)){
                        do {
                        //Menu
                        System.out.println("1 - Saldo");
                        System.out.println("2 - Depósito");
                        System.out.println("3 – Saque");
                        System.out.println("0 – Sair");
                        System.out.print("Escolha a operação que deseja realizar: ");
                        menu = ler.nextInt();

                            switch (menu) {

                                case 1:
                                    System.out.println("Saldo: R$ " + saldo);
                                    
                                    System.out.print("Deseja realizar outra operação? \n 1 - Sim \n 2 - Não \n Resposta: ");
                                    voltar = ler.nextInt();
                                    break;
                                
                                case 2:
                                    System.out.print("Digite o valor do depósito: R$ ");
                                    deposito = ler.nextDouble();
                        
                                    saldo = deposito + saldo;
                        
                                    System.out.println("A saldo atualizado é: " + saldo);
                                    
                                    System.out.print("Deseja realizar outra operação? \n 1 - Sim \n 2 - Não \n Resposta: ");
                                    voltar = ler.nextInt();
                                    break;
                                
                                case 3:
                                    System.out.print("Digite o valor do saque:");
                                    saque = ler.nextDouble();
                                    
                                    if (saque <= saldo){
                                        saldo = (saldo - saque);
                                        System.out.println("Você fez um saque de R$ " + saque + " e seu saldo é de R$ " + saldo);
                                    }else{
                                        System.out.println("Seu saldo é insuficiente");
                                    }
                                    
                                    System.out.print("Deseja realizar outra operação? \n 1 - Sim \n 2 - Não \n Resposta: ");
                                    voltar = ler.nextInt();
                                    break;
                                
                                case 0:
                                    opcao = 0;
                                    break;
                            }   
                        } while (opcao != 0 && voltar != 2);{
                    System.out.println("/*/*/*/*/*/*/*/");
                    System.out.println("Obrigado por utilizar o Banco Facens");
                    System.out.println("/*/*/*/*/*/*/*/");

                    }

           
                  } 
               }         
            } while (!senhaDigitada.equals(senhaCorreta) && tentativas != chances && opcao != 0 );        
        }    
               
      
        }else{
            //Tela de Acesso não permitido
            System.out.println("CPF INVÁLIDO - TELA DE ACESSO NÃO PERMITIDO");
        }           
    }
  }
}