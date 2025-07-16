package br.edu.ifs.designpatterns.observer.impl;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nome;
    private int quantidade = 0;
    private List<Cliente> inscritos = new ArrayList<>();

    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionar(int quantidade) {
        this.quantidade += quantidade;
        notificarInscritos();
    }

    public void vender() {
        if (quantidade <= 0) {
            throw new IllegalStateException("Produto indisponível");
        }
        quantidade--;
    }

    public boolean estaDisponivel() {
        return quantidade > 0;
    }

    public void inscrever(Cliente cliente) {
        if (!inscritos.contains(cliente)) {
            inscritos.add(cliente);
        }
    }

    private void notificarInscritos() {
        if (estaDisponivel()) {
            for (Cliente cliente : new ArrayList<>(inscritos)) {
                cliente.notificar(this);
            }
        }
    }
}
