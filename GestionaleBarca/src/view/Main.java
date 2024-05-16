package view;

import java.io.ObjectInputStream.GetField;
import java.util.List;

import com.crilia.barche.Barca;
import com.crilia.barche.Pedalo;
import com.crilia.barche.Vela;

import db.Connessione;

public class Main {

	public static void main(String[] args) {

		Connessione c = new Connessione();
		c.getConn();
		
		Pedalo p1 = new Pedalo("Re delle acquette","Delfino marino", 5,20);
		Pedalo p2 = new Pedalo("Re delle acquette","Delfino marino", 5,20);
		Vela v1 = new Vela("Il velo","Il velo di poseidone",10,35);
		Vela v2 = new Vela("Il velo","Il velo di poseidone",10,35);
	}

}
