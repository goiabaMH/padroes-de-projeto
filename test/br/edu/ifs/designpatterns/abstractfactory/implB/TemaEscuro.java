package br.edu.ifs.designpatterns.abstractfactory.implB;

import br.edu.ifs.designpatterns.abstractfactory.Botao;
import br.edu.ifs.designpatterns.abstractfactory.FabricaInterfaceGrafica;
import br.edu.ifs.designpatterns.abstractfactory.Janela;
import br.edu.ifs.designpatterns.abstractfactory.Menu;
import br.edu.ifs.designpatterns.abstractfactory.implA.BotaoClaro;
import br.edu.ifs.designpatterns.abstractfactory.implA.JanelaClara;
import br.edu.ifs.designpatterns.abstractfactory.implA.MenuClaro;

public class TemaEscuro implements FabricaInterfaceGrafica {
	public Janela criarJanela() {
		return new JanelaEscura();
	}

	public Botao criarBotao() {
		return new BotaoEscuro();
	}

	public Menu criarMenu() {
		return new MenuEscuro();
	}
}
