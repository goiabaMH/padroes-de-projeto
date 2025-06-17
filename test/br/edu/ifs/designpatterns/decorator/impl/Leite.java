package br.edu.ifs.designpatterns.decorator.impl;

import br.edu.ifs.designpatterns.decorator.Component;

public class Leite implements Component{
	private Component componente;

	public Leite(Component componente) {
		this.componente = componente;
	}

	public double custo() {
		return componente.custo() + 0.5;
	}

	public String getDescricao() {
		return componente.getDescricao() + ", com leite";
	}

}
