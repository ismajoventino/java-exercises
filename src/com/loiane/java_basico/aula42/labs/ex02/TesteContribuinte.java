package com.loiane.java_basico.aula42.labs.ex02;

public class TesteContribuinte {

	public static void main(String[] args) {
		
		PessoaJuridica pj1 = new PessoaJuridica("Antonio");
		PessoaJuridica pj2 = new PessoaJuridica("Pedro");
		PessoaJuridica pj3 = new PessoaJuridica("Marcus");
		
		PessoaFisica pf1 = new PessoaFisica("Carlos");
		PessoaFisica pf2 = new PessoaFisica("José");
		PessoaFisica pf3 = new PessoaFisica("Rafael");
		
		System.out.println(pj1.calcularImposto(2000));
		System.out.println(pj2.calcularImposto(10000));
		System.out.println(pj3.calcularImposto(8800));
		
		System.out.println(pf1.calcularImposto(2000));
		System.out.println(pf2.calcularImposto(10000));
		System.out.println(pf3.calcularImposto(8800));

	}

}
