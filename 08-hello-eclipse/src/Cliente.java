
public class Cliente {

	private String nome;
	private String cpf;

	public Cliente(String nome, String cpf) {
		// TODO validar nome e cpf
		this.nome = nome;
		this.cpf = cpf;
	}
	// padrão Java: getAtributo
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cliente) {
			Cliente outro = (Cliente) obj;
			return this.cpf.equals(outro.cpf);
		}
		return false;
	}
	
	
	
	
	
	

}
