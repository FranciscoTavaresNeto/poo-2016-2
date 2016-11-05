package av7;

public class Paciente {

	private String rg, nome;

	public Paciente(String nome, String rg) {
		this.nome = nome;
		this.rg = rg;
	}
	
	public String getNome() { return nome; }
	
	public String getRg() { return rg; }
	
	@Override
	public String toString() {
		return rg + " " + nome;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Paciente other = (Paciente) obj;
		if (rg == null) {
			if (other.rg != null) return false;
		} else if (!rg.equals(other.rg)) return false;
		return true;
	}
	

}
