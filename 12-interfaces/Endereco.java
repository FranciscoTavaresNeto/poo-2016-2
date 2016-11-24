public class Endereco {
	
	private String cep, logradouro, bairro, localidade, uf, numero;


	public String getCep() {
		return cep;
	}
	

	public void setCep(String cep) {
		this.cep = cep;
	}

	
	public String getLogradouro() {
		return logradouro;
	}

	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	
	public String getBairro() {
		return bairro;
	}

	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	
	public String getLocalidade() {
		return localidade;
	}

	
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	
	public String getUf() {
		return uf;
	}

	
	public void setUf(String uf) {
		this.uf = uf;
	}

	
	public String getNumero() {
		return numero;
	}

	
	public void setNumero(String numero) {
		this.numero = numero;
	} 

	
	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", logradouro=" + logradouro + ", bairro=" + bairro + ", localidade="
				+ localidade + ", uf=" + uf + ", numero=" + numero + "]";
	}
}
