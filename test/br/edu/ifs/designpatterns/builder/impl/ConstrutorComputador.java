package br.edu.ifs.designpatterns.builder.impl;

import br.edu.ifs.designpatterns.builder.Construtor;

public class ConstrutorComputador implements Construtor {

    private Computador computador;

    public ConstrutorComputador() {
        reset();
    }

    @Override
    public void reset() {
        this.computador = new Computador();
    }

    @Override
    public void setProcessador(String processador) {
        this.computador.setProcessador(processador);
    }

    @Override
    public void setHD(int hd) {
        this.computador.setHD(hd);
    }

    @Override
    public void setRAM(int ram) {
        this.computador.setRAM(ram);
    }

    @Override
    public Computador getComputador() {
        return this.computador;
    }
}
