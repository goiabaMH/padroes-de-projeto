package br.edu.ifs.designpatterns.composite.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.composite.Componente;

public class Combo extends Componente {
    private String nome;
    private List<Componente> componentes = new ArrayList<>();

    public Combo(String nome) {
        this.nome = nome;
    }

    public void adicionar(Componente componente) {
        componentes.add(componente);
    }

    public double calcularPreco() {
        double total = 0;
        for (Componente componente : componentes) {
            total += componente.calcularPreco();
            System.out.println(total);
        }
        
        return total;
    }
}
