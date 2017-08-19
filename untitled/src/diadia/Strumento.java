package diadia;

public class Strumento {
	private String nome;
	private String tipo;
	
	public Strumento(String nome, String tipo){
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
		
	}
	public String getTipo(){
		return this.tipo;
	}
	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	@Override //un metodo definito da una superclasse in questo caso Object viene ridefinito da una sottoclasse, 
	//es. superclasse animale, sottoclassi: gatto, cane, ornitorinco -> per quest'ultimo ridefinisco il metodo "prole" perchè si comporta in modo diverso.
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Strumento other = (Strumento) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Strumento [nome=" + nome + ", tipo=" + tipo + "]";
	}
	
	
}
