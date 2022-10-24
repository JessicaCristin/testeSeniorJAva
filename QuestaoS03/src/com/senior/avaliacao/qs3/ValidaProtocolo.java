package com.senior.avaliacao.qs3;

public class ValidaProtocolo implements IValidaProtocolo {

	@Override
	public boolean validaProtocolo(String protocolo) {
		String novaString = reverse(protocolo);
		System.out.println(formataValor(novaString));
		return false;
	}

	public String reverse(String original) {
		return new StringBuilder(original).reverse().toString();
	}

	public String formataValor(String valor) {
		String valorFormatado = "";
		for (int i = 0; i < valor.length(); i++) {
			if ((valor.charAt(i - 1) == ',') || (valor.charAt(i - 1) == '.') || (valor.charAt(i - 1) == ' ')) {
				valorFormatado += valor.substring(i, i + 1);
			}
		}
		return valorFormatado;
	}
}
