package c_contoCorrente;

public class Main {

	public static void main(String[] args) {
		
		//Creare un conto
		Conto conto1=new Conto();
		
		conto1.setIntestatario("Enrico Momo");
		conto1.setNumeroConto(0);//Da rendere automatico
		conto1.setPinCarta("25478");
		
		System.out.println("Adesso puoi depositare i primi denari");
		conto1.deposita("25478", 1000);
		
		System.out.println("Sul tuo conto ci sono: "+conto1.getSaldo());
		
		//conto1.preleva("25478", 200);
		System.out.println(conto1.preleva("25478", 200)+" Sul tuo conto ci sono: "+conto1.getSaldo());
		
		
		
	}

}
