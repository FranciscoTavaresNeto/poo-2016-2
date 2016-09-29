class Transporte {
  // private // final

  String origem;  // null
  String destino; // null
  // valor padrão R$ 0,00
  Moeda  custo = new Moeda(0, 0);   // null
  int real;
  int centavos;

  Peso   peso;
  //int gramas;

  // construtor
  Transporte(String origem, String destino) {
    this.origem = origem;
    this.destino = destino;
  }
  // construtor vazio (permite instanciar sem argumentos)
  Transporte() { }

  int gramas() {
    return this.gramas;
  }

  double kilos() {
    return this.gramas / 1000.0;
  }

  // reaproveitamento de métodos (kilos())
  double libras() {
    return this.kilos() * 2.20462;
  }

  public String toString() {
      return "transporte de " + origem
      + " para " + destino + " valor de " + custo
      + " pesando " + peso;
  }









}
