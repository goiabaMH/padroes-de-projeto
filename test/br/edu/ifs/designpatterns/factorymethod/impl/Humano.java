package br.edu.ifs.designpatterns.factorymethod.impl;

import br.edu.ifs.designpatterns.factorymethod.Personagem;

public class Humano implements Personagem {
    public String atacar() {
        return "Ataque: espada";
    }

    public String defender() {
        return "Defesa: rolar";
    }

    public String usarMagia() {
        return "Magia: raio de luz";
    }
}
