package com.senior.avaliacao.qs2;

public class Maiusculo implements IMaiusculo {

	@Override
	public String converteMaiusculo(String par) {
		String primeiraPalavra = "";
		String demaisPalavras = "";
		String completo = "";
		for (int i = 0; i < par.length(); i++) {
			if ((i == 0) || (par.charAt(i - 1) == ',') || (par.charAt(i - 1) == ' ')) {
				primeiraPalavra = par.substring(i, i + 1).toUpperCase();
			} else {
				demaisPalavras = par.substring(i, i + 1);
			}
			completo += primeiraPalavra + demaisPalavras;
			primeiraPalavra = "";
			demaisPalavras = "";
		}
		return completo;
	}

}
