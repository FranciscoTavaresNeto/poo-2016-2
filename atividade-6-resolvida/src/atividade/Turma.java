package atividade;

public class Turma {

	private Curso curso;
	private String dataInicio;
	private String dataFim;
	private int vagas;
	private int quantidadeAlunos = 0;
	private Matricula[] matriculas;
	private int i;
	private boolean nova = true, andamento, cancelada, concluida; 

	public Turma(Curso original, String dataInicio, String dataFim, int vagas) {
		// clona o curso
		Curso clone = new Curso(original.getNome());
		// para cada componente do curso original
		for (int i = 0; i < original.getComponentes().length; i++) {
			// se ele existir
			if (original.getComponentes()[i] != null) {
				// clona com o mesmo nome e carga horária
				Componente cloneComponente =
						new Componente(original.getComponentes()[i].getNome(),
								original.getComponentes()[i].getCargaHoraria());
				// adiciona o componente clonado ao curso clonado
				clone.addComponente(cloneComponente);
			}
		}
		
		this.curso = clone;
		
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.vagas = vagas;
		this.matriculas = new Matricula[vagas];
	}

	public Curso getCurso() {
		return curso;
	}

	public int getCargaHoraria() {
		return curso.getCargaHoraria();
	}

	public int getVagas() {
		return vagas;
	}

	public boolean temVagas() {
		return (vagas > 0);
	}

	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public void matricular(Aluno aluno) {
		
		if ( ! temVagas() ) 
			throw new RuntimeException("nao tem vagas");
		
		matriculas[i++] = new Matricula(aluno);
		vagas--;
		quantidadeAlunos++;
	}

	public boolean isNova() {
		return nova;
	}
	
	public boolean isAndamento() {
		return andamento;
	}
	
	public boolean isCancelada() {
		return cancelada;
	}
	
	public boolean isConcluida() {
		return concluida;
	}

	public void comecar() {
		nova = cancelada = concluida = false;
		andamento = true;
	}

	public int getQuantidadeAlunosAtivos() {
		int ativos = 0;
		// para cada matricula
		for (Matricula mat : matriculas) {
			// se estiver ativa
			if (mat.isAtiva()) {
				// incrementa ativos
				ativos++;
			}
		}
		return ativos;
	}

	public void cancelarMatricula(Aluno a) {
		// para cada matricula
		for (Matricula mat : matriculas) {
			// se é do aluno a cancelar
			if (mat.getAluno().equals(a)) {
				// cancela a matricula
				mat.cancelar();
			}
		}
	}
	
	
	
	
	
	
	
	
}
