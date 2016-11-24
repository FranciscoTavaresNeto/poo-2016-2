import java.util.ArrayList;

public class Pessoa {
	
	private String nome;
	private ArrayList<Endereco> enderecos = new ArrayList();
	private CepFinder cepfinder;
	
	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}

	public Pessoa(String nome, CepFinder cepfinder) {
		this.cepfinder = cepfinder;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}

	public void addEndereco(String cep, String numero) {
		Endereco e = cepfinder.find(cep);
		if (e != null) {
			e.setNumero(numero);
			enderecos.add(e);
		}
	}
	
	
	

}
