package senai;

import java.util.Scanner;

public class TabuadaInterativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do número
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        // Laço for para multiplicar de 1 a 10
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}
