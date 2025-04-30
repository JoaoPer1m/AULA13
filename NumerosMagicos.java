package senai;

import java.util.Scanner;
import java.util.Random;

public class NumerosMagicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gera 5 números aleatórios entre 1 e 50
        int[] numerosMagicos = new int[5];
        for (int i = 0; i < 5; i++) {
            numerosMagicos[i] = random.nextInt(50) + 1; // Números de 1 a 50
        }

        System.out.println("Tente adivinhar os 5 números mágicos entre 1 e 50!");

        int acertos = 0;

        // O usuário tenta adivinhar os 5 números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite seu palpite para o número " + (i + 1) + ": ");
            int palpite = scanner.nextInt();

            // Verifica se acertou
            for (int numero : numerosMagicos) {
                if (palpite == numero) {
                    acertos++;
                    break;
                }
            }
        }

        // Exibe o resultado
        System.out.println("\nVocê acertou " + acertos + " números mágicos!");

        scanner.close();
    }
}
