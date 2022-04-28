package com.mjv.atracao.model;

public enum Servico {

	AGUA("Água","A", 137.20),
	LUZ("Energia","L", 132.15);

	private String descricao;
	private String sigla;
	private double valor;

	private Servico( String descricao,String sigla, double valor) {
		this.descricao = descricao;
		
		this.sigla = sigla;

		this.valor = valor;
	}
	
	public String getDescircao() {
		return descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public double getValor() {
		return valor;
	}

}
