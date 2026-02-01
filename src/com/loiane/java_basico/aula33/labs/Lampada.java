package com.loiane.java_basico.aula33.labs;

public class Lampada {

	private String marca;
	private int voltagem;
	private String cor;
	private String tipo;
	private double preco;
	private boolean ligada;
	
	public Lampada(String marca, int voltagem, String cor, String tipo, double preco) {
		super();
		this.marca = marca;
		this.voltagem = voltagem;
		this.cor = cor;
		this.tipo = tipo;
		this.preco = preco;
	}
	
	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public boolean ligarLampada () {
		ligada = true;
		return ligada;
	}
	
	public boolean desligarLampada () {
		ligada = false;
		return ligada;
	}
	
	
	
	
}
