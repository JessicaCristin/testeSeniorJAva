package com.senior.avaliacao.qs1;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal implements INotaFiscal {

	@Override
	public List<Double> geraParcelas(int nrParcelas, double valorTotal) {
		List<Double> listaParcelas = new ArrayList<>();
		double valorParcela = 0;
		double somaTotal = 0;
		double valorParcelaFormatado = 0;
		double valorCorrigidoParcela = 0;
		int i = 0;

		valorParcela = valorTotal / nrParcelas;

		valorParcelaFormatado = formataValor(valorParcela);

		for (; i < nrParcelas; i++) {
			listaParcelas.add(valorParcelaFormatado);
			somaTotal += valorParcelaFormatado;
		}

		valorCorrigidoParcela = (valorTotal - somaTotal) + valorParcela;

		listaParcelas.set(i - 1, formataValor(valorCorrigidoParcela));

		return listaParcelas;
	}

	public double formataValor(double valor) {
		double valorFormatado = Math.round(valor * 100) / 100.0;
		return valorFormatado;
	}

}
