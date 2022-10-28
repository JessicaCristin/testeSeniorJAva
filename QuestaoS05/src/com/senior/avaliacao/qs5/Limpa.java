package com.senior.avaliacao.qs5;

import java.util.ArrayList;
import java.util.List;

public class Limpa implements ILimpa {

	@Override
	public String limpar(String string, String substring) {
		List<Character> novaString = new ArrayList<>();
		String stringLimpa = "";
		int indexNovaString = 0;
		boolean eSubtring;
		boolean acabouString = false;
		int i = 0;

		while (!acabouString) {
			eSubtring = false;

			for (int j = 0; j < substring.length(); j++) {
				if ((i + j == string.length()) && (string.charAt(i) != substring.charAt(j))) {
					eSubtring = true;
					acabouString = true;
				} else {
					if (string.charAt(i + j) != substring.charAt(j))
						eSubtring = true;
				}
			}

			if (!eSubtring)
				i = i + substring.length();
			else {
				novaString.add(string.charAt(i));
				stringLimpa += novaString.get(indexNovaString).toString();
				indexNovaString++;
				i++;
			}
		}

		return stringLimpa;
	}
}
