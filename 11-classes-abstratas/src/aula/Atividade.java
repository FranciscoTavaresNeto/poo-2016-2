package aula;

import java.time.LocalDateTime;

// supertipo / Classe Abstrata / Tipo Abstrato
	// abstract: só pode ser usado como tipo abstrato
    // não pode ser concreto
    // não pode dar "new Atividade"
public abstract class Atividade {

	protected String nome;
	protected LocalDateTime dataHora;
	protected int vagas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	
	// Método Abstrato!
	// É uma funcionalidade/propriedade
	// que sabemos que existe, mas não sabemos
	// o que deve fazer/retornar.
	// É algo que sabemos que tem
	// mas as classes concretas definem!
	// delegar para os tipos concretos
	public abstract String getTipo();
	
	
	@Override
	public String toString() {
		return getTipo() + " " + nome;
	}
	
	
	
	
	

}
