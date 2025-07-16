package br.edu.ifs.designpatterns.prototype.impl;

import br.edu.ifs.designpatterns.prototype.Robo;

import java.util.Objects;

public class RoboTanque implements Robo {

    private int energia;
    private int velocidade;
    private String arma;

    public RoboTanque(int energia, int velocidade, String arma) {
        this.energia = energia;
        this.velocidade = velocidade;
        this.arma = arma;
    }

    @Override
    public Robo clonar() {
        return new RoboTanque(energia, velocidade, arma);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoboTanque)) return false;
        RoboTanque that = (RoboTanque) o;
        return energia == that.energia &&
               velocidade == that.velocidade &&
               Objects.equals(arma, that.arma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(energia, velocidade, arma);
    }
}
