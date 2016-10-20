package atividade;

public class Componente {

	private String nome;
	private int cargaHoraria;

	public Componente(String nome, int cargaHoraria) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}

	public String getNome() {
		return nome;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.cargaHoraria + "h";
	}

	
	
	
	
	
	
	
	
}
