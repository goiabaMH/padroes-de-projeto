package br.edu.ifs.designpatterns.decorator.impl;

import br.edu.ifs.designpatterns.decorator.Component;

public class Acucar implements Component{
	private Component componente;	

	public Acucar(Component componente) {
		this.componente = componente;
	}

	public double custo() {
		return componente.custo() + 0.3;
	}

	public String getDescricao() {
		return componente.getDescricao() + ", com açúcar";
	}

}
