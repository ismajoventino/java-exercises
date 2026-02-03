package com.loiane.java_basico.intensivo_exercicios;

public class TesteElevadores {

	public static void main(String[] args) {
		
		Elevador elevador1 = new Elevador(10, 5);
		Elevador elevador2 = new Elevador(15, 8);
		
		elevador1.entrar();
		elevador1.sobe();
		elevador1.sobe();
		elevador1.entrar();
		elevador1.entrar();
		elevador1.sobe();
		elevador1.sair();
		elevador1.sair();
		
		elevador2.entrar();
		elevador2.entrar();
		elevador2.entrar();
		elevador2.sobe();
		elevador2.sobe();
		elevador2.sair();
		elevador2.sobe();
		elevador2.sobe();
		elevador2.sair();
		elevador2.sair();
		
		System.out.println(elevador1.getTotalViagens());
		
		
		}

}
