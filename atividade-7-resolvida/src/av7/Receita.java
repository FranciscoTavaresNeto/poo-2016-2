package av7;

public class Receita {

	private Medicacao[] medicacoes = new Medicacao[100];
	
	public Receita(Medicacao... m) {
		medicacoes = m;
	}
	
	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < medicacoes.length; i++) {
			if (i > 0) s += "\n";
			Medicacao medicacao = medicacoes[i];
			s += medicacao.toString();
		}
		return s;
	}

}
