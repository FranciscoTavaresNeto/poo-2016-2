class cobaia {

  static String inverte2(String texto) {
    char[] letras = texto.toCharArray();
    char[] saida = new char[letras.length];
    for (int i = letras.length - 1, j = 0; i >= 0; i--, j++) {
      saida[j] = letras[i];
    }
    return new String(saida);
  }

  static String inverte(String texto) {
    String saida = "";
    for (int i = texto.length() - 1; i >= 0; i--) {
      saida = saida + texto.charAt(i);
    }
    return saida;
  }

  public static void main(String[] args) {
    String disciplina = "poo";
    String contrario = inverte2(disciplina);
    System.out.println(disciplina); // poo
    System.out.println(contrario); // oop
  }
}
