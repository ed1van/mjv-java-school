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
	{ //um m�todo construtor pode chamar outro m�todo construtor
		// a sequencia de informa��o deve ser correta
		this(nome, cpf, "N�o informado"); 
	
	}
	//todo construtor come�a com o nome da classe
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
