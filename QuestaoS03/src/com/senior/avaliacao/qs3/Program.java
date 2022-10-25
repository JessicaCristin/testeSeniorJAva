package com.senior.avaliacao.qs3;

public class Program {

	public static void main(String[] args) {
		ValidaProtocolo validaProtocolo = new ValidaProtocolo();
		
		boolean resultado = validaProtocolo.validaProtocolo("040674-00");
		
		if(resultado) {
			System.out.println("Valido");
		}else {
			System.out.println("invalido");
		}
	}

}
