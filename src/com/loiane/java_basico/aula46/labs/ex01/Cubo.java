package com.loiane.java_basico.aula46.labs.ex01;

public class Cubo extends Figura3D implements DimensaoVolumetrica, DimencaoSuperficial {
	
	private double lado;
	private double medidaAresta;

	public Cubo(String nome, String cor, double lado, double medidaAresta) {
		super(nome, cor);
		this.lado = lado;
		this.medidaAresta = medidaAresta;
	}

	@Override
	public double calcularVolume() {
		double volumeCubo = Math.pow(medidaAresta, 3);
		return volumeCubo;
		
		
	}

	@Override
	public double calcularArea() {
		double areaLado = lado * lado;
		double areaTotal = areaLado * 6;
		return areaTotal;
		
		
	}

}
