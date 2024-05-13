package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import db.CanzoneDAO;
import db.CanzoniDAOImpl;
import model.canzone;

public class ProvaScritturaDB {

	public static void main(String[] args) {
		
		CanzoneDAO dao = new CanzoniDAOImpl();
		
		File f = new File("Z:\\canzoni.txt");
		
		try {
			Scanner input = new Scanner(f);
				while(input.hasNextLine()) {
				
					String riga = input.nextLine();
					String[] split = riga.split(";");
					dao.addCanzone(new canzone(split[0],split[1]));	
				}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		//canzone c = new canzone("sinceramente","annalisa");
		//canzone c2 = new canzone("bum bum","rose villain");
		
		//dao.addCanzone(c);
		//dao.addCanzone(c2);
		
		List<canzone> canzoni = dao.getCanzoni();
		
		for (canzone canzone : canzoni) {
			System.out.println(canzone);
		}
	
		
		

	}
}