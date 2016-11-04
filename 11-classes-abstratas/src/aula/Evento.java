package aula;

import java.util.ArrayList;

public class Evento {
	
	// private Atividade[] atividades = new Atividade[100];
	// private int cont = 0;
	private ArrayList<Atividade> atividades =
			new ArrayList();
	
	private String nome;
	
	public Evento(String nome) {
		this.nome = nome;
	}
	
	public void cadastrarAtividade(Atividade a) {
		// atividades[cont++] = a;
		atividades.add(a);
	}

	@Override
	public String toString() {
		return nome + " " + atividades;
	}	
	
}
