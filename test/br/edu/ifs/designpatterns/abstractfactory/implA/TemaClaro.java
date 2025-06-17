package br.edu.ifs.designpatterns.abstractfactory.implA;

import br.edu.ifs.designpatterns.abstractfactory.Botao;
import br.edu.ifs.designpatterns.abstractfactory.FabricaInterfaceGrafica;
import br.edu.ifs.designpatterns.abstractfactory.Janela;
import br.edu.ifs.designpatterns.abstractfactory.Menu;

public class TemaClaro implements FabricaInterfaceGrafica {
    public Janela criarJanela() {
        return new JanelaClara();
    }

    public Botao criarBotao() {
        return new BotaoClaro();
    }

    public Menu criarMenu() {
        return new MenuClaro();
    }
}
