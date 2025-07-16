package br.edu.ifs.designpatterns.interpreter.terminal;

public class Variavel<T extends Comparable<T>> {
    private String nome;
    private T valor;

    public Variavel(String nome, T valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Variavel(T valor) {
        this(null, valor);
    }

    public T getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
