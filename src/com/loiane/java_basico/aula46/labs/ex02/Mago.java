package com.loiane.java_basico.aula46.labs.ex02;

public class Mago extends Personagem {
	
	private int mana;
	
	public Mago(String nome, int vida, int mana) {
		super(nome, vida);
		this.mana = mana;
	}
	
	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	@Override
	public void atacar() {
		mana -= 15;
		System.out.println("Mago " + getNome() + " lançou bola de fogo!");
	}
	
}
