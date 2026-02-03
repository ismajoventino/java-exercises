package com.loiane.java_basico.intensivo_exercicios;

public class Carrinho {

	private Produto[] itens;
	
	public Carrinho(int qtdProdutos) {
		this.itens = new Produto[qtdProdutos];
	}

	public Produto[] getItens() {
		return itens;
	}

	public void setItens(Produto[] itens) {
		this.itens = itens;
	}

	public void adicionar (Produto p) {
		for(int i = 0; i < itens.length; i++) {
			if(itens[i] == null) {
				itens[i] = p;
				break;
			}
		}
	}
	
	public double calcularTotal () {
		
		double soma = 0;
		
		for(int i = 0; i < itens.length; i++) {
			if(itens[i] != null) {
				soma += itens[i].getPreco();
			} else {
				break;
			}
		}
		
		return soma;
	}
	
	
}
