package teste;


public class Scanner extends Impressora{
	
	private int digitalizacoes;

	public Scanner(String modelo) {
		super("Multifuncional " + modelo);
	}
	
	public Documento digitalizar() {
		digitalizacoes++;
		Documento documento = new Documento("temp", "scan" + digitalizacoes, 1);
		
		return documento;
		
	}

	public int getdigitalizacoes() {
		return digitalizacoes;
	}

	@Override
	public String toString() {
		return super.toString() + ", digitalizacoes = " + digitalizacoes + ";";
	}

}
