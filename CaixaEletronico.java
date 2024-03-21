import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args){
        int opcao = 0;
        double saldoconta = 0;

        try (Scanner entrada = new Scanner(System.in)) {
            while (opcao !=4){

            System.out.println("APERTE 1 PARA DEPOSITAR DINHEIRO");
            System.out.println("APERTE 2 PARA SAQUE");
            System.out.println("APERTE 3 PARA SALDO DA CONTA");
            System.out.println("APERTE 4 PARA SAIR");

            opcao = entrada.nextInt();
            
            if (opcao == 4){
                break;
      
            }else if (opcao == 1){

                System.out.println("Qual o valor do depósito? ");
                double depósito = entrada.nextDouble();
                saldoconta += depósito;
                System.out.println("Seu depósito foi realizado com sucesso!!");
                System.out.println("Seu saldo é: R$ " +saldoconta);
                System.out.println("=========================================");
                
            }else if (opcao == 2){
                System.out.println("Qual o valor do saque? ");
                double saque = entrada.nextDouble();
                if (saldoconta < saque ){
                    System.out.println("Saldo Insuficiente");
                    
                }if (saldoconta >= saque){
                saldoconta -= saque;
                System.out.println("Seu saque foi realizado com sucesso!!");
                System.out.println("Seu saldo é: R$ " +saldoconta);
                System.out.println("=========================================");
                }
         
                
            }else if (opcao == 3){
                System.out.println("O saldo da sua conta é: R$ " +saldoconta);
                System.out.println("=========================================");
            }
            }
        }



    }
}

