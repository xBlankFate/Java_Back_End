package input2;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
	
	    Scanner mario= new Scanner(System.in);
	    System.out.println("come ti chiami?");
	    
	    String nome=mario.nextLine();
	    System.out.println("ti chiami "+nome);
	    
	    System.out.println("quanti anni hai?");
	    int eta=mario.nextInt();
	    mario.nextLine();
	    System.out.println("hai "+eta+" anni");
	    
	    System.out.println("colore preferito?");
	    String colore=mario.nextLine();
	    
	    System.out.println("il tuo colore preferito è "+colore);
	    
	}

}
