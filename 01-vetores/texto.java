class texto {
  public static void main(String[] args) {
    // vetores são objetos
    // endereços de memória
    double[] valores = new double[3];
    valores[0] = 3.8;
    valores[1] = 9.0;
    valores[2] = 1.1;
    System.out.println(valores);
    for (int i = 0; i < valores.length; i++) {
      System.out.print(valores[i] + ", ");
    }

    int a = 80;
    System.out.println(a);
    System.out.println((char)a);
    System.out.println((char)67);
    System.out.println((char)(a+1));

    // aspas simples
    char letra = 'z';
    System.out.println(letra);
    System.out.println((int)letra);

    char[] palavra = new char[4];
    palavra[0] = 'i'; palavra[1] = 'f';
    palavra[2] = 'r'; palavra[3] = 's';
    System.out.println(palavra);
    // String curso = "tads";
    char[] curso = {'t', 'a', 'd', 's'};
    System.out.println(curso);
    System.out.println(curso[curso.length - 1]);
    //char[] nome2 = {'A','n','a','l','i' ...}
    String nome2 = "Analise e Desenvolvimento";
    System.out.println(nome2.charAt(1));
    System.out.println(nome2.length());
    System.out.println(nome2.toUpperCase());

    System.out.println(curso[0] - 32);
    System.out.println( (char) (curso[0] - 32) );

    for (int i = 0; i < nome2.length(); i++) {
      System.out.print((char)(nome2.charAt(i) - 32));
    }
    System.out.println();
    char[] teste = {'a', 'b', 10, 'c', 'd'};
    System.out.println(teste);


  }
}
