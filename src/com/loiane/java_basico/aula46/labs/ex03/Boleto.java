package com.loiane.java_basico.aula46.labs.ex03;

public class Boleto implements Pagavel {
	
	private String codigoBarras;
	private double valor;
	
	public Boleto(String codigoBarras, double valor) {
		super();
		this.codigoBarras = codigoBarras;
		this.valor = valor;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public double getValorPagamento() {
		return this.valor;
	}

}
