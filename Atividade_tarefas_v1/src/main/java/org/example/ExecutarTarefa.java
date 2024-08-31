package org.example;

import java.util.Scanner;

public class ExecutarTarefa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        boolean valida = true;

        while (valida) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Concluir Tarefa");
            System.out.println("4. Alterar Prazo");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da tarefa: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o prazo da tarefa: ");
                    String prazo = scanner.nextLine();
                    gerenciador.adicionarTarefa(nome, prazo);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    System.out.println("Lista de Tarefas:");
                    for (Tarefa tarefa : gerenciador.getTarefas()) {
                        System.out.println("Nome: " + tarefa.getNome() +
                                ", Prazo: " + tarefa.getPrazo() +
                                ", Concluída: " + (tarefa.isConcluida() ? "Sim" : "Não"));
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome da tarefa a ser concluída: ");
                    String nomeConcluir = scanner.nextLine();
                    gerenciador.concluirTarefa(nomeConcluir);
                    break;

                case 4:
                    System.out.print("Digite o nome da tarefa para alterar o prazo: ");
                    String nomeAlterar = scanner.nextLine();
                    System.out.print("Digite o novo prazo: ");
                    String novoPrazo = scanner.nextLine();
                    gerenciador.alterarPrazo(nomeAlterar, novoPrazo);
                    break;

                case 5:
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
