package heranca;

public class Veiculo {
	
	private String fabricante;
	private String modelo;
	private int km;
	private int ano;
	
	public Veiculo(String fabricante, String modelo, int km, 
				 int ano) {
		if (ano < 1950) throw new IllegalArgumentException();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.km = km;
		this.ano = ano;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public int getKm() {
		return km;
	}

	public int getAno() {
		return ano;
	}

	public void setKm(int km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return fabricante + " " + modelo + " " + ano;
	}
}
