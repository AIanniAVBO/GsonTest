package org.avbo.tps.gsontest;

import java.util.ArrayList;
import java.util.Date;

public class Studente {
	public Studente(String nome, String cognome, int matricola, Date dataDiNascita, String nazionalita) {

		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		this.dataDiNascita = dataDiNascita;
		this.nazionalita = nazionalita;
	}

	public String nome;
	public String cognome;
	public int matricola;
	public Date dataDiNascita;
	public String nazionalita;
	
	public Studente() {};
	
	@Override
	public String toString() {
		var allData = new ArrayList<String>();
		allData.add(matricola + "");
		allData.add(cognome);
		allData.add(nome);
		allData.add(nazionalita);
		allData.add(dataDiNascita.toString());
		return String.join(" ", allData);
	}
}
