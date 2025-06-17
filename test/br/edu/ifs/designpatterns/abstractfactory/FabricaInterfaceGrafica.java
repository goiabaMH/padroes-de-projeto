package br.edu.ifs.designpatterns.abstractfactory;

public interface FabricaInterfaceGrafica {

	public Janela criarJanela();

	public Botao criarBotao();

	public Menu criarMenu();
	
}
