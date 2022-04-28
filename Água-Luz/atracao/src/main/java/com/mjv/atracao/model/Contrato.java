package com.mjv.atracao.model;

import java.time.LocalDateTime;

public class Contrato {

	private String protocolo;
	private double valor;
	private LocalDateTime dataHora;
	private Servico tipoServico;
	private Cadastro cliente;
	private TipoNotificacao notificacao;
	
	public String getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public Servico getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(Servico tipoServico) {
		this.tipoServico = tipoServico;
	}
	public Cadastro getCliente() {
		return cliente;
	}
	public void setCliente(Cadastro cliente) {
		this.cliente = cliente;
	}
	public TipoNotificacao getNotificacao() {
		return notificacao;
	}
	public void setNotificacao(TipoNotificacao notificacao) {
		this.notificacao = notificacao;
	}

	

	
	
	
}
