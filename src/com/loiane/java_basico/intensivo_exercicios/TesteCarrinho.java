package com.loiane.java_basico.intensivo_exercicios;

import java.util.Scanner;

public class TesteCarrinho {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Carrinho carrinho1 = new Carrinho(2);
		
		//Produto[] arrayProdutos = new Produto[carrinho1.getItens().length];
		
		for(int i = 0; i < carrinho1.getItens().length; i++) {
			Produto produto = new Produto();
			
			System.out.println("Produto " + (i+1) + ":");
			
			System.out.println("Nome: ");
			produto.setNome(scan.nextLine());
			
			System.out.println("Preço: ");
			produto.setPreco(scan.nextDouble());
			scan.nextLine();
			
			//arrayProdutos[i] = produto;
			
			carrinho1.adicionar(produto);
			
		}
		
		
		System.out.println("TOTAL: " + carrinho1.calcularTotal());
		
		

	}

}
