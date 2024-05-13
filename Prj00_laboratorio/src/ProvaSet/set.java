package ProvaSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.crilia.model.libro;

public class set {

	public static void main(String[] args) {
		//Set<String> nomi = new HashSet<>(); //non mi mostra i doppi ed è random
		Set<String> nomi = new TreeSet<>();//non mi mostra i doppi ed è in ordine
		
		nomi.add("mattias");
		nomi.add("marco");
		nomi.add("denis");
		nomi.add("marco");
		nomi.add("raffaele");
		nomi.add("simone");
		nomi.add("enrico");
		nomi.add("giada");
		nomi.add("erika");
		nomi.add("abdel");
		nomi.add("davide");

		for (String string : nomi) {
			System.out.println(string);
		}
		
		libro l1 = new libro("zanna bianca", 100,10); 
		libro l2 = new libro("manitu", 120,12); 
		libro l3 = new libro("alba chiara", 140,8);
		
		Set<libro> libreria = new TreeSet<>();
		libreria.add(l1);
		libreria.add(l2);
		libreria.add(l3);
		
		for (libro libro : libreria) {
			
			System.out.println(libro);
			
		}
	}

}
