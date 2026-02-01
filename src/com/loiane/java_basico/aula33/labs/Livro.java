package com.loiane.java_basico.aula33.labs;

public class Livro {
		
		private String titulo;
		private String autor;
		private double preco;
		
		public Livro(String titulo, String autor) {
			super();
			this.titulo = titulo;
			this.autor = autor;
		}
		

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

}
