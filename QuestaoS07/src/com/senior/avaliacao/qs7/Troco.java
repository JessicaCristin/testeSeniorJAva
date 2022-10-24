package com.senior.avaliacao.qs7;

public class Troco {
	public enum ECedula {
		NOTA100(100), NOTA50(50), NOTA20(20), NOTA10(10), NOTA5(5), NOTA2(2), MOEDA100(
				1), MOEDA50(0.5), MOEDA25(0.25), MOEDA10(0.1), MOEDA5(0.05), MOEDA1(
				0.01);
		ECedula(double valor) {
			this.valor = valor;
		}
		private double valor;
		public double getValor() {
			return valor;
		}
	}

	private ECedula tipo;
	private int quantidade;

	public void adicionaQuantidade(int qtde) {
		quantidade += qtde;
	}

	public Troco(ECedula tipo, int quantidade) {
		super();
		this.tipo = tipo;
		this.quantidade = quantidade;
	}

	public ECedula getTipo() {
		return tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		return quantidade + " - " + tipo;
	}
}
