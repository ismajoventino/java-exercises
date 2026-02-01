package com.loiane.java_basico.aula24;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel; 
	
	/*oid exibirAutonomia() {
		System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustivel + " km");
	}*/
	
	double exixbirAutonomia() {
		return capCombustivel * consumoCombustivel;
	}
	
}
