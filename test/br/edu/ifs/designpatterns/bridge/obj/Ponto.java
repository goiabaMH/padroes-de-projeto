package br.edu.ifs.designpatterns.bridge.obj;

public class Ponto {
	private float x;
	private float y;
	
	
	
	public Ponto(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public Ponto() {
		x=0;
		y=0;
	}

	public float getX() {
		return x;
	}
	
	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public String toString() {
		return "{" + x + ", " + y + "}";
	}
}
