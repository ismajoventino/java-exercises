package com.loiane.java_basico.aula42.labs.ex02;

public class PessoaJuridica extends Contribuinte {


	public PessoaJuridica(String nome) {
		super(nome);
	}

	@Override
	public double calcularImposto(double rendaBruta) {
		return rendaBruta * 0.10;
	}

}
