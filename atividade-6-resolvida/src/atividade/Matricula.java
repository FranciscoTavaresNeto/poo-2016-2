package atividade;

public class Matricula {

	private Aluno aluno;
	private boolean ativa = true;
	
	public Matricula(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public boolean isAtiva() {
		return ativa;
	}
	
	public boolean isCancelada() {
		return ! ativa;
	}

	public void cancelar() {
		ativa = false;
	}
}
