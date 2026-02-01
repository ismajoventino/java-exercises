package com.loiane.java_basico.aula42.labs.ex02;

public abstract class Contribuinte {

	private String nome;
	
	public Contribuinte(String nome) {
		super();
		this.nome = nome;
	}

	public abstract double calcularImposto(double rendaBruta);
	
}
