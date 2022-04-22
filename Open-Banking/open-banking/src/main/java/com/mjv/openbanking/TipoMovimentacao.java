package com.mjv.openbanking;


//trocar class por enum
//enum: objetos pré-definidos ex: receita e despesa
//enum é imutável
public enum TipoMovimentacao {
	RECEITA ("R"),
	DESPESA ("D");
	
	private String sigla; //Para colocar sigla na receita e despesa

	
	private TipoMovimentacao(String sigla)
	{
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}


	
	
	

}
