package heranca;
// Motocicleta subclassifica/subtipa/especializa Veiculo
// Motocicleta estende um Veiculo
public class Motocicleta extends Veiculo {

	private boolean partidaEletrica;
	
	public Motocicleta(String fabricante, String modelo, 
				 int km, int ano, boolean partidaEletrica) {
		super(fabricante, modelo, km, ano);
		this.partidaEletrica = partidaEletrica;
	}

	public boolean isPartidaEletrica() {
		return partidaEletrica;
	}

	
}
// new Motocicleta();