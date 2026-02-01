package com.loiane.java_basico.aula51.labs;

public class Musica {
	
	private String titulo;
	private int duracao;
	private String arquivoAudio;
	private boolean isExplicit;
	
	public Musica(String titulo, int duracao, String arquivoAudio, boolean isExplicit) {
		
		if (arquivoAudio == null || arquivoAudio.isEmpty()) {
			throw new ArquivoCorrompidoException("Arquivo de audio está vazio.");
		}
		if (duracao < 0) {
			throw new IllegalArgumentException("Duração inválida.");
		}
		
		this.titulo = titulo;
		this.arquivoAudio = arquivoAudio;
		this.duracao = duracao;
		this.isExplicit = isExplicit;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public String getArquivoAudio() {
		return arquivoAudio;
	}
	
	public void setArquivoAudio(String arquivoAudio) {
		this.arquivoAudio = arquivoAudio;
	}
	
	public boolean isExplicit() {
		return isExplicit;
	}

	public void setExplicit(boolean isExplicit) {
		this.isExplicit = isExplicit;
	}
	
	@Override
	public String toString() {
		String s =  "Titulo: " + this.titulo
				+ "\nDuração: " + this.duracao + ":00 min";
		return s;
	}
}
