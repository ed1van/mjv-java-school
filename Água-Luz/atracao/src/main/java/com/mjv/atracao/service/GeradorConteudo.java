package com.mjv.atracao.service;

import com.mjv.atracao.model.Cadastro;
import com.mjv.atracao.model.Contrato;

public class GeradorConteudo {

	public String gerar(Contrato contrato) {
		StringBuilder sb = new StringBuilder();
	
		sb.append(contrato.getCliente().getCpf().toString().replace(".", ""));
		sb.append(String.format("%11s",contrato.getCliente().getRg()));
		String nome = contrato.getCliente().getNome();
		if(nome.length()>=30) {
		
		sb.append(nome.substring(0, 30).toUpperCase());
		}
		else {
			
			sb.append(String.format("%-30s", nome));
		}
		
		sb.append(contrato.getCliente().getCelular().replaceAll("\\D", ""));

		
		String logradouro = contrato.getCliente().getEndereco().getLogradouro();
		if(logradouro.length()>=20) {
		
		sb.append(logradouro.substring(0, 20).toUpperCase());
		}
		else {
			
			sb.append(String.format("%-20s", logradouro));
		}
		
		
		sb.append (String.format("%06d",Long.valueOf(contrato.getCliente().getEndereco().getNumero())));
		
		String complemento = contrato.getCliente().getEndereco().getComplemento();
		
		if(complemento.length()>=10) {
		
		sb.append(complemento.substring(0, 10));
		}
		else {
			
			sb.append(String.format("%-10s", complemento));
		}
		
		sb.append(contrato.getCliente().getEndereco().getBairro().toUpperCase());
		sb.append(contrato.getCliente().getEndereco().getCidade().toUpperCase());//if else
		sb.append(contrato.getCliente().getEndereco().getEstado().getSigla());
		sb.append(contrato.getCliente().getEndereco().getCep().toString().replaceAll("\\D",""));
		sb.append(contrato.getCliente().getPais().getSigla());
		sb.append(String.format("%010d",Long.valueOf( contrato.getProtocolo())));
		sb.append(contrato.getDataHora().toString().replaceAll("\\D",""));
		sb.append(contrato.getTipoServico().getSigla());
//	sb.append(String.format("%08d", Double.valueOf(contrato.getTipoServico().getValor())));
	//	sb.append(contrato.getNotificacao().getSigla());
		

		return sb.toString();

	}

}
