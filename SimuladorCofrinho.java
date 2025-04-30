package senai;

import java.util.Scanner;

public class SimuladorCofrinho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        int quantidade = 0;
        double moeda;

        System.out.println("Bem-vindo ao Cofrinho!");

        // Laço do-while para inserir moedas
        do {
            System.out.print("Digite o valor da moeda (ou 0 para parar): R$ ");
            moeda = scanner.nextDouble();

            if (moeda > 0) {
                total += moeda;
                quantidade++;
            }

        } while (moeda != 0); // Continua até o usuário digitar 0

        // Exibe o total e a quantidade de moedas
        System.out.println("\nTotal de moedas inseridas: " + quantidade);
        System.out.println("Total acumulado: R$ " + total);

        scanner.close();
    }
}
