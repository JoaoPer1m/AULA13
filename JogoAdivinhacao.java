package senai;

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Número aleatório entre 1 e 10
        int numeroSecreto = random.nextInt(10) + 1;

        // Entrada do usuário
        System.out.print("Tente adivinhar o número (entre 1 e 10): ");
        int palpite = scanner.nextInt();

        // Verifica se acertou ou dá dica
        if (palpite == numeroSecreto) {
            System.out.println("Parabéns! Você acertou!");
        } else if (palpite < numeroSecreto) {
            System.out.println("Errado! O número é MAIOR.");
        } else {
            System.out.println("Errado! O número é MENOR.");
        }

        // Mostra o número correto no final
        System.out.println("O número secreto era: " + numeroSecreto);

        scanner.close();
    }
}
