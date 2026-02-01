package com.loiane.java_basico.aula46.labs.ex01;

public class Piramide extends Figura3D implements DimensaoVolumetrica, DimencaoSuperficial {

	private double ladoBase;
	private double altura;


	public Piramide(String nome, String cor, double ladoBase, double altura) {
		super(nome, cor);
		this.ladoBase = ladoBase;
		this.altura = altura;
	}

	@Override
	public double calcularVolume() {
		double volumeTotal = (ladoBase * ladoBase) / 3;
		return volumeTotal;
		
	}

	@Override
	public double calcularArea() {
		double areaBase = ladoBase * ladoBase;
		double areaAltura = (areaBase * altura) / 2;
		double areaTotal = areaBase + areaAltura;
		return areaTotal;	
	}


}
