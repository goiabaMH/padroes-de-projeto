package br.edu.ifs.designpatterns.bridge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.edu.ifs.designpatterns.bridge.obj.Ponto;

public abstract class ObjetoGrafico {
	private Ponto ponto;
	private Plataforma plataforma;

	public ObjetoGrafico(Plataforma plataforma) {
		this.ponto = new Ponto();
		this.plataforma = plataforma;
	}

	public abstract int getVelocidade();

	public Ponto getPosicao() {
		return ponto;
	}
	
	public List<Ponto> andar(boolean b) {
		List<Ponto> trajetoria = new ArrayList<Ponto>();
		float a = (float)15/plataforma.getFPS();
		if (b == true) {
			trajetoria.add(new Ponto(ponto.getX(), ponto.getY()));
			for (int i = 0; i < plataforma.getFPS(); i++) {
				ponto.setX(ponto.getX()+a);
				trajetoria.add(new Ponto(ponto.getX(), ponto.getY()));
			}
			System.out.println(trajetoria);
		}else {
			ponto.setX(ponto.getX()-15);
		}
		return trajetoria;
	}
	
	public void correr(boolean b) {
		if (b == true) {
			ponto.setX(ponto.getX()+30);
		}else {
			ponto.setX(ponto.getX()-30);
		}
	}
	
	public List<Ponto> pular() {
		List<Ponto> trajetoria = new ArrayList<Ponto>();
		float a = (float)15/plataforma.getFPS();
		trajetoria.add(new Ponto(ponto.getX(), ponto.getY()));
		for (int i = 0; i < plataforma.getFPS(); i++) {
			ponto.setY(ponto.getY()+a);
			trajetoria.add(new Ponto(ponto.getX(), ponto.getY()));
		}
		trajetoria.add(new Ponto(ponto.getX(), ponto.getY()));
		for (int i = 0; i < plataforma.getFPS(); i++) {
			ponto.setY(ponto.getY()-a);
			trajetoria.add(new Ponto(ponto.getX(), ponto.getY()));
		}
		System.out.println(trajetoria);
		return trajetoria;
	}
}
