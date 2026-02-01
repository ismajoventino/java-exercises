package com.loiane.java_basico.aula46.labs.ex03;

public class Main {

	public static void main(String[] args) {
		
		Boleto boleto1 = new Boleto("1221524", 300);
		Boleto boleto2 = new Boleto("2551552", 200);
		Funcionario func1 = new Funcionario("Pedro", 50, 30);
		Funcionario func2 = new Funcionario("Leticia", 60, 30);
		
		Pagavel[] pagaveis = new Pagavel[4];
		
		pagaveis[0] = boleto1;
		pagaveis[1] = func1;
		pagaveis[2] = func2;
		pagaveis[3] = boleto2;
		
		double totalGastos = 0;
		
		for(Pagavel p : pagaveis) {
			
			if (p instanceof Funcionario) {
				Funcionario funcionario = (Funcionario) p;
				if(funcionario.getValorPagamento() > 2000) {
					System.out.println("Valor a receber (com imposto): " + (funcionario.getValorPagamento()) * 0.9);
				}
				totalGastos += funcionario.getValorPagamento();
			} else if (p instanceof Boleto) {
				Boleto boleto = (Boleto) p;
				totalGastos += boleto.getValorPagamento();
			}
			
		}
		
		System.out.println("------------------------");
		
		System.out.println(totalGastos);
		

	}

}
