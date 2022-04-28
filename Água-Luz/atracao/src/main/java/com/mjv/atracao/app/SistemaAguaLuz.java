package com.mjv.atracao.app;


import java.time.LocalDateTime;

import com.mjv.atracao.model.Cadastro;
import com.mjv.atracao.model.Contrato;
import com.mjv.atracao.model.Endereco;
import com.mjv.atracao.model.Estado;
import com.mjv.atracao.model.Pais;
import com.mjv.atracao.model.Servico;
import com.mjv.atracao.model.TipoNotificacao;
import com.mjv.atracao.service.GeradorConteudo;

public class SistemaAguaLuz {

	public static void main(String[] args) {
		
		Contrato contrato = new Contrato();
		contrato.setDataHora(LocalDateTime.of(2022, 5, 7, 15, 21));
		contrato.setProtocolo("1984365");
		contrato.setTipoServico(Servico.AGUA);
		
		Cadastro cliente = new Cadastro();
		contrato.setCliente(cliente);
		cliente.setCelular("(11) 99768-1515");
		cliente.setCpf("007.324.223.21");
		cliente.setNome("Raimundo Nonato Loureiro Castelo Branco");
		cliente.setRg("33765-5");
		cliente.setPais(Pais.BRASIL);
		
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);
		
		endereco.setBairro("São Sebastião");
		endereco.setCep("07.210.715");
		endereco.setCidade("São Raimundo Nonato");
		endereco.setEstado(Estado.SAO_PAULO);
		endereco.setLogradouro("Rua Sebastião Firmino");
		endereco.setNumero("123");
		endereco.setComplemento("AP 210 BL CENTAURO");
		
		GeradorConteudo gc = new GeradorConteudo();
		
		String geradorConteudo = gc.gerar(contrato);
		System.out.println(geradorConteudo);

	}

}
