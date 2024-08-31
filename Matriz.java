package programacaoOrientadaAObjetos.exercicios2;

import java.util.Random;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[7][7];
        int[] maiorElementoLinha = new int[7];
        int[] menorElementoColuna = new int[7];

        // Preencher a matriz com números inteiros aleatórios
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        // Encontrar o maior elemento de cada linha
        for (int i = 0; i < 7; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < 7; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            maiorElementoLinha[i] = maior;
        }

        // Encontrar o menor elemento de cada coluna
        for (int j = 0; j < 7; j++) {
            int menor = matriz[0][j];
            for (int i = 1; i < 7; i++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            menorElementoColuna[j] = menor;
        }

        // Imprimir a matriz e os vetores
        System.out.println("Matriz 7x7:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println("Maior elemento de cada linha:");
        for (int i = 0; i < 7; i++) {
            System.out.print(maiorElementoLinha[i] + " ");
        }
        System.out.println();

        System.out.println("Menor elemento de cada coluna:");
        for (int i = 0; i < 7; i++) {
            System.out.print(menorElementoColuna[i] + " ");
        }
        System.out.println();
    }
}
