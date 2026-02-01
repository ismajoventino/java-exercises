package com.loiane.java_basico.aula46.labs.ex03;

public class Funcionario implements Pagavel {

	private String nome;
	private double salarioHora;
	private int horasTrabalhadas;
	
	public Funcionario(String nome, double salarioHora, int horasTrabalhadas) {
		super();
		this.nome = nome;
		this.salarioHora = salarioHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public double getValorPagamento() {
		double valorFinal = this.salarioHora * this.horasTrabalhadas;
		return valorFinal;
		
	}

}
