package senai;

import java.util.Scanner;
import java.util.Random;

public class JogoParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Escolha do usuário: par ou ímpar
        System.out.print("Você escolhe Par ou Ímpar? (Digite 'par' ou 'impar'): ");
        String escolha = scanner.nextLine().toLowerCase();

        // Número do usuário
        System.out.print("Digite um número entre 0 e 10: ");
        int numeroUsuario = scanner.nextInt();

        // Número aleatório do sistema
        int numeroSistema = random.nextInt(11); // Gera número de 0 a 10

        // Soma dos dois números
        int soma = numeroUsuario + numeroSistema;

        // Verifica se a soma é par ou ímpar
        boolean somaPar = soma % 2 == 0;

        // Exibe os valores e resultado
        System.out.println("Seu número: " + numeroUsuario);
        System.out.println("Número do sistema: " + numeroSistema);
        System.out.println("Soma: " + soma);

        // Verifica quem ganhou
        if ((somaPar && escolha.equals("par")) || (!somaPar && escolha.equals("impar"))) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("O sistema venceu!");
        }

        scanner.close();
    }
}
