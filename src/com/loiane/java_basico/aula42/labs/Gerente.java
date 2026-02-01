package com.loiane.java_basico.aula42.labs;

public class Gerente extends Funcionario {
	
	protected double bonus;

	public Gerente(String nome, double salarioBase, double bonus) {
		super(nome, salarioBase);
		this.bonus = bonus;
	}



	@Override
	public double calcularSalario() {
		return salarioBase + bonus;
	}

}
