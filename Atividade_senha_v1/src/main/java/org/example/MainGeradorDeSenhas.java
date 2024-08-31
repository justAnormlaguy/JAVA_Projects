package org.example;

import java.util.Scanner;

public class MainGeradorDeSenhas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GeradorDeSenhas gerador = new GeradorDeSenhas();
        boolean valida = true;

        while (valida) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Gerar Senha");
            System.out.println("2. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o comprimento da senha: ");
                    int tam_senha = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Incluir letras minúsculas? (s/n): ");
                    boolean carac_minusc = scanner.nextLine().equalsIgnoreCase("s");

                    System.out.print("Incluir letras maiúsculas? (s/n): ");
                    boolean carac_maiusc = scanner.nextLine().equalsIgnoreCase("s");

                    System.out.print("Incluir números? (s/n): ");
                    boolean nums = scanner.nextLine().equalsIgnoreCase("s");

                    System.out.print("Incluir caracteres especiais? (s/n): ");
                    boolean carac_special = scanner.nextLine().equalsIgnoreCase("s");

                    String senha = gerador.gerarSenha(tam_senha, carac_minusc, carac_maiusc, nums, carac_special);
                    System.out.println("Senha gerada: " + senha);
                    break;

                case 2:
                    valida = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
