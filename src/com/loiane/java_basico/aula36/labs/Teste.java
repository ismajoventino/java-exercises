package com.loiane.java_basico.aula36.labs;

import java.util.Scanner;

import com.loiane.java_basico.aula36.Telefone;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da agenda: ");
		String nomeAgenda = scan.nextLine();
		
		Agenda agenda1 = new Agenda(nomeAgenda);
		
		Contato[] contatos = new Contato[3];
		
		for (int i = 0; i < contatos.length; i++) {
			System.out.println("Adicionando infos do contato " + (i + 1));
			Contato c = new Contato();
			
			System.out.println("Nome: ");
			c.setNome(scan.nextLine());
			System.out.println("Telefone: ");
			c.setTelefone(scan.nextLine());
			System.out.println("Email: ");
			c.setEmail(scan.nextLine());
			
			contatos[i] = c;
		}
		
		agenda1.setContato(contatos);
		
		agenda1.obterInfo();
		
	}

}
