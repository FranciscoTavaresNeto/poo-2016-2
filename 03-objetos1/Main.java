class Main {

  public static void main(String[] args) {

    // vetor (estrutura de dados (agrupa dados))
    // complexo
    double[] p = {2.5, 1.5};
    double[] s = {1.5, 2.0};

    double[] r = Complexo.soma(p, s);
    System.out.println(Complexo.stringando(r)); // 4.0 + 3.5i
    System.out.println(r[0] == 4.0);
    System.out.println(r[1] == 3.5);
    // 4.0 + 3.5i

    double[] c1 = {4.5,  3.5};
    double[] c2 = {2.5,  7.5};
    double[] c3 = {7.0, 11.0}; // c1 + c2

    System.out.println(Complexo.igual(Complexo.soma(c1, c2), c3) == true);


  }


}
