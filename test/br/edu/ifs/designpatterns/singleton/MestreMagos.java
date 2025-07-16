package br.edu.ifs.designpatterns.singleton;

public class MestreMagos {

    private static MestreMagos instancia = new MestreMagos();

    private int nivelMagia = 1;

    private MestreMagos() {}

    public static MestreMagos obterInstancia() {
        return instancia;
    }

    public int getNivelMagia() {
        return nivelMagia;
    }

    public void elevarNivel() {
        nivelMagia++;
    }
}
