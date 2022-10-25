package com.senior.avaliacao.qs3;

import java.util.ArrayList;
import java.util.List;

public class ValidaProtocolo implements IValidaProtocolo {

	@Override
	public boolean validaProtocolo(String protocolo) {
		List<Integer> lista = new ArrayList<>();
		lista = StringParaInt(formataValor(protocolo));
		int tamanhoArray = lista.size();
		int multiplicador = 2;
		int multiplicando = 0;
		int somatoriaDosNumeros = 0;
		int digito1 = 0;
		int digito2 = 0;

		for (int i = 0; i < lista.size(); i++) {
			multiplicando = lista.get(i);
			somatoriaDosNumeros += (multiplicador * multiplicando);
			multiplicador++;
		}

		digito1 = somatoriaDosNumeros / 11;
		digito2 = (somatoriaDosNumeros + digito1) / 11;

		if (digito1 == 10) {
			digito1 = 0;
		}
		if (digito2 == 10) {
			digito2 = 0;
		}

		if ((digito1 == lista.get(tamanhoArray -2)) && (digito1 == lista.get(tamanhoArray -1))) {
			return true;
		}

		return false;
	}

	public String formataValor(String valor) {
		String valorFormatado = "";

		for (int i = 0; i < valor.length(); i++) {
			if ((valor.charAt(i) != '.') && (valor.charAt(i) != ' ') && (valor.charAt(i) != '-')) {
				valorFormatado += valor.substring(i, i + 1);
			}
		}
		return valorFormatado;
	}

	public List<Integer> StringParaInt(String valor) {
		int valores = 0;
		List<Integer> arrayInteiros = new ArrayList<>();
		for (int i = 0; i < valor.length(); i++) {
			valores = Integer.parseInt(valor.substring(i, i + 1));
			arrayInteiros.add(valores);
		}
		return arrayInteiros;
	}

}
