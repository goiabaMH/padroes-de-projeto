package br.edu.ifs.designpatterns.interpreter.relational;

public interface ExpressaoRelacional<T extends Comparable<T>> {
    boolean avaliar();
    String toString();
}
