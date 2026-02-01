package com.loiane.java_basico.aula42.labs;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente("Ismael", 5000, 1000);
		Funcionario vendedor = new Vendedor("João", 2000, 0.1);

		gerente.imprimirRecibo();
		
		System.out.println(gerente.calcularSalario());
		System.out.println(vendedor.calcularSalario());
		
	}

}
