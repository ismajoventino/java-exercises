package com.loiane.java_basico.aula46.labs.ex02;

public class Personagem implements Atacante {
	
	private String nome;
	private int vida;
	
	public Personagem(String nome, int vida) {
		super();
		this.nome = nome;
		this.vida = vida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	@Override
	public void atacar() {
	}

}
