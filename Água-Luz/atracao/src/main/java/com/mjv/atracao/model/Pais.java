package com.mjv.atracao.model;

public enum Pais {
	BRASIL("BR"),
	Franca("FRA");
	
	private String sigla;
	
	private Pais(String sigla)
	{
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}

}
