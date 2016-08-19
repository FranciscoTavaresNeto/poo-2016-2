// programação modular
// classes são módulos!
class Text {
  //  012345678901234567890
  // "string de teste"
  static String substr(String s, int indice, int qtd) {
    String resposta = "";
    for (int i = 0; i < qtd && indice < s.length(); i++) {
      // += é a forma reduzida de "resposta = resposta +"
      resposta += s.charAt(indice++);
      // ++ é pós-incremento
      // usa o indice e incrementa depois
    }
    return resposta;
  }

  // modo profissional: a lógica é reaproveitada
  // métodos chamam outros métodos
  static String cut(String s, int qtd) {
    return substr(s, 0, qtd); // delegação
  }

  // modo amador: não se reaproveita lógica
  // tudo sai do zero
  // static String cut(String s, int qtd) {
  //   String resposta = "";
  //   for (int i = 0; i < qtd; i++) {
  //     resposta += s.charAt(i);
  //   }
  //   return resposta;
  // }








}
// Text não depende de Main
