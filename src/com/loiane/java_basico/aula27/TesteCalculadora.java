package com.loiane.java_basico.aula27;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
		
		int numero1 = 20;
		int numero2 = 20;
		
		calc.soma(numero1, numero2);
		calc.soma(1.0, 2.0);

	}

}
