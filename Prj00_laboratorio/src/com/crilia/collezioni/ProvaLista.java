package com.crilia.collezioni;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProvaLista {

	public static void main(String[] args) {
		String[] naniArr = { 
				"pisolo",
				"gongolo",
				"mammolo",
				"brontolo",
				"eolo",
				"dotto",
				"cucciolo"	
		};
		List<String> nani = new LinkedList<String>();
	
		for(String nano : naniArr) {
			nani.add(nano);
		}
		for(String nano : nani) {
			System.out.println(nano);
		}
	
	
	}

}
