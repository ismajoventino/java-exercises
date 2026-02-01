package com.loiane.java_basico.aula42.labs.ex02;

public class PessoaFisica extends Contribuinte{

	public PessoaFisica(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularImposto(double rendaBruta) {
		if(rendaBruta > 0 && rendaBruta <= 1400) {
			return rendaBruta;
		} else if (rendaBruta > 1400 && rendaBruta <= 2100) {
			return (rendaBruta * 0.1) - 100;
		} else if (rendaBruta > 2100 && rendaBruta <= 2800) {
			return (rendaBruta * 0.15) - 270;
		} else if (rendaBruta > 2800 && rendaBruta <= 3600) {
			return (rendaBruta * 0.25) - 500;
		} else {
			return (rendaBruta * 0.3) - 700;
		}
	}

}
