package senai;

import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
     double somaNotas = 0.0;
       int numeroNotas = 0;
        double nota;
     String resultado;

        // Recebe as notas do aluno até que ele decida parar
        do {
            System.out.print("Digite uma nota (ou -1 para parar): ");
            nota = scanner.nextDouble();

            if (nota != -1) {
                somaNotas += nota;
                numeroNotas++;
            }

        } while (nota != -1);

        if (numeroNotas > 0) {
            double media = somaNotas / numeroNotas;

            // Verifica a situação do aluno
            if (media >= 7.0) {
                resultado = "Aprovado";
            } else if (media >= 4.0) {
                resultado = "Recuperação";
            } else {
                resultado = "Reprovado";
            }

            // Exibe a média e a situação do aluno
            System.out.println("\nSua média foi: " + media);
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }

        scanner.close();
    }
}
