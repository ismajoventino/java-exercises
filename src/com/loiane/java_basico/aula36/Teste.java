package com.loiane.java_basico.aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("Tyrion");
		//contato.setEndereco("Kings Landing");
		
		//relacionamento endereço
		Endereco end = new Endereco();
		
		end.setNomeRua("Rua Game of Thrones");
		end.setNumero("n/a");
		end.setComplemento(null);
		end.setCidade("Socorro");
		end.setEstado("São Paulo");
		end.setCep("13960000");
		
		contato.setEndereco(end);
		
		//crelacionamento telefone
		Telefone tel = new Telefone();
		
		tel.setTipo("celular");
		tel.setDdd("11");
		tel.setNumero("9999-9999");
		
		Telefone tel2 = new Telefone();
		
		tel2.setTipo("casa");
		tel2.setDdd("11");
		tel2.setNumero("8888-88888");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;

		//contato.setTelefone(tel);
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
		

	}

}
