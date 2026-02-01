package com.loiane.java_basico.aula36.labs;

public class Agenda {

	private String nome;
	private Contato[] contatos;
	
	public Agenda(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato[] getContato() {
		return contatos;
	}
	public void setContato(Contato[] contato) {
		this.contatos = contato;
	}
	
	public String obterInfo() {
		String info = "Nome" + nome + "\n";
		
		if(contatos != null) {
			
		}
		
		return info;
	}
	
	
}
