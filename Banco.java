package programacaoOrientadaAObjetos.exercicios2;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] codigos = new int[10];
        double[] saldos = new double[10];

        // Leitura dos códigos e saldos
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o código da conta " + (i + 1) + ": ");
            codigos[i] = scanner.nextInt();
            System.out.print("Digite o saldo da conta " + (i + 1) + ": ");
            saldos[i] = scanner.nextDouble();
        }

        // Menu
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Efetuar depósito");
            System.out.println("2. Efetuar saque");
            System.out.println("3. Consultar o ativo bancário");
            System.out.println("4. Finalizar programa");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    efetuarDeposito(codigos, saldos, scanner);
                    break;
                case 2:
                    efetuarSaque(codigos, saldos, scanner);
                    break;
                case 3:
                    consultarAtivoBancario(saldos);
                    break;
                case 4:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    // Função para efetuar depósito
    public static void efetuarDeposito(int[] codigos, double[] saldos, Scanner scanner) {
        System.out.print("Digite o código da conta para depósito: ");
        int codigo = scanner.nextInt();
        System.out.print("Digite o valor do depósito: ");
        double valor = scanner.nextDouble();

        int indice = encontrarIndice(codigos, codigo);
        if (indice != -1) {
            saldos[indice] += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    // Função para efetuar saque
    public static void efetuarSaque(int[] codigos, double[] saldos, Scanner scanner) {
        System.out.print("Digite o código da conta para saque: ");
        int codigo = scanner.nextInt();
        System.out.print("Digite o valor do saque: ");
        double valor = scanner.nextDouble();

        int indice = encontrarIndice(codigos, codigo);
        if (indice != -1) {
            if (saldos[indice] >= valor) {
                saldos[indice] -= valor;
                System.out.println("Saque realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    // Função para consultar o ativo bancário
    public static void consultarAtivoBancario(double[] saldos) {
        double ativoBancario = 0;
        for (double saldo : saldos) {
            ativoBancario += saldo;
        }
        System.out.println("Ativo bancário: R$ " + ativoBancario);
    }

    // Função para encontrar o índice de uma conta
    public static int encontrarIndice(int[] codigos, int codigo) {
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) {
                return i;
            }
        }
        return -1;
    }
}