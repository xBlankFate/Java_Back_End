package com.crilia.collezioni;

import java.util.HashMap;
import java.util.Set;

public class ProvaMappa {

	public static void main(String[] args) {
		HashMap<String, String [] > regioni = new HashMap<>();
		regioni.put("Piemonte", new String[]{"torino","asti"});
		regioni.put("lombardia", new String[]{"milano","como"});
		regioni.put("Campania", new String[]{"napoli","salerno"});

		// System.out.println(regioni.get("Piemonte"));
		
		for(String citta : regioni.get("Piemonte")) {
			System.out.println(citta);
		}
		Set<String> keySet = regioni.keySet();
	}

}
