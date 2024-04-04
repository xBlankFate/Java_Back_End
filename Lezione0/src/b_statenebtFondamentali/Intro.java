package b_statenebtFondamentali;

public class Intro {
	
public static void main(String[] args) {
	
	//fintanto che la condizione è valida, tu esegui
	int n=5;
	int numeroGiri=0;
	while(n==5) {
		numeroGiri++;
		System.out.println("giro"+numeroGiri);
		double numCasuale=Math.random();
		
		System.out.println("il numero casuale è "+numCasuale);
		if (numCasuale<0.2) {
			n=7;
			System.out.println("qui termina il while");
		}
	}
		
	int numGiri=0;
	int giriPersi=0;
	while(numGiri<=10) {
		double numRand=Math.random();
		if(numRand<0.2) {
			giriPersi++;
			System.out.println("hai perso questo giro");
			numGiri=11;
		}
		System.out.println(Math.random());
		numGiri++;
	} 
	
	
}
}
