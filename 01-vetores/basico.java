class basico {

  static void preenche(int[] numeros) {
    for (int i = 0; i < numeros.length; i++)
      numeros[i] = (int) (Math.random() * 100);
  }

  static int maximo(int[] numeros) {
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
  }
}
