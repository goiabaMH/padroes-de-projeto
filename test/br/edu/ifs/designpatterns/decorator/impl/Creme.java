package br.edu.ifs.designpatterns.decorator.impl;

import br.edu.ifs.designpatterns.decorator.Component;

public class Creme implements Component{
	private Component componente;

	public Creme(Component componente) {
		this.componente = componente;
	}

	public double custo() {
		return componente.custo() + 1.0;
	}

	public String getDescricao() {
		return componente.getDescricao() + ", com creme";
	}

}
