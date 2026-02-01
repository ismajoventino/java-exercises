package com.loiane.java_basico.aula24;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Fusca";
		van.numPassageiros = 5;
		van.capCombustivel = 30;
		van.consumoCombustivel = 0.15;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		double autonomia  = van.exixbirAutonomia();
		
		System.out.println("A autonomia do carro é: " + autonomia + "km.");
	}

}
