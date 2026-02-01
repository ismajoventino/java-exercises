package com.loiane.java_basico.aula27.labs;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lamp = new Lampada();
		
		lamp.ligarLampada();
		
		lamp.mostrarEstado();
		
		lamp.desligarLampada();
		
		lamp.mostrarEstado();

	}
}
