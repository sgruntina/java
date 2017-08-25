package diadia;

import java.util.HashSet;
import java.util.Set;

public class Labirintite {
	private Set<Stanza> stanze;
	
	public Labirintite(){
		this.stanze = new HashSet<>();
		creaLabirinto();
	}
	
	public void creaLabirinto(){
		Stanza stanza0 = new Stanza();
		Stanza stanza1 = new Stanza();
		Stanza stanza2 = new Stanza();
		Stanza stanza3 = new Stanza();
		Stanza stanza4 = new Stanza();
		stanza2.aggiungiConnessione("nord", stanza1);
		stanza2.aggiungiConnessione("sud", stanza0);
		stanza2.aggiungiConnessione("est", stanza3);
		stanza2.aggiungiConnessione("ovest", stanza4);
		stanze.add(stanza0);
		stanze.add(stanza1);
		stanze.add(stanza2);
		stanze.add(stanza3);
		stanze.add(stanza4);	
	}

}
