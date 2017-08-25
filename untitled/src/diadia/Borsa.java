package diadia;

import java.util.Arrays;

public class Borsa {

	private Strumento[] contenuto;
	private int maxNumStrumenti = 20;
	
	public Borsa(){
		this.contenuto = new Strumento[this.maxNumStrumenti];
	}
	
	public boolean aggiungi(Strumento strumento){
		//scorrere il contenuto fino a trovare un elemento null e sostituirlo con il tuo strumento
		for(int i = 0; i < this.contenuto.length; i++){
			if (this.contenuto[i] == null){
				this.contenuto[i] = strumento;
				//System.out.println(strumento + " AGGIUNTO");
				return true;
			}	
		} 
		return false;
		
		
	}
	//gestione delle eccezioni
	public boolean rimuovi(Strumento strumento){
		for(int i = 0; i < this.contenuto.length; i++){
			//if elemento != null
			if(strumento.equals(this.contenuto[i])){
				this.contenuto[i] = null;
				System.out.println(strumento + " RIMOSSO");
				return true;
				//fallisce quando non viene trovato l'elemento da rimuovere
			}
			
		}
		return false;
	}

	@Override
	public String toString() {
		return "Borsa [contenuto=" + Arrays.toString(contenuto) + "]";
	}
	

}
