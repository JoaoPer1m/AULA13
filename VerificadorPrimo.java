package senai;

import java.util.Scanner;

public class VerificadorPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do número
        System.out.print("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false; // 0 e 1 não são primos
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        // Resultado
        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " NÃO é um número primo.");
        }

        scanner.close();
    }
}
