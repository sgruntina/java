
public class MoltiplicazionePerSommeSuccessive {

	public static void main(String[] args) {
	// per somme successive vuol dire che tu sommi progressivamente
	// es. 5 * 2 = 5 + 5
	//es. 5 *4 = 5 + 5 + 5 + 5
		System.out.println(sommeSuccessive(4, 3));

	}
	
	public static int sommeSuccessive (int a, int b){
		int risultato = 0;
		for(;risultato < a * b;){
		risultato = risultato + a;
			//quei cazzo di arancioni non assumono valori, quello a sinistra NON VALE UN CAZZO!!!
		}
		
		return risultato;
	}
	
	

}
