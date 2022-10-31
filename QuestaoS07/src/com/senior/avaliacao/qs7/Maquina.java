package com.senior.avaliacao.qs7;

import java.util.ArrayList;
import java.util.List;

import com.senior.avaliacao.qs7.Troco.ECedula;

public class Maquina implements IMaquina {

	@Override
	public List<Troco> montarTroco(double troco) {
		List<Troco> listaTrocos = new ArrayList();
		troco = troco * 100;
		int r100 = (int) troco / 10000;
		int r50 = (int) (troco % 10000) / 5000;
		int r20 = (int) ((troco % 10000) % 5000) / 2000;
		int r10 = (int) (((troco % 10000) % 5000) % 2000) / 1000;
		int r5 = (int) ((((troco % 10000) % 5000) % 2000) % 1000) / 500;
		int r2 = (int) (((((troco % 10000) % 5000) % 2000) % 1000) % 500) / 200;
		int r1 = (int) ((((((troco % 10000) % 5000) % 2000) % 1000) % 500) % 200) / 100;
		int m050 = (int) (((((((troco % 10000) % 5000) % 2000) % 1000) % 500) % 200) % 100) / 50;
		int m025 = (int) ((((((((troco % 10000) % 5000) % 2000) % 1000) % 500) % 200) % 100) % 50) / 25;
		int m010 = (int) (((((((((troco % 10000) % 5000) % 2000) % 1000) % 500) % 200) % 100) % 50) % 25) / 10;
		int m05 = (int) ((((((((((troco % 10000) % 5000) % 2000) % 1000) % 500) % 200) % 100) % 50) % 25) % 10) / 5;
		int m01 = (int) (((((((((((troco % 10000) % 5000) % 2000) % 1000) % 500) % 200) % 100) % 50) % 25) % 10) % 5)
				/ 1;

		ECedula cedula100 = ECedula.NOTA100;
		ECedula cedula50 = ECedula.NOTA50;
		ECedula cedula20 = ECedula.NOTA20;
		ECedula cedula10 = ECedula.NOTA10;
		ECedula cedula5 = ECedula.NOTA5;
		ECedula cedula2 = ECedula.NOTA2;
		ECedula moeda100 = ECedula.MOEDA100;
		ECedula moeda50 = ECedula.MOEDA50;
		ECedula moeda25 = ECedula.MOEDA25;
		ECedula moeda10 = ECedula.MOEDA10;
		ECedula moeda5 = ECedula.MOEDA5;
		ECedula moeda1 = ECedula.MOEDA1;

		Troco trocoCedula100 = new Troco(cedula100, r100);
		Troco trocoCedula50 = new Troco(cedula50, r50);
		Troco trocoCedula20 = new Troco(cedula20, r20);
		Troco trocoCedula10 = new Troco(cedula10, r10);
		Troco trocoCedula5 = new Troco(cedula5, r5);
		Troco trocoCedula2 = new Troco(cedula2, r2);
		Troco trocoMoeda100 = new Troco(moeda100, r1);
		Troco trocoMoeda50 = new Troco(moeda50, m050);
		Troco trocoMoeda25 = new Troco(moeda25, m025);
		Troco trocoMoeda10 = new Troco(moeda10, m010);
		Troco trocoMoeda5 = new Troco(moeda5, m05);
		Troco trocoMoeda1 = new Troco(moeda1, m01);

		listaTrocos.add(trocoCedula100);
		listaTrocos.add(trocoCedula50);
		listaTrocos.add(trocoCedula20);
		listaTrocos.add(trocoCedula10);
		listaTrocos.add(trocoCedula5);
		listaTrocos.add(trocoCedula2);
		listaTrocos.add(trocoMoeda100);
		listaTrocos.add(trocoMoeda50);
		listaTrocos.add(trocoMoeda25);
		listaTrocos.add(trocoMoeda10);
		listaTrocos.add(trocoMoeda5);
		listaTrocos.add(trocoMoeda1);

		return listaTrocos;
	}
}
