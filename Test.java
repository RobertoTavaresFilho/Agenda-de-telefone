package aula36;

public class Test {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Tyrion");
		//contato.setEndereco(" Kings landing");
		//contato.setTelefone("11 99999-9999");
		
		//relacionamento tem-um endereco.
		Endereco end = new Endereco();
		end.setNomeRua("Rua GOT");
		end.setNumero("N/A");
		end.setComplemento(" - ");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setCep("9999999");
		
		//relacionamento tem-um telefone.
		Telefone tel = new Telefone();
		tel.setNumero(" 99999-9999");
		tel.setDdd("11");
		tel.setTipo("celular ");
		
		Telefone tel2 = new Telefone();
		tel2.setNumero("88888-8888");
		tel2.setDdd("11");
		tel2.setTipo("casa ");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0]= tel;
		telefones[1]=tel2;
		
		contato.setTelefones(telefones);
		
		
		//contato.setTelefone(tel);
		contato.setEndereco(end);
		//test saída no console
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
		
		 //verificar para deixar o codigo seguro. mt importante.
		if(contato != null && contato.getEndereco() != null ) {  
			System.out.println(contato.getEndereco().getCidade());
		}
		//foi mudado
		/*if(contato !=null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " "+ contato.getTelefone().getNumero());
		}*/
		
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd()+" "+t.getNumero());
			}
		}
		
		
		
	}

}
