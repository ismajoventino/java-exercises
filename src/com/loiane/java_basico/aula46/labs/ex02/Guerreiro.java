package com.loiane.java_basico.aula46.labs.ex02;

public class Guerreiro extends Personagem {

	private int estamina;
	
	public int getEstamina() {
		return estamina;
	}

	public void setEstamina(int estamina) {
		this.estamina = estamina;
	}

	public Guerreiro(String nome, int vida, int estamina) {
		super(nome, vida);
		this.estamina = estamina;
	}

	@Override
	public void atacar() {
		estamina -= 10;
		System.out.println("Guerreiro " + getNome() + " desferiu um golpe de espada!");
	}

}
