class Main {
  public static void main(String[] args) {
    // estruturas de dados:
    // usar classes em vez de vetores
    // se vetores têm elementos
    // classes têm atributos
    // double[] p = {2.5, 1.5};
    // double[] s = {1.5, 2.0};
    // usar uma classe como "uma bolsa de dados"

    Complexo c1 = new Complexo();
    c1.real = 2.5;
    c1.imaginario = 1.5;
    System.out.println(c1.real);
    System.out.println(c1.imaginario);

    Complexo c2 = c1;
    System.out.println(c2.real); // 2.5
    c2.real = 3.5;
    System.out.println(c1.real); // 3.5








  }
}
