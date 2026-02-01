package com.loiane.java_basico.aula51.labs;

public class User {

	private String nome;
	private int idade;
	private boolean isVip;
	
	public User(String nome, int idade, boolean isVip) {
		this.nome = nome;
		this.idade = idade;
		this.isVip = isVip;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isVip() {
		return isVip;
	}
	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}

}
