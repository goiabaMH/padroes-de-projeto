package br.edu.ifs.designpatterns.observer.impl;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private List<String> pedidos = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void comprar(Produto produto) {
        if (!produto.estaDisponivel()) {
            throw new IllegalStateException("Produto indisponível");
        }
        pedidos.add(produto.getNome());
        produto.vender();
    }

    public List<String> getPedidos() {
        return pedidos;
    }

    public void notificar(Produto produto) {
        comprar(produto);
    }
}
