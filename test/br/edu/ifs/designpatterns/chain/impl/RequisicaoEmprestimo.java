package br.edu.ifs.designpatterns.chain.impl;

public class RequisicaoEmprestimo {
    private double valor;
    private double renda;
    private int score;

    public RequisicaoEmprestimo(double valor, double renda, int score) {
        this.valor = valor;
        this.renda = renda;
        this.score = score;
    }

    public double getValor() {
        return valor;
    }

    public double getRenda() {
        return renda;
    }

    public int getScore() {
        return score;
    }
}
