package com.loiane.java_basico.aula46.labs.ex01;

public class Circulo extends Figura2D implements DimencaoSuperficial {

	private double raio;
	final double PI = Math.PI;
	
	public Circulo(double raio, String nome, String cor) {
		super(nome, cor);
		this.raio = raio;
	}
	

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getPI() {
		return PI;
	}

	@Override
	public double calcularArea() {
		double area = PI * Math.pow(raio, 2);
		return area;
	}

}
