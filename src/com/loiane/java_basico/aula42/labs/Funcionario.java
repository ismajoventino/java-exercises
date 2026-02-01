package com.loiane.java_basico.aula42.labs;

public abstract class Funcionario {
	
	protected String nome;
	protected double salarioBase;

	public Funcionario(String nome, double salarioBase) {
		super();
		this.nome = nome;
		this.salarioBase = salarioBase;
	}
	
	public void imprimirRecibo() {
		System.out.println("RECIBO DE: " + this.nome);
	}
	
	public abstract double calcularSalario();
		

}
