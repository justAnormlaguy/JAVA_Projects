package org.example;

import java.security.SecureRandom;

public class GeradorDeSenhas {

    //definição das parada
    private int tam_senha;
    private boolean carac_minusc;
    private boolean carac_maiusc;
    private boolean nums;
    private boolean carac_special;
    private String lower = "abcdefghijklmnopqrstuvwxyz";
    private String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String number = "0123456789";
    private String special = "!@#$%^&*()-_+=<>?/";
    private String senha = "";
    private String conjuntoChar = "";
    SecureRandom random = new SecureRandom();

    //construtor (tem que ter, o porque eu não gravei)
    public GeradorDeSenhas() {
        this.tam_senha = tam_senha;
        this.carac_minusc = carac_minusc;
        this.carac_maiusc = carac_maiusc;
        this.nums = nums;
        this.carac_special = carac_special;
    }

    //metodo pra fazer a senha
    public String gerarSenha(int tam_senha, boolean carac_minusc, boolean carac_maiusc, boolean nums, boolean carac_special) {

        //se for 0 termina o programa pra não gerar erro
        if (tam_senha==0){
            return senha;
        }

        //seleciona o conjunto de caracteres a ser usado (de acordo com o usuario)
        if (carac_minusc) conjuntoChar += lower;
        if (carac_maiusc) conjuntoChar += upper;
        if (nums) conjuntoChar += number;
        if (carac_special) conjuntoChar += special;

        //Garante que pelo menos um caractere de cada conjunto é adicionado na senha
        if (carac_minusc) senha += (lower.charAt(random.nextInt(lower.length())));
        if (carac_maiusc) senha += (upper.charAt(random.nextInt(upper.length())));
        if (nums) senha += (number.charAt(random.nextInt(number.length())));
        if (carac_special) senha += (special.charAt(random.nextInt(special.length())));

        //Laço para terminar a senha escolhendo caracteres aleatórios do conjunto criado anteriormente
        while (senha.length() < tam_senha) {
            senha += (conjuntoChar.charAt(random.nextInt(conjuntoChar.length())));
        }

        //não preciso falar né
        return senha;
    }
}
