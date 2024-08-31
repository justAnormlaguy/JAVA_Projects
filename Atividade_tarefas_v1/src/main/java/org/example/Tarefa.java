package org.example;

public class Tarefa {
    private String nome;
    private String prazo;
    private boolean concluida;

    public Tarefa(String nome, String prazo) {
        this.nome = nome;
        this.prazo = prazo;
        this.concluida = false;
    }

    public String getNome() {
        return nome;
    }

    public String getPrazo() {
        return prazo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void concluirTarefa() {
        if (concluida){
            System.out.println("A" + getNome() + " ja foi concluida");
        } else {
            concluida = true;
            System.out.println(getNome() + " Concluida!");
        }
    }

    public void alterarPrazo(String date) {
        System.out.println("Prazo anterior: " + getPrazo());
        setPrazo(date);
        System.out.println("Prazo atualizado: " + getPrazo());
    }
}
