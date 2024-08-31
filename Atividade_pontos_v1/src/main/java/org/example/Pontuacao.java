package org.example;

public class Pontuacao {
    private int pontos;

    //quando é int inicializa no construtor com algum valor
    public Pontuacao() {
        this.pontos = 0;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getPontuacao() {
        return pontos;
    }

    public void adicionarPontos(int i) {
        System.out.println("Pontos anteriores: " + getPontuacao());
        pontos += i;
        System.out.println("Pontos adicionados: " + i);
        System.out.println("Pontos atuais: " + getPontuacao());
    }

    public void removerPontos(int i) {
        //validacao para não deixar negativo
        if (pontos - i < 0) {
            System.out.println("Tentativa de remover mais pontos do que o disponível.");
            return;
        }
        System.out.println("Pontos anteriores: " + getPontuacao());
        pontos -= i;
        System.out.println("Pontos retirados: " + i);
        System.out.println("Pontos atuais: " + getPontuacao());
    }
}
