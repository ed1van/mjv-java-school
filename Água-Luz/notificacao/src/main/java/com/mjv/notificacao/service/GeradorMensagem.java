package com.mjv.notificacao.service;

import com.mjv.notificacao.model.Cadastro;
import com.mjv.notificacao.model.Contrato;
import com.mjv.notificacao.util.FormatadorUtil;

public class GeradorMensagem {

	public void gerar(Contrato contrato) {
		StringBuilder sb = new StringBuilder();

		Cadastro cliente = contrato.getCliente();
		String cpfFormatado = FormatadorUtil.formatarCpf(cliente.getCpf());
		sb.append(String.format("Senhor(a) %s cpf de número %s, ", cliente.getNome(), cpfFormatado));

		sb.append(String.format("Informamos que conforme contrato com protocolo de número %d ", contrato.getProtocolo()));

		String formatarDataHora = FormatadorUtil.formatarDataHora(contrato.getDataHora());
		sb.append(String.format("\nestá agendado para a data/hora %sh a instalação do serviço de %s  ",
				formatarDataHora, contrato.getTipoServico()));
		
		sb.append(String.format("com taxa de valor R$ %s em sua residência localizada no\nendereço abaixo:\n",
				contrato.getValor()));

		String logadouro = contrato.getCliente().getEndereco().getLogradouro();
		String numero = contrato.getCliente().getEndereco().getNumero();
		sb.append(String.format("•Logradouro: %s, %s\n", logadouro, numero));

		String complemento = contrato.getCliente().getEndereco().getComplemento();
		sb.append(String.format("•Complemento %s\n", complemento));

		String bairro = contrato.getCliente().getEndereco().getBairro();
		sb.append(String.format("•Bairro: %s\n", bairro));

		String cidade = contrato.getCliente().getEndereco().getCidade();
		String estado = contrato.getCliente().getEndereco().getEstado();
		sb.append(String.format("•Cidade: %s / %s\n", cidade, estado));

		String cep = contrato.getCliente().getEndereco().getCep();
		String formatarCep = FormatadorUtil.formatarCep(cep);
		sb.append(String.format("•Cep: %s", formatarCep));

		System.out.println(sb.toString());

	}
}
