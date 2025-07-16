package br.edu.ifs.designpatterns.flyweight.impl;

import br.edu.ifs.designpatterns.flyweight.Flyweight;

public class Bloco {
    private int x, y, z;
    private Flyweight tipo;

    public Bloco(int x, int y, int z, Flyweight tipo) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.tipo = tipo;
    }

    public Flyweight getTipo() {
        return tipo;
    }

    public String mostrar() {
        return String.format("%s, %s, %s, %s, x: %d, y: %d, z: %d",
            tipo.getTipo(),
            tipo.isQuebravel() ? "quebrável" : "inquebrável",
            tipo.isInflamavel() ? "inflamável" : "inflamável",
            tipo.isEmpilhavel() ? "empilhável" : "não empilhável",
            x, y, z);
    }
}
