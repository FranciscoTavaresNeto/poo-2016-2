package av7;

public class Medicacao {

	private String remedio, posologia;

	public Medicacao(String remedio, String posologia) {
		this.remedio = remedio;
		this.posologia = posologia;
	}
	
	@Override
	public String toString() {
		return remedio + ": " + posologia;
	}

}
