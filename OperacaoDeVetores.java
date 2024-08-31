package programacaoOrientadaAObjetos.exercicios2;

import java.util.Arrays;

public class OperacaoDeVetores {
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetor2 = {2, 4, 6, 8, 3};

        int[] vetorSomaPares = calcularVetorSomaPares(vetor1, vetor2);
        int[] vetorDivisoresImpares = calcularVetorDivisoresImpares(vetor1, vetor2);

        System.out.println("Vetor 1: " + Arrays.toString(vetor1));
        System.out.println("Vetor 2: " + Arrays.toString(vetor2));
        System.out.println("Vetor soma pares: " + Arrays.toString(vetorSomaPares));
        System.out.println("Vetor divisores ímpares: " + Arrays.toString(vetorDivisoresImpares));
    }

    // Função para calcular o vetor soma pares
    public static int[] calcularVetorSomaPares(int[] vetor1, int[] vetor2) {
        int[] vetorSomaPares = new int[vetor1.length];
        int indice = 0;

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 == 0) {
                int soma = vetor1[i];
                for (int j = 0; j < vetor2.length; j++) {
                    soma += vetor2[j];
                }
                vetorSomaPares[indice++] = soma;
            }
        }

        // Redimensionar o vetor para o tamanho correto
        int[] vetorSomaParesRedimensionado = new int[indice];
        System.arraycopy(vetorSomaPares, 0, vetorSomaParesRedimensionado, 0, indice);

        return vetorSomaParesRedimensionado;
    }

    // Função para calcular o vetor divisores ímpares
    public static int[] calcularVetorDivisoresImpares(int[] vetor1, int[] vetor2) {
        int[] vetorDivisoresImpares = new int[vetor1.length];
        int indice = 0;

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 != 0) {
                int divisores = 0;
                for (int j = 0; j < vetor2.length; j++) {
                    if (vetor1[i] % vetor2[j] == 0) {
                        divisores++;
                    }
                }
                vetorDivisoresImpares[indice++] = divisores;
            }
        }

        // Redimensionar o vetor para o tamanho correto
        int[] vetorDivisoresImparesRedimensionado = new int[indice];
        System.arraycopy(vetorDivisoresImpares, 0, vetorDivisoresImparesRedimensionado, 0, indice);

        return vetorDivisoresImparesRedimensionado;
    }
}
