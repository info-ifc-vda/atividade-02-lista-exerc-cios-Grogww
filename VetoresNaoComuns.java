package programacaoOrientadaAObjetos.exercicios2;

import java.util.Arrays;

public class VetoresNaoComuns {
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetor2 = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        int[] vetorNaoComuns = gerarVetorNaoComuns(vetor1, vetor2);

        System.out.println("Vetor 1: " + Arrays.toString(vetor1));
        System.out.println("Vetor 2: " + Arrays.toString(vetor2));
        System.out.println("Vetor não comuns: " + Arrays.toString(vetorNaoComuns));
    }

    // Função para gerar o vetor dos números não comuns
    public static int[] gerarVetorNaoComuns(int[] vetor1, int[] vetor2) {
        int[] vetorNaoComuns = new int[vetor1.length + vetor2.length];
        int indice = 0;

        // Adicionar números do vetor1 que não estão no vetor2
        for (int i = 0; i < vetor1.length; i++) {
            if (!estaNoVetor(vetor2, vetor1[i])) {
                vetorNaoComuns[indice++] = vetor1[i];
            }
        }

        // Adicionar números do vetor2 que não estão no vetor1
        for (int i = 0; i < vetor2.length; i++) {
            if (!estaNoVetor(vetor1, vetor2[i])) {
                vetorNaoComuns[indice++] = vetor2[i];
            }
        }

        // Redimensionar o vetor para o tamanho correto
        int[] vetorNaoComunsRedimensionado = new int[indice];
        System.arraycopy(vetorNaoComuns, 0, vetorNaoComunsRedimensionado, 0, indice);

        return vetorNaoComunsRedimensionado;
    }

    // Função para verificar se um número está em um vetor
    public static boolean estaNoVetor(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }
}