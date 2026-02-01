package com.loiane.java_basico.aula46.labs.ex01;

public class Quadrado extends Figura2D implements DimencaoSuperficial {

	private double lado;
	
	public Quadrado(double lado, String nome, String cor) {
		super(nome, cor);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}


}
