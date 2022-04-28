package com.mjv.notificacao.app;

import java.time.LocalDateTime;

import com.mjv.notificacao.model.Cadastro;
import com.mjv.notificacao.model.Contrato;
import com.mjv.notificacao.model.Endereco;
import com.mjv.notificacao.service.GeradorMensagem;


public class SistemaAguaLuzNotification {

	public static void main(String[] args) {
		
		Contrato contrato = new Contrato();
		
		contrato.setDataHora(LocalDateTime.of(2022, 2, 21, 16, 0));
		contrato.setProtocolo(2022025687L);
		contrato.setTipoServico("Água");
		contrato.setValor(127.33);
		
		Cadastro cliente = new Cadastro();
		contrato.setCliente(cliente); //nao esquecer de a classe cliente
		
		cliente.setCpf("23476598727");
		cliente.setNome("Gleyson Sampaio");
		
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);
		
		endereco.setBairro("Santo Antonio");
		endereco.setCep("27310657");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		endereco.setLogradouro("Rua das Marias");
		endereco.setNumero("243");
		endereco.setComplemento("Bloco C");
		
		GeradorMensagem gm = new GeradorMensagem();
		
		gm.gerar(contrato);

		

	}

}
