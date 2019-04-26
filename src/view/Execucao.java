package view;

import model.Pessoa;

public class Execucao {
	public static void main(String[] args) {
		// TODO Auto-generated method sub
		Pessoa pessoa = new Pessoa ();
		pessoa.setNome("Guilherme Barros");
		System.out.println(pessoa.getNome());
		
		pessoa.setEndereco("Rua Pierre Varney");
		System.out.println(pessoa.getEndereco());
		
		pessoa.setBairro("Itaim Paulista");
		System.out.println(pessoa.getBairro());
		
		pessoa.setCEP(18121650);
		System.out.println(pessoa.getCEP());
		
		pessoa.setCidade("São Paulo");
		System.out.println(pessoa.getCidade());
		
		pessoa.setEstado("SP");
		System.out.println(pessoa.getEstado());
		
	}

}
