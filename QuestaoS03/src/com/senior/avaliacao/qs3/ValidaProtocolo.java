package com.senior.avaliacao.qs3;

import java.util.ArrayList;
import java.util.List;

public class ValidaProtocolo implements IValidaProtocolo {

	@Override
	public boolean validaProtocolo(String protocolo) {
		List<Integer> protocoloEmInt = new ArrayList();
		int tamanhoProtocolo = protocolo.length();
		int digito1Protocolo = Integer.parseInt(protocolo.substring(tamanhoProtocolo - 2, tamanhoProtocolo - 1));
		int digito2Protocolo = Integer.parseInt(protocolo.substring(tamanhoProtocolo - 1));
		int digito1 = 0;
		int digito2 = 0;

		String protocoloSemDigito = retornaProtocoloSemDigito(protocolo);
		String protocoloInvertido = reverse(protocoloSemDigito);
		String protocoloFormatado = formataValor(protocoloInvertido);
		protocoloEmInt = StringParaInt(protocoloFormatado);

		digito1 = RetornaDigito(protocoloEmInt);
		protocoloEmInt.add(0, digito1);
		digito2 = RetornaDigito(protocoloEmInt);

		if ((digito1 == digito1Protocolo) && (digito2== digito2Protocolo)) {
			return true;
		}

		return false;
	}

	public int RetornaDigito(List<Integer> valor) {
		int multiplicador = 2;
		int resultado = 0;

		for (int i = 0; i < valor.size(); i++) {
			resultado += multiplicador * valor.get(i);
			multiplicador++;
		}

		return (resultado * 10) % 11;
	}

	public String retornaProtocoloSemDigito(String protocolo) {
		String novoProtocolo = "";
		int tamanhoProtocolo = protocolo.length();

		novoProtocolo += protocolo.substring(0, tamanhoProtocolo - 2);

		return novoProtocolo;
	}

	public String reverse(String original) {
		String reversed = "";
		for (int i = original.length() - 1; 0 <= i; i--) {
			reversed += original.charAt(i);
		}

		return reversed;
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
