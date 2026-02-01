package com.loiane.java_basico.aula51.labs;

public class Player {

	public void tocarMusica(User user, Musica musica) throws AcessoNegadoException {
		if(musica.isExplicit() && user.getIdade() < 18) {
			throw new AcessoNegadoException("Usuário " + user.getNome() + " não tem idade pra isso.");
		}
		System.out.println("NOW PLAYING: " + musica.getTitulo());
	}
	
}
