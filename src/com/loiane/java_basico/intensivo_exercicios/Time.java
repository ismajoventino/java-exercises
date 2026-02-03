package com.loiane.java_basico.intensivo_exercicios;

public class Time {
	
	private String nome;
	private Jogador[] elenco;
	
	public Time(int qtdJogadores) {
		
		this.elenco = new Jogador[qtdJogadores];
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public Jogador[] getElenco() {
		return elenco;
	}
	public void setElenco(Jogador[] elenco) {
		this.elenco = elenco;
	}
	public void adicionarJogador(Jogador j) {
		for(int i = 0; i < elenco.length; i++) {
			if(elenco[i] == null) {
				elenco[i] = j;
				break;
			}
			
		}
	}
	
	public Jogador getArtilheiro() {
		int maiorNumeroGols = 0;
		Jogador melhorJogador = null;
	
		for(int i = 0; i < elenco.length; i++) {
			if(elenco[i] != null) {
				
				if (elenco[i].getGolsMarcados() > maiorNumeroGols) {
					maiorNumeroGols = elenco[i].getGolsMarcados();
					melhorJogador = elenco[i];
				}
				
			}
		}
		
		return melhorJogador;
		
	}
	
	
	
	

}
