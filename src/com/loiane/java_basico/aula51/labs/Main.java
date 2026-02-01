package com.loiane.java_basico.aula51.labs;

public class Main {

	public static void main(String[] args) {
		
		//Musica musica1 = new Musica("Heaven", 3, "heaven.mp3", false);
		
		/*try {
			System.out.println("Tentando criar minha musica");
			Musica musica2 = new Musica("Easier On Your Own", 2, "", false);
			System.out.println("Musica criada!");
		}
		catch (IllegalArgumentException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
		catch (ArquivoCorrompidoException e) {
			System.out.println("ERRO: " + e.getMessage());
		}*/
		
		Player player = new Player();
		
		User usuar1 = new User("ismael alves", 17, true);
		
		Musica musica1 = new Musica("Proibidão", 14, "proibidao.mp3", true);
		
		try {
			System.out.println("Tentanto tocar a música...");
			player.tocarMusica(usuar1, musica1);
			System.out.println("Musica terminou");
		}
		catch (AcessoNegadoException e) {
			System.out.println("ERRO DE REPRODUÇÃO: " + e.getMessage());
		}
		
	}
}
