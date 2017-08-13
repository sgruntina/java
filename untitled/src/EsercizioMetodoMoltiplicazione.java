
public class EsercizioMetodoMoltiplicazione {

	public static void main(String[] args) {
		System.out.println(moltiplicazione(8, 9));
		

	}
	// quando si crea un metodo, bisogna prima di tutto inserire i modificatori,
	//tipo public static ecc, poi definire il metodo, nella fattispecie moltiplicazione,
	// poi mettere le tonde  perchè dentro ci vanno i parametri formali del metodo
	//
	public static int moltiplicazione(int a, int b) {
	//i parametri formali si distanziano con la virgola
		//devo dire cosa fanno questi due parametri
		//int risultato = (a * b);
		//risultato = (a * b);
		return a * b;
		//il return è un comando che termina il metodo e deve stare nel blocco del metodo.
		
		
	}
	//per renderlo più elegante:
	//il return prevede un ritorno dello stesso tipo di quello dichiarato nel metodo
	//posso ritornare direttamente il valore:  facendo direttamente return a * b
	// perchè io il valore astratto l'ho già dichiarato sopra quindi lo riconosce.
	// in questo caso, poichè semplice, non serve passare per un'altra variabile, quella intermedia.
	

}
