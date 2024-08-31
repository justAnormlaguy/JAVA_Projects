package org.example;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefas {

    private List<Tarefa> tarefas;

    public GerenciadorDeTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String nome, String prazo) {
        tarefas.add(new Tarefa(nome, prazo));
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public Tarefa getTarefa(String nome) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getNome().equalsIgnoreCase(nome)) {
                return tarefa;
            }
        }
        return null;
    }

    public void concluirTarefa(String nome) {
        Tarefa tarefa = getTarefa(nome);
        if (tarefa != null) {
            tarefa.concluirTarefa();
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void alterarPrazo(String nome, String novoPrazo) {
        Tarefa tarefa = getTarefa(nome);
        if (tarefa != null) {
            tarefa.alterarPrazo(novoPrazo);
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }
}
