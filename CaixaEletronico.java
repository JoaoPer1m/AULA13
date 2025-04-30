package senai;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.00;         int opcao;

        do {
            System.out.println("\n Caixa Eletrônico 																		");
            
            
        System.out.println("1 - Ver saldo");
           System.out.println("2 - Depositar");
           System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
         System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é: R$ " + saldo);
                 break;
                case 2:
                   System.out.print("Digite o valor para depositar: R$ ");
                    double deposito = scanner.nextDouble();
                   saldo += deposito;
                    System.out.println("Depósito de R$ " + deposito + " realizado com sucesso.");
                   break;
                case 3:
                    System.out.print("Digite o valor para sacar: R$ ");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                       saldo -= saque;
                        System.out.println("Saque de R$ " + saque + " realizado com sucesso.");
                   } else {
                        System.out.println("Saldo insuficiente!");
                   }
                   break;
                case 4:
                   System.out.println("Saindo... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
