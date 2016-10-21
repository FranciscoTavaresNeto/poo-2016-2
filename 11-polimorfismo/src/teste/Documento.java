package teste;

public class Documento {
	
	private String titulo, texto;
	private int paginas;

	
	public String getTitulo() {
		return titulo;
	}

	public String getTexto() {
		return texto;
	}
	
	public int getPaginas() {
		return paginas;
	}

	public Documento(String titulo, String texto, int paginas) {
		super();
		this.titulo = titulo;
		this.texto = texto;
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Documento [titulo = " + titulo + ", texto = " + texto + ", paginas = " + paginas + "]";
	}
}
