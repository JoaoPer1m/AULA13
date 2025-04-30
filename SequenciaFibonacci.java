package senai;

import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada: quantos termos o usuário quer ver
        System.out.print("Digite quantos números da sequência de Fibonacci você quer ver: ");
        int n = scanner.nextInt();

        int primeiro = 0;
        int segundo = 1;

        System.out.println("Sequência de Fibonacci com " + n + " termos:");

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " ");

            // Calcula o próximo número
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        scanner.close();
    }
}
