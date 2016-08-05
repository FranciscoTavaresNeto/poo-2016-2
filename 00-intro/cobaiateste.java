class cobaiateste {
  public static void main(String[] args) {
    int base = 3;
    int expoente = 2;
    int potencia = 1;
    for (int i = 0; i < expoente; i++) {
      potencia = potencia * base;
    }
    // Caso de Teste (assertiva)
    System.out.println(potencia == 9);

    base = 2;
    expoente = 3;
    potencia = 1;
    for (int i = 0; i < expoente; i++) {
      potencia = potencia * base;
    }
    // Caso de Teste (assertiva)
    System.out.println(potencia);
    System.out.println(potencia == 8);

    base = 2;
    expoente = 10;
    potencia = 1;
    for (int i = 0; i < expoente; i++) {
      potencia = potencia * base;
    }
    // Caso de Teste (assertiva)
    System.out.println(potencia);
    System.out.println(potencia == 1024);

    System.out.println(Integer.MAX_VALUE);
  }
}
