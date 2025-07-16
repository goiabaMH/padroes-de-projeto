package br.edu.ifs.designpatterns.builder.impl;

public class Computador {
    private String processador;
    private int hd;
    private int ram;

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setHD(int hd) {
        this.hd = hd;
    }

    public void setRAM(int ram) {
        this.ram = ram;
    }

    public String getProcessador() {
        return this.processador;
    }

    public int getHD() {
        return this.hd;
    }

    public int getRAM() {
        return this.ram;
    }
}
