package com.mjv.openbanking;

public class GeradorConteudo {

	
	public String gerar (Movimentacao movimentacao) {
		
		StringBuilder sb = new StringBuilder();
		
		//precisa chamar o toString, para poder usar os métodos String
		//replace == troca;
		sb.append(movimentacao.getData().toString().replace("-",""));
		
		//[\\D]: tudo que não for Digito, remova
		sb.append(String.format("%014d", Long.valueOf(movimentacao.getCpfCnpj().toString().replaceAll("[\\D]",""))));
		
		
		String nome = movimentacao.getNomeCliente();
		
		if(nome.length()>=30) {
		//.substring(0, 30)): Limita um valor de caracter, retirando de tras para frente.
		sb.append(nome.substring(0, 30));
		}
		else {
			
			sb.append(String.format("%-30s", nome));
		}
		
		//append retorna o proprio objeto
		sb.append(String.format("%010d", Long.valueOf(movimentacao.getValor().toString().replaceAll("\\D", ""))) );
		//sb.append(movimentacao.getValor());
		
		//
		sb.append(movimentacao.getTipo().getSigla());
		
		//
		if(movimentacao.getEstornada())
		{
			sb.append("1");
		}else {
			sb.append("0");
		}
		
		
		return sb.toString();
	}
} //encadeamento de método: quando um método chama outro método, até dar o resultado esperado
