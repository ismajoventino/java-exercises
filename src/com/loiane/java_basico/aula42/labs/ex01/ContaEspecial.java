package com.loiane.java_basico.aula42.labs.ex01;

public class ContaEspecial extends ContaBancaria {

	private double limite;
	
	public ContaEspecial(String nome, String numConta, double saldo, double limite) {
		super(nome, numConta, saldo);
		this.limite = limite;
	}

	@Override
	public void sacar(double valorSaque) {
		
		double saldoTotal = getSaldo() + limite;
		
		if(saldoTotal >= valorSaque) {
			setSaldo(saldoTotal - valorSaque);
			limite -= (saldoTotal - valorSaque);
		} else {
			System.out.println("Erro ao sacar.");
		}
		
		
	}

	@Override
	public String mostrarDados() {
		return super.mostrarDados() + limite + "; \n";
	}
	
}
