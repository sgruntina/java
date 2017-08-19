package diadia;

public class Personaggio {
	
	private String nome;
	private String cognome;
	private Specializzazione spec;
	private String genere;
	private String razza;
	private Borsa borsa;
	
	public Personaggio(String nome, String cognome, Specializzazione spec, String genere, String razza, Borsa borsa) {
		this.nome = nome;
		this.cognome = cognome;
		this.spec = spec;
		this.genere = genere;
		this.razza = razza;
		this.borsa = borsa;
	}
	
	public Personaggio(){}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Specializzazione getSpec() {
		return spec;
	}

	public void setSpec(Specializzazione spec) {
		this.spec = spec;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getRazza() {
		return razza;
	}

	public void setRazza(String razza) {
		this.razza = razza;
	}

	public Borsa getBorsa() {
		return borsa;
	}

	public void setBorsa(Borsa borsa) {
		this.borsa = borsa;
	}
	
	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Personaggio [nome=" + nome + ", cognome=" + cognome + ", spec=" + spec + ", genere=" + genere
				+ ", razza=" + razza + ", borsa=" + borsa + "]";
	}

	public void sposa(Personaggio p){
		System.out.println(this.nome + " si sposa con " + p.nome);
		p.setCognome(this.cognome);
	}
	
	public boolean raccogliStrumento(Strumento strumento){
		return this.borsa.aggiungi(strumento);
		//printare il nome di chi ha cosa
	}
	
	public boolean gettaStrumento(Strumento strumento){
		return this.borsa.rimuovi(strumento);
	}
	
	

	
	
	
	
	
	
	
	
	
	
	

}
