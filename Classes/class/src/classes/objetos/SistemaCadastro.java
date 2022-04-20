package classes.objetos;

public class SistemaCadastro {

	public static void main(String[] args) {

		
		Pessoa pessoa = new Pessoa("Ed","224456664645");
		
		
		System.out.println(pessoa.nome);
		System.out.println(pessoa.cpf);
		System.out.println(pessoa.telefone);
		
		
		
		Pessoa pessoa1 = new Pessoa("Maria","2457464645");
		

		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.cpf);

	}

}
