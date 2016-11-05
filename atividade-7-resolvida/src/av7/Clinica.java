package av7;

import java.time.LocalDateTime;

public class Clinica {

	private String nome, cidade;
	private Pediatra[] pediatras = new Pediatra[100];
	private int pdtr, pcnt, idConsulta;
	private Paciente[] pacientes = new Paciente[100];
	private Consulta[] consultas = new Consulta[100000];

	public Clinica(String nome, String cidade) {
		this.nome = nome;
		this.cidade = cidade;
	}
	
	public String getNome() { return nome; }
	
	public String getCidade() { return cidade; }

	public void credenciarPediatra(Pediatra p) {
		pediatras[pdtr++] = p;
	}
	
	public Pediatra getPediatra(int crm) {
		for (Pediatra p : pediatras) if (p != null && p.getCrm() == crm) return p;
		return null;
	}
	
	public Paciente getPaciente(String rg) {
		for (Paciente p : pacientes) if (p != null && p.getRg().equals(rg)) return p;
		return null;
	}

	
	public void cadastrarPaciente(Paciente p) {
		pacientes[pcnt++] = p;
	}
	
	@Override
	public String toString() {
		return nome + " " + cidade;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Clinica other = (Clinica) obj;
		if (cidade == null) {
			if (other.cidade != null) return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (nome == null) {
			if (other.nome != null) return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public Consulta agendarConsulta(String rg, int crm, LocalDateTime quando) {
		Paciente pcnt = getPaciente(rg);
		if (pcnt == null) return null;
		Pediatra pdtr = getPediatra(crm);
		if (pdtr == null) return null;
		Consulta con = new Consulta(++idConsulta, pcnt, pdtr, quando);
		consultas[idConsulta - 1] = con;
		return con;
	}

	public Consulta getConsulta(int id) {
		for (Consulta c : consultas) if (c != null && c.getId() == id) return c;
		return null;
	}

	


	

	
	
	
	
	
}
