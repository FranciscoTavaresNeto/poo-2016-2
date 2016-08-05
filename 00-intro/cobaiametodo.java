class cobaiametodo {
  // método: tem uma assinatura (declaração)
  // saida/retorno  nome(entradas)
  static int potencia(int base, int expoente) {
    int potencia = 1;
    for (int i = 0; i < expoente; i++) {
      potencia = potencia * base;
    }
    return potencia;
  }

  public static void main(String[] args) {
    int base = 3;
    int expoente = 2;
    int potencia = potencia(base, expoente);
    System.out.println(potencia == 9);

    base = 2;
    expoente = 3;
    potencia = potencia(base, expoente);
    System.out.println(potencia == 8);

    // constantes literais
    System.out.println(potencia(4, 2));
    System.out.println(potencia(4, 2) == 16);

    System.out.println(Math.pow(4, 2));


  }
}
