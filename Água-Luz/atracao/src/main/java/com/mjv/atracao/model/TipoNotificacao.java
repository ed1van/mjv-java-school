package com.mjv.atracao.model;

public enum TipoNotificacao {
	
	SMS("S"),
	WHATSAPP("W");
	
	private String sigla;
	
	private TipoNotificacao(String sigla)
	{
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}

}
