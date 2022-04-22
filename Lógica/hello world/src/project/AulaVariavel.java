package project;

public class AulaVariavel {

	
	static int nu;
	
	public static void main(String[] args) {
		
		String name = " ed ";
		String sobrenome = "ferreira";
	
		//classes primitivas
		int number;
		long cpf = 2546465488L; //sempre colocar o L no final do número
		double valor;
		boolean aprovado;
		
		String nameCorrigido = name.trim().replaceAll("ed","Edivan").toString();
		
		System.out.println(nameCorrigido);
		//pq variavel local de metodo precisa ser inicializada? //pesquisar
		
	//String formatarCep (long ceps) método
		//replace = substitui a palavra
		//. trim tira espaços em branco
		//final, ela se torna imutável. nao consigo mudar a variavel depois
		//identação, serve para o código ficar mais limpo, para ser entendido  Atalho: ctrl+shift+r
		
		//classes wrappers
	}
	
}
