package com.loiane.java_basico.aula33.labs;

public class Conta {

	private String numero;
	private String agencia;
	private boolean especial;
	private double limiteEspecial;
	private double saldo;
	
	public Conta(String numero, String agencia, boolean especial, 
			double limiteEspecial, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public String getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}
	
	public double getSaldoTotal() {
		return saldo + limiteEspecial;
	}

	public boolean isEspecial() {
		return especial;
	}
	
	public boolean realizarSaque (double valorSaque) {
		
		if (valorSaque <= (saldo + limiteEspecial)) {
			saldo -= valorSaque;
			return true;
		} else {
			return false;
		}
		
	}
	
	public void depositarDinheiro (double valorDeposito) {
		saldo += valorDeposito;
	}
	
	

}
