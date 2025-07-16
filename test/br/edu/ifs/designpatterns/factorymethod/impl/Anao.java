package br.edu.ifs.designpatterns.factorymethod.impl;

import br.edu.ifs.designpatterns.factorymethod.Personagem;

public class Anao implements Personagem {
    public String atacar() {
        return "Ataque: machado";
    }

    public String defender() {
        return "Defesa: escudo";
    }

    public String usarMagia() {
        return "Magia: resistência";
    }
}
