package senai;

import java.util.Scanner;

public class MiniQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontos = 0;

        System.out.println("=== Mini Quiz ===");

        // Pergunta 1
        System.out.println("\n1) Qual é a capital do Brasil?");
        System.out.println("1 - Rio de Janeiro");
        System.out.println("2 - Brasília");
        System.out.println("3 - São Paulo");
        System.out.print("Sua resposta: ");
        int resposta1 = scanner.nextInt();

        switch (resposta1) {
            case 2:
                pontos++;
                break;
        }

        // Pergunta 2
        System.out.println("\n2) Quanto é 5 x 6?");
        System.out.println("1 - 30");
        System.out.println("2 - 11");
        System.out.println("3 - 56");
        System.out.print("Sua resposta: ");
        int resposta2 = scanner.nextInt();

        switch (resposta2) {
            case 1:
                pontos++;
                break;
        }

        // Pergunta 3
        System.out.println("\n3) Qual o planeta mais próximo do Sol?");
        System.out.println("1 - Terra");
        System.out.println("2 - Vênus");
        System.out.println("3 - Mercúrio");
        System.out.print("Sua resposta: ");
        int resposta3 = scanner.nextInt();

        switch (resposta3) {
            case 3:
                pontos++;
                break;
        }

        // Resultado final
        System.out.println("\nVocê acertou " + pontos + " de 3 perguntas.");

        scanner.close();
    }
}
