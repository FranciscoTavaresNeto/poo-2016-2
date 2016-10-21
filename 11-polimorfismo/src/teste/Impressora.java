package teste;

public class Impressora {
	private String Modelo;
	protected int impressoes;
	
	public Impressora(String Modelo) {
		this.Modelo = Modelo;
	}
	
	public void imprimir(Documento documento, int copias) {
		System.out.println("imprimindo " + copias + " de " + documento + " :");
		impressoes += copias * documento.getPaginas();
	}
	
	public void imprimir(Documento documento) {
		imprimir (documento, 1);
	}

	public int getImpressoes() {
		return this.impressoes;
	}

	@Override
	public String toString() {
		return "Modelo = " + Modelo + ", impressoes = " + impressoes;
	}
	
}
