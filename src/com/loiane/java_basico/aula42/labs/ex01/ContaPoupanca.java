package com.loiane.java_basico.aula42.labs.ex01;

public class ContaPoupanca extends ContaBancaria{
	
	private double diaRendimento;
	
	public ContaPoupanca(String nome, String numConta, double saldo, double diaRendimento) {
		super(nome, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo() {
		setSaldo(getSaldo() + (getSaldo() * diaRendimento));
	}

	@Override
	public String mostrarDados() {
		return super.mostrarDados() + diaRendimento + "; \n";
	}

}
