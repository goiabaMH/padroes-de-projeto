package br.edu.ifs.designpatterns.factorymethod.impl;

import br.edu.ifs.designpatterns.factorymethod.Personagem;

public class Orc implements Personagem {
    public String atacar() {
        return "Ataque: garras";
    }

    public String defender() {
        return "Defesa: absorver";
    }

    public String usarMagia() {
        return "Magia: espirito maligno";
    }
}
