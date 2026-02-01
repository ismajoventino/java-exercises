package com.loiane.java_basico.aula42.labs.ex01;

public abstract class ContaBancaria {
	
	private String nome;
	private String numConta;
	private double saldo;
	
	public ContaBancaria(String nome, String numConta, double saldo) {
		super();
		this.nome = nome;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valorSaque) {
		if(this.saldo - valorSaque < 0) {
			System.out.println("Erro ao sacar.");
		} else {
			this.saldo -= valorSaque;
		}
	}
	
	public void depositar(double valorDeposito) {
		if(valorDeposito > 0) {
			saldo += valorDeposito;
		} else {
			System.out.println("Erro ao depositar.");
		}
	}
	
	public String mostrarDados() {
		return getNome() + "; \n" 
				+ getNumConta() + "; \n" 
				+ getSaldo() + "; \n";
	}
	
}
