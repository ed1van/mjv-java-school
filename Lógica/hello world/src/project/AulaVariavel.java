package project;

public class AulaVariavel {

	
	static int nu;
	
	public static void main(String[] args) {
		
		String name = " ed ";
		String sobrenome = "ferreira";
	
		//classes primitivas
		int number;
		long cpf = 2546465488L; //sempre colocar o L no final do n�mero
		double valor;
		boolean aprovado;
		
		String nameCorrigido = name.trim().replaceAll("ed","Edivan").toString();
		
		System.out.println(nameCorrigido);
		//pq variavel local de metodo precisa ser inicializada? //pesquisar
		
	//String formatarCep (long ceps) m�todo
		//replace = substitui a palavra
		//. trim tira espa�os em branco
		//final, ela se torna imut�vel. nao consigo mudar a variavel depois
		//identa��o, serve para o c�digo ficar mais limpo, para ser entendido  Atalho: ctrl+shift+r
		
		//classes wrappers
	}
	
}
