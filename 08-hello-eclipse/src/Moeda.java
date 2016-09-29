class Moeda {
	final int real, centavos;

	Moeda(int real, int centavos) {
		if (real < 0 || centavos < 0) {
			throw new IllegalArgumentException("o valor não pode ser negativo");
		}
		if (centavos > 99) {
			throw new IllegalArgumentException("max 99 centavos");
		}
		this.real = real;
		this.centavos = centavos;
	}

	Moeda(int real) {
		this(real, 0);
	}

	Moeda soma(Moeda outraMoeda) {
		int totalEmReais = this.real + outraMoeda.real;
		int totalEmCentavos = this.centavos + outraMoeda.centavos;
		totalEmReais += totalEmCentavos / 100;
		totalEmCentavos = totalEmCentavos % 100;
		return new Moeda(totalEmReais, totalEmCentavos);
	}

	Moeda soma(int reais) {
		int totalEmReais = this.real + reais;
		return new Moeda(totalEmReais, this.centavos);
	}
	
	// sempre sobrescrever equals e toString

	@Override // está sobrescrevendo
	public boolean equals(Object o) {
		if (o instanceof Moeda) {
			Moeda m = (Moeda) o; // cast de o para Moeda
			return this.real == m.real
				&& this.centavos == m.centavos;
		}
		return false;
	}

	public String toString() { // sobrescrevendo o toString
		return "R$ " + this.real + "," + (this.centavos < 10 ? "0" : "") + this.centavos;
	}
	
	
	
	
	
}
