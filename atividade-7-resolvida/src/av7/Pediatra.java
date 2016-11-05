package av7;

public class Pediatra {

	private String nome;
	private int crm;

	public Pediatra(String nome, int crm) {
		this.nome = nome;
		this.crm = crm;
	}

	public String getNome() { 	return nome; }
	
	public int getCrm() {	return crm; }
	
	@Override
	public String toString() {
		return crm + " " + nome;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Pediatra other = (Pediatra) obj;
		if (crm != other.crm) return false;
		return true;
	}
}
