package classes.objetos;

public class Pessoa {

	String nome;
	String cpf;
	String telefone;
	
	
	/*
	 * contutor define que devemos colocar parametros
	 * desse modo, ele nao ira me trazer um null
	 */
	Pessoa (String nome, String cpf, String telefone)
	{ //this. = recebe o atributo
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	//o construtor pode ser sobrecarregado
	Pessoa (String nome, String cpf)
	{ //um método construtor pode chamar outro método construtor
		// a sequencia de informação deve ser correta
		this(nome, cpf, "Não informado"); 
	
	}
	//todo construtor começa com o nome da classe
	Pessoa ()
	{//construtor sem parametro
		
	}

	//gets e sets
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
