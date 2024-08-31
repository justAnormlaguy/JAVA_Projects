package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pontuacao pontuacao = new Pontuacao();
        boolean valida = true;

        while (valida) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar pontos");
            System.out.println("2. Remover pontos");
            System.out.println("3. Ver pontuação atual");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a quantidade de pontos para adicionar: ");
                    int pontosAdicionar = scanner.nextInt();
                    pontuacao.adicionarPontos(pontosAdicionar);
                    break;

                case 2:
                    System.out.print("Digite a quantidade de pontos para remover: ");
                    int pontosRemover = scanner.nextInt();
                    pontuacao.removerPontos(pontosRemover);
                    break;

                case 3:
                    System.out.println("Pontuação atual: " + pontuacao.getPontuacao());
                    break;

                case 4:
                    System.out.println("Saindo...");
                    valida = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}
