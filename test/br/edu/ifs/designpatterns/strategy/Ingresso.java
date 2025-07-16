package br.edu.ifs.designpatterns.strategy;

public class Ingresso {

    private double valorBase;
    private EstrategiaDesconto estrategia;

    public Ingresso(double valorBase, EstrategiaDesconto estrategia) {
        this.valorBase = valorBase;
        this.estrategia = estrategia;
    }

    public double calcularValor() {
        return estrategia.aplicarDesconto(valorBase);
    }
}
