package atividade;

public class Curso {

	private String nome;
	// um (1) curso tem vários (n) componentes
	private Componente[] componentes = new Componente[10];
	private int i = 0;

	public Curso(String nome) {
		this.nome = nome;
	}

	public void addComponente(Componente c) {
		componentes[i++] = c; // pós-incremento		
	}

	public String getNome() {
		return nome;
	}

	public int getCargaHoraria() {
		int cargaHorariaCurso = 0;
		
		// o for each simplifica isto:
		//for (int i = 0; i < componentes.length; i++) {
		//	Componente c = componentes[i];
		
		for (Componente c : componentes) { // for each
			if (c != null) {
				cargaHorariaCurso += c.getCargaHoraria();
			}
		}
		return cargaHorariaCurso;
	}

	public int getComponenteCurricular(int nroComponente) {
		return componentes[nroComponente-1].getCargaHoraria();
	}

	public Componente[] getComponentes() {
		return componentes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Curso other = (Curso) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	







}
