class basico {

  static void preenche(int[] numeros) {
    for (int i = 0; i < numeros.length; i++)
      numeros[i] = (int) (Math.random() * 100);
  }

  static int maximo(int[] numeros) {
    // System.out.println(numeros.length);
    int max = 0;
    for (int i = 0; i < numeros.length; i++)
      if (numeros[i] > max) max = numeros[i];
    return max;
  }

  public static void main(String[] args) {
    int[] numeros = new int[10];
    preenche(numeros);
    int maior = maximo(numeros);
    System.out.println(maior);

    int[] idades = {39, 28, 21, 24,
                    20, 17, 29, 35,
                    27, 35, 30, 55};

    int velho = maximo(idades);
    System.out.println(velho);
    System.out.println(velho == 39);

    // int[] idades = new int[11];
    // idades[0] = 39;
    // idades[1] = 28;
    // idades[2] = 21;
    // ...

  }
}
