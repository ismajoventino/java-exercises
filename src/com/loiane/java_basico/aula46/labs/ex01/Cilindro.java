package com.loiane.java_basico.aula46.labs.ex01;

public class Cilindro extends Figura3D implements DimensaoVolumetrica, DimencaoSuperficial {

	private double altura;
	private double raio;
	final double PI = Math.PI;


	public Cilindro(String nome, String cor, double altura, double raio) {
		super(nome, cor);
		this.altura = altura;
		this.raio = raio;
	}

	@Override
	public double calcularVolume() {
		double volumeTotal = PI * Math.pow(raio, 2) * altura;
		return volumeTotal;
	}

	@Override
	public double calcularArea() {
		double areaBase = PI * Math.pow(raio, 2);
		double areaLateral = (2 * PI) * raio * altura;
		double areaTotal = (2 * areaBase) + areaLateral;
		return areaTotal;
		
	}
	
}
