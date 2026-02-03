package com.loiane.java_basico.intensivo_exercicios;

public class Elevador {

	private int andar;
	private int totalAndar;
	private int capacidade;
	private int pessoasPresentes;
	private static int totalViagens;

	public Elevador(int totalAndar, int capacidade) {
		super();
		this.totalAndar = totalAndar;
		this.capacidade = capacidade;
	}
	public int getAndar() {
		return andar;
	}
	public void setTotalAndar(int total) {
		this.totalAndar = total;
	}
	public int getPessoasPresentes() {
		return pessoasPresentes;
	}
	public static int getTotalViagens() {
		return totalViagens;
	}
	
	public void entrar() {
		if(pessoasPresentes < capacidade) {
			pessoasPresentes++;
		} else {
			System.out.println("Capacidade de pessoas atingida.");
		}
	}
	
	public void sair() {
		if(pessoasPresentes > 0) {
			pessoasPresentes--;
		} else {
			System.out.println("Não há pessoas.");
		}
	}
	
	public void sobe() {
		
		if(andar == totalAndar) {
			System.out.println("Você ja está no último andar.");
		} else {
			andar++;
			totalViagens++;
		}
		
	}
	
	public void desce() {
		
		if (andar == 0) {
			System.out.println("Você já está no térreo!");
		} else {
			andar--;
			totalViagens++;
		}
		
	}
	
	
	
	
	
}
