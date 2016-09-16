class Moeda {
  // final: sinaliza que o valor é constante!
  // é o que faz o tipo imutável!!!
  final int real, centavos;

  // construtor: mesmo nome da classe e os parâmetros
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
  // sobrecarga de construtor
  Moeda(int real) {
    this(real, 0);
  }

  // operação de soma de duas moedas
  Moeda soma(Moeda outraMoeda) {
    int totalEmReais = this.real + outraMoeda.real;
    int totalEmCentavos =
        this.centavos + outraMoeda.centavos;
    totalEmReais += totalEmCentavos / 100;
    totalEmCentavos = totalEmCentavos % 100;
    return new Moeda(totalEmReais, totalEmCentavos);
  }
  // sobrecarga de métodos
  Moeda soma(int reais) {
    int totalEmReais = this.real + reais;
    return new Moeda(totalEmReais, this.centavos);
  }


  public String toString() { // sobrescrevendo o toString
    return "R$ " + this.real + ","
                 + (this.centavos < 10 ? "0" : "")
                 + this.centavos;
  }





}
