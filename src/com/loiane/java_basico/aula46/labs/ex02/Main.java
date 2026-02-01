package com.loiane.java_basico.aula46.labs.ex02;

import com.loiane.java_basico.aula46.labs.ex01.DimencaoSuperficial;

public class Main {

	public static void main(String[] args) {
		
		Mago mago1 = new Mago("BigThief", 100, 50);
		Mago mago2 = new Mago("Apokalypsis", 100, 60);
		Guerreiro guerreiro1 = new Guerreiro("Adrian", 75, 40);
		Guerreiro guerreiro2 = new Guerreiro("Lois", 85, 50);
		
		
		Personagem[] personagens = new Personagem[4];
		
		personagens[0] = mago1;
		personagens[1] = mago2;
		personagens[2] = guerreiro1;
		personagens[3] = guerreiro2;
		
		for(Personagem p : personagens) {
			p.atacar();
			if(p instanceof Guerreiro) {
				Guerreiro guerreiro = (Guerreiro) p;
				guerreiro.setEstamina(guerreiro.getEstamina() + 5);
		        System.out.println("Estamina recuperada!");
		        
		        
			} else if (p instanceof Mago) {
				Mago mago = (Mago) p;
				mago.setMana(mago.getMana() + 5);
				System.out.println("Mana recarregada");
			}
			
		}

	}

}
