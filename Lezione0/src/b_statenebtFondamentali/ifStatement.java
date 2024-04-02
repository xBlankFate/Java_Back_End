package b_statenebtFondamentali;

public class ifStatement {

	public static void main(String[] args) {
	//soglia di superamento è 20	
	int punteggio=26;
	int soglia=20;
	
	boolean condizione=(punteggio>=soglia);
	
	//if
	
	if(condizione) {
	System.out.println("bravo hai vinto");
	}
	//la condizione può essere anche valutata direttamente
	if(punteggio>=soglia) {
		System.out.println("bravo");
	}else {
		System.out.println("non hai superato il livello");
	}
	
	/////////gioco
	int punteggioLvl=25;
	int sogliaPuntLvl=20;
	
	int SkillLvl=35;
	int sogliaSkillLvl=30;
	//operatori logici
	
	if((punteggioLvl>=sogliaPuntLvl)&&(SkillLvl>=sogliaSkillLvl)) {
		
		System.out.println("bravo");
		}
	
	//EASY MODE
	if((punteggioLvl>=sogliaPuntLvl)||(SkillLvl>=sogliaSkillLvl)){
		System.out.println("bravo");
		
	}else {
		System.out.println("livello non superato");
	}
	
	}
}
