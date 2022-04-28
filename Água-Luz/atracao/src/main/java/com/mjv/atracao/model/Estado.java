package com.mjv.atracao.model;

public enum Estado {

	SAO_PAULO ("SP");
	
	
	private String sigla;
	
	private Estado(String sigla)
	{
		this.sigla = sigla;
	}
	
	public String getSigla() {
		return sigla;
	}
}
