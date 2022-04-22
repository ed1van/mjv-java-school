package com.mjv.openbanking;

import java.time.LocalDate;


public class SistemaGeradorMovimentacao {
	
	public static void main(String[] args) {
		Movimentacao mov = new Movimentacao();
		mov.setData(LocalDate.of(2022, 4, 16)); //of para definir a data | now para trazer a data de agora
		mov.setCpfCnpj("135.217.791-18");
		mov.setNomeCliente("RAIMUNDO NONATO LOUREIRO CASTELO BRANCO");
		mov.setValor(1275.48);  //BigDecimal precisa colocar o new, pq é uma class
		mov.setTipo(TipoMovimentacao.RECEITA);
		mov.setEstornada(Boolean.TRUE);
		
		
	//	System.out.println(mov.getData()+mov.getCpfCnpj()+mov.getNomeCliente()+mov.getValor()
	//	+mov.getTipo());
		
		
		//System.out.println(mov.toString());
		
		GeradorConteudo gc = new GeradorConteudo();
		
		String conteudoGerado = gc.gerar(mov);
		

		GeradorArquivo ga = new GeradorArquivo();
		
		ga.escreva(conteudoGerado);
		
		
		
		
	}

}
