package com.loiane.java_basico.aula42.labs;

public class Vendedor extends Funcionario{
	
	protected double comissao;

	public Vendedor(String nome, double salarioBase, double comissao) {
		super(nome, salarioBase);
		this.comissao = comissao;
	}



	@Override
	public double calcularSalario() {
		
		return salarioBase + (salarioBase * comissao);
	}

}
