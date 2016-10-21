package teste;

public class Cupom {
	
	private String produtos = "";
	private Impressora imp;
	
	public Cupom(Impressora imp) {
		this.imp = imp;
	}
	
	public void setImpressora(Impressora imp) {
		this.imp = imp;
	}

	public void adicionaProduto(String p) {
		this.produtos += p + "\n";
	}
	
	public void imprimir() {
		Documento documento = new Documento("Cupom.txt",produtos,1 );
		imp.imprimir(documento);
	}

}
