package av7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Consulta {
	
	private enum Status {
		agendada, realizada, cancelada;
	}
	
	private int id;
	private Paciente pcnt;
	private Pediatra pdtr;
	private LocalDateTime dataHora;
	private Status status;
	private Receita receita;
	
	public Consulta(int id, Paciente pcnt, Pediatra pdtr, LocalDateTime dataHora) {
		this.id = id;
		this.pcnt = pcnt;
		this.pdtr = pdtr;
		this.dataHora = dataHora;
		this.status = Status.agendada;
	}
	
	public int getId() { return id; }

	public Pediatra getPediatra() { return pdtr; 	}

	public Paciente getPaciente() { return pcnt; 	}

	public LocalDateTime getDataHora() { return dataHora; 	}

	public boolean isAgendada() {
		return status == Status.agendada;
	}
	
	public boolean isRealizada() {
		return status == Status.realizada;
	}
	
	public boolean isCancelada() {
		return status == Status.cancelada;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Consulta other = (Consulta) obj;
		if (id != other.id) return false;
		return true;
	}

	public void realizar() {
		status = Status.realizada;
	}

	public void realizar(Receita receita) {
		realizar();
		this.receita = receita;
	}

	public Receita getReceita() { 	return receita; }

	@Override
	public String toString() {
		return "Consulta de " + pcnt.getNome() + " com " + pdtr.getNome() + " dia " + dataHora.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) + " as " + dataHora.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
	}
	

}
