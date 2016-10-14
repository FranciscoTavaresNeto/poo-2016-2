package heranca;

public class Carro extends Veiculo {
	
	// ford fiesta 2009 90000km
	
	private boolean arCondicionado;
	
	public Carro(String fabricante, String modelo, 
				 int km, int ano, boolean arCondicionado) {
		
		super(fabricante, modelo, km, ano);

		this.arCondicionado = arCondicionado;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}
	
	
}





