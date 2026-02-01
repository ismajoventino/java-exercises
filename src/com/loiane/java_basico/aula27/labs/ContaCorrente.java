package com.loiane.java_basico.aula27.labs;

public class ContaCorrente {

	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double saldo;
	
	boolean realizarSaque(double valorSaque) {
		
		if (valorSaque <= (saldo + limiteEspecial)){
			saldo -= valorSaque;
			return true;
		} else {
			return false;
		}
	}
	
	void depositarDinheiro(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	double verificarSaldo() {
		return saldo;
	}
	
	double verificarCheque() {
		
		
		return limiteEspecial + saldo;
	}
	
}
