package com.loiane.java_basico.aula27.labs;

public class Lampada {

	boolean ligada;
	
	void ligarLampada() {
		ligada = true;
	}
	
	void desligarLampada() {
		ligada = false;
	}
	
	void mostrarEstado() {
		
		if (ligada) {
			System.out.println("A lampada está ligada");
		} else {
			System.out.println("A lampada está desligada");
		}
		
	}
	
}
