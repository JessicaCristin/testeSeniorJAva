package com.senior.avaliacao.qs6;

import java.util.ArrayList;
import java.util.List;

public class Substitui implements ISubstitui {

	@Override
	public String substituir(String string, String velho, String novo) {
		List<Character> novaString = new ArrayList<>();
		String stringLimpa = "";
		int indexNovaString = 0;
		boolean eSubtring;
		boolean acabouString = false;
		int i = 0;

		while (!acabouString) {
			eSubtring = false;

			for (int j = 0; j < velho.length(); j++) {
				if ((i + j == string.length()) && (string.charAt(i) != velho.charAt(j))) {
					eSubtring = true;
					acabouString = true;
				} else {
					if (string.charAt(i + j) != velho.charAt(j))
						eSubtring = true;
				}
			}

			if (!eSubtring) {
				stringLimpa += novo;
				i = i + velho.length();
			} else {
				novaString.add(string.charAt(i));
				stringLimpa += novaString.get(indexNovaString).toString();
				indexNovaString++;
				i++;
			}
		}

		return stringLimpa;
	}

}
