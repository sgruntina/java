package diadia;

import java.util.HashMap;
import java.util.Map;

public class Stanza {
	private Map<String, Stanza> connessioni;

	public Stanza(){
		this.connessioni = new HashMap<>();
		}
	public void aggiungiConnessione(String direzione, Stanza stanza){
		//salvare nella Map la relazioni fra questa coppia
		this.connessioni.put(direzione, stanza);
		switch (direzione) {
		case "nord":
			if(stanza.ottieniStanzaAdiacente("sud") == null)
				stanza.aggiungiConnessione("sud", this);
			break;
		case "est":
			if(stanza.ottieniStanzaAdiacente("ovest") == null)
				stanza.aggiungiConnessione("ovest", this);
			break;
		case "sud":
			if(stanza.ottieniStanzaAdiacente("nord") == null)
				stanza.aggiungiConnessione("nord", this);
			break;
		case "ovest":
			if(stanza.ottieniStanzaAdiacente("est") == null)
				stanza.aggiungiConnessione("est", this);
			break;

		default:
			break;
		}
	}

	public Stanza ottieniStanzaAdiacente(String direzione){
		return this.connessioni.get(direzione);
		//perchè direzione è dello stesso tipo e perchè effettivamente il parametro direzione può contenere una stringa all'interno della mappa.
	}
	
	
	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((connessioni == null) ? 0 : connessioni.hashCode());
		return result;
	}
	*/
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Stanza)) {
			return false;
		}
		Stanza other = (Stanza) obj;
		if (connessioni == null) {
			if (other.connessioni != null) {
				return false;
			}
		} else if (!connessioni.equals(other.connessioni)) {
			return false;
		}
		return true;
	}
	
	
	
}

