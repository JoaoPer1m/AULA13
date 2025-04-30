package senai;

import java.util.Scanner;

public class SomaNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        // Faz pelo menos uma vez
        do {
            System.out.print("Digite um número positivo (ou número negativo para parar): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                soma += numero; // Soma se for positivo
            }
        } while (numero >= 0); // Repete enquanto for positivo

        System.out.println("Soma total dos números positivos: " + soma);

        scanner.close();
    }
}
