package com.mjv.atracao.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatadorUtil {
	//%s ou %d sao porcentagens que podem substiruir parametros
	public static String formatarCpf(String cpf)
	{
		String part1 = cpf.substring(0,3);
		String part2 = cpf.substring(3,6);
		String part3 = cpf.substring(6,9);
		String part4 = cpf.substring(9,11);
		//da para fazer assim
		//cadda %s, representa um parametro... está na ordem
		String cpfFormatador=String.format("%s.%s.%s-%s", part1, part2, part3, part4);
		//ou assim
//		String cpfFormatador = part1.concat(".")+part2.concat(".")
//		+part3.concat(".")+part4.concat("-");
		
		return cpfFormatador;
	}
	
	public static String formatarDataHora(LocalDateTime dataHora)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataFormatada = dataHora.format(formatter);

        return dataFormatada;
	}
	
	public static String formatarCep(String cep)
	{
		String part1 = cep.substring(0,2);
		String part2 = cep.substring(2,5);
		String part3 = cep.substring(5,8);
	
		
		//cada %s, representa um parametro... está na ordem
		String cepFormatador=String.format("%s.%s-%s", part1, part2,part3);

		
		return cepFormatador;
	}
}
