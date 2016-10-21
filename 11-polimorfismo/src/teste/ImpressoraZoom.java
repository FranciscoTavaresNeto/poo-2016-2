package teste;

public class ImpressoraZoom extends Impressora{
	

	private Zoom zoom = Zoom._100;

	public ImpressoraZoom(String Modelo) {
		super(Modelo + "(Zoom)");
	}

	public void setzoom(Zoom zoom) {
		this.zoom = zoom;
		
	}
	
	@Override
	public void imprimir(Documento documento, int copias) {
		super.imprimir(documento, copias);
		if (zoom == zoom._50) {
			int metade = copias * documento.getPaginas() /2;
			impressoes -= metade;
		} else if (zoom == zoom._25) {
			int quarto = copias * documento.getPaginas() /4;
			impressoes -= 3 * quarto;
		}
	}
	


}
