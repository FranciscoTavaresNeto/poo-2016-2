class Peso {

  private int gramas;

  Peso(int gramas) { // construtor que recebe gramas
    this.gramas = gramas;
  }

  Peso() {
    this.gramas = 0;
  }

  Peso(double kilos) {
    this.gramas = (int) (kilos * 1000);
  }

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
    return gramas + "g";
  }
}
