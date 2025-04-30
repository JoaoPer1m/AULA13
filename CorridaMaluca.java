package senai;

import java.util.Random;
import java.util.Scanner;

public class CorridaMaluca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

       
        System.out.print("Digite o nome do 1º corredor: ");
        String corredor1 = scanner.nextLine();
        System.out.print("Digite o nome do 2º corredor: ");
        String corredor2 = scanner.nextLine();
        System.out.print("Digite o nome do 3º corredor: ");
        String corredor3 = scanner.nextLine();

        
        int posicao1 = 0;
        int posicao2 = 0;
        int posicao3 = 0;

       
        for (int volta = 1; volta <= 5; volta++) {
           
            posicao1 += random.nextInt(10); 
            posicao2 += random.nextInt(10); 
            posicao3 += random.nextInt(10); 

            System.out.println("\nVolta " + volta + ":");
            System.out.println(corredor1 + " está na posição " + posicao1);
            System.out.println(corredor2 + " está na posição " + posicao2);
            System.out.println(corredor3 + " está na posição " + posicao3);
        }

      
        String vencedor = "";
        String segundoLugar = "";
        String terceiroLugar = "";
        int posicaoVencedor = 0;
        int posicaoSegundo = 0;
        int posicaoTerceiro = 0;

        if (posicao1 > posicao2 && posicao1 > posicao3) {
            vencedor = corredor1;
            posicaoVencedor = posicao1;
            if (posicao2 > posicao3) {
                segundoLugar = corredor2;
                terceiroLugar = corredor3;
                posicaoSegundo = posicao2;
                posicaoTerceiro = posicao3;
            } else {
                segundoLugar = corredor3;
                terceiroLugar = corredor2;
                posicaoSegundo = posicao3;
                posicaoTerceiro = posicao2;
            }
        } else if (posicao2 > posicao1 && posicao2 > posicao3) {
            vencedor = corredor2;
            posicaoVencedor = posicao2;
            if (posicao1 > posicao3) {
                segundoLugar = corredor1;
                terceiroLugar = corredor3;
                posicaoSegundo = posicao1;
                posicaoTerceiro = posicao3;
            } else {
                segundoLugar = corredor3;
                terceiroLugar = corredor1;
                posicaoSegundo = posicao3;
                posicaoTerceiro = posicao1;
            }
        } else {
            vencedor = corredor3;
            posicaoVencedor = posicao3;
            if (posicao1 > posicao2) {
                segundoLugar = corredor1;
                terceiroLugar = corredor2;
                posicaoSegundo = posicao1;
                posicaoTerceiro = posicao2;
            } else {
                segundoLugar = corredor2;
                terceiroLugar = corredor1;
                posicaoSegundo = posicao2;
                posicaoTerceiro = posicao1;
            }
        }

      
        System.out.println("\nResultados finais:");
        System.out.println("1º lugar: " + vencedor + " com " + posicaoVencedor + " pontos.");
        System.out.println("2º lugar: " + segundoLugar + " com " + posicaoSegundo + " pontos.");
        System.out.println("3º lugar: " + terceiroLugar + " com " + posicaoTerceiro + " pontos.");

        scanner.close();
    }
}
