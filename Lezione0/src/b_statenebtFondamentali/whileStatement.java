package b_statenebtFondamentali;

public class whileStatement {
	
public static void main(String[] args) {
	
	//fintanto che la condizione è valida, tu esegui
	int n=5;
	int numeroGiri=0;
	while(n==5) {
		numeroGiri++;
		System.out.println("giro");
		double numCasuale=Math.random();
		
		System.out.println("il numero casuale è "+numCasuale+" "+numeroGiri);
		if (numCasuale<0.2) {
			n=7;
			System.out.println("qui termina il while");
		}
	}
		
	
	
	
}
}
