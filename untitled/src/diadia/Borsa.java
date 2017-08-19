package diadia;

public class Borsa {

	private Strumento[] contenuto;
	private int maxNumStrumenti = 20;
	
	public Borsa(){
		this.contenuto = new Strumento[this.maxNumStrumenti];
	}
	
	public boolean aggiungi(Strumento strumento){
		//scorrere il contenuto fino a trovare un elemento null e sostituirlo con il tuo strumento
		for(Strumento slot : this.contenuto){
			if (slot == null){
				slot = strumento;
				System.out.println(strumento + " AGGIUNTO!");
				return true;
			}	
		} 
		return false;
		
		
	}
	
	//public rimuovi{
	

}
