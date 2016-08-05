class cobaia {
  public static void main(String[] args) {
    // CTRL + SHIFT + D
    // CTRL + SETA ACIMA/ABAIXO
    int base = 3; // 3 é uma constante literal
    // System.out.println(base); // CTRL + SHIFT + K
    // CTRL + / comentar
    int expoente = 2;
    // a entrada não pode ser negativa

    int potencia = 1;

    // int i = 0;
    // while (i < expoente) {
    //   potencia = potencia * base;
    //   i = i + 1;
    // }

    for (int i = 0; i < expoente; i++) {
      potencia = potencia * base;
    }

    System.out.println(potencia); // 9
    System.out.println(potencia == 9); // 9
  }
}
