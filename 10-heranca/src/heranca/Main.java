package heranca;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Veiculo carro1 = new Carro("Ford", "Fiesta", 90000, 2009, false);
		System.out.println(carro1);
		
		Veiculo moto1 = 
		new Motocicleta("Honda", "Twister", 68000, 2008, true);
		
		Venda venda1 = new Venda(moto1, LocalDate.now(), 16000);
		
		System.out.println(venda1);
		
		// Honda Twister 2008 68000 5000
		
		
		
		
		
	}

}
