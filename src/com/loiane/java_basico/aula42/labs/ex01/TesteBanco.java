package com.loiane.java_basico.aula42.labs.ex01;

public class TesteBanco {

	public static void main(String[] args) {
		
		ContaPoupanca contaP = new ContaPoupanca("Ismael", "125321", 300, 0.06);
		ContaEspecial contaE = new ContaEspecial("Pedro", "451262", 500, 100);
		
		contaP.sacar(200);
		contaE.sacar(600);
		System.out.println(contaP.getSaldo());
		System.out.println(contaE.getSaldo());
		
		contaP.depositar(100);
		contaE.depositar(0);
		System.out.println(contaP.getSaldo());
		System.out.println(contaE.getSaldo());
		
		contaP.calcularNovoSaldo();
		System.out.println(contaP.getSaldo());
		
		System.out.println(contaP.mostrarDados());
		System.out.println(contaE.mostrarDados());

	}

}
