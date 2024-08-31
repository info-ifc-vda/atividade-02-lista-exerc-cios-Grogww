package programacaoOrientadaAObjetos.exercicios2;

import java.util.Scanner;
import java.lang.Math;

public class TabelaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linhasImpressas = 0;

        while (true) {
            System.out.print("Digite um valor (ou 0/negativo para sair): ");
            double valor = scanner.nextDouble();

            if (valor <= 0) {
                break;
            }

            // Imprimir cabeçalho a cada 20 linhas
            if (linhasImpressas % 20 == 0) {
                imprimirCabecalho();
            }

            calcularEImprimir(valor);
            linhasImpressas++;
        }

        scanner.close();
    }

    // Função para imprimir o cabeçalho da tabela
    public static void imprimirCabecalho() {
        System.out.printf("%10s | %10s | %15s\n", "Valor", "Cubo", "Raiz Quadrada");
    }

    // Função para calcular e imprimir os valores
    public static void calcularEImprimir(double valor) {
        double cubo = Math.pow(valor, 3);
        double raizQuadrada = Math.sqrt(valor);
        System.out.printf("%10.2f | %10.2f | %15.4f\n", valor, cubo, raizQuadrada);
    }
}
