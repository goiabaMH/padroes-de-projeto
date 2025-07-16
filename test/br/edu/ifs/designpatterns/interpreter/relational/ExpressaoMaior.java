package br.edu.ifs.designpatterns.interpreter.relational;

import br.edu.ifs.designpatterns.interpreter.terminal.Variavel;

public class ExpressaoMaior<T extends Comparable<T>> implements ExpressaoRelacional<T> {

    private Variavel<T> esquerda;
    private Variavel<T> direita;

    public ExpressaoMaior(Variavel<T> esquerda, Variavel<T> direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public boolean avaliar() {
        return esquerda.getValor().compareTo(direita.getValor()) > 0;
    }

    @Override
    public String toString() {
        return (esquerda.getNome() != null ? esquerda.getNome() : esquerda.getValor().toString()) +
               " maior do que " + direita.getValor();
    }
}
