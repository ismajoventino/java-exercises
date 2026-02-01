package com.loiane.java_basico.aula33.labs;

public class ArCondicionado {

	private int temperatura;

	public int getTemperatura() {
		return temperatura;
	}

	public boolean setTemperatura(int temperatura) {
		
		if (temperatura >= 16 && temperatura <= 30) {
			this.temperatura = temperatura;
			return true;
		} else {
			return false;
		}
		
	}
	
}
