package br.edu.ifs.designpatterns.factorymethod.impl;

import br.edu.ifs.designpatterns.factorymethod.Personagem;

public class Elfo implements Personagem {
    public String atacar() {
        return "Ataque: arco e flecha";
    }

    public String defender() {
        return "Defesa: esquiva";
    }

    public String usarMagia() {
        return "Magia: cura";
    }
}
