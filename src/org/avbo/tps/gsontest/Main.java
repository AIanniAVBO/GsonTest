package org.avbo.tps.gsontest;

import java.util.*;

import com.google.gson.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gson gson = new GsonBuilder()
				   .setDateFormat("yyyy MM dd").create();
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2005);
		cal.set(Calendar.MONTH, Calendar.JULY);
		cal.set(Calendar.DAY_OF_MONTH, 16);
		
		Studente prova = new Studente("Steve", "Krimis", 
				55, cal.getTime(), "italiana");
		
		String json = gson.toJson(prova);
		
		System.out.println(json);
		
		
		
		String provaRead = "{\"nome\":\"Matteo\",\"cognome\":\"Kamal\",\"matricola\":212,\"dataDiNascita\":\"2005 10 16\",\"nazionalita\":\"italiana\"}";
		System.out.println(provaRead);
		
		var prova2 = gson.fromJson(provaRead, Studente.class);
		System.out.println(prova2.toString());
	}

}
