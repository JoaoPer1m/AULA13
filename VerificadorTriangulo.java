package senai;

import java.util.Scanner;

public class VerificadorTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos três lados
        System.out.print("Digite o primeiro lado: ");
        int lado1 = scanner.nextInt();

        System.out.print("Digite o segundo lado: ");
        int lado2 = scanner.nextInt();

        System.out.print("Digite o terceiro lado: ");
        int lado3 = scanner.nextInt();

        // Verifica se forma um triângulo
        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
            // É um triângulo
            System.out.println("Forma um triângulo!");

            // Verifica tipo de triângulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Tipo: Equilátero (3 lados iguais)");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Tipo: Isósceles (2 lados iguais)");
            } else {
                System.out.println("Tipo: Escaleno (3 lados diferentes)");
            }
        } else {
            // Não é um triângulo
            System.out.println("Não forma um triângulo.");
        }

        scanner.close();
    }
}
