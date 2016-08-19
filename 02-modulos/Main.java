// nome das classes em maiúsculo
// só o nome de classes é em maiúsculo
class Main {
  public static void main(String[] args) {
    System.out.println("algo");
    // obs: strings são imutáveis
    //                     012345
    // System.out.println("objeto".substring(0, 4));
    // projetar procedimentos/funções/métodos
    // fail-fast: "fazer quebrar cedo"
    // fail-safe: "manter funcionando"
                  //012345678901234
    String teste = "string de teste";
    String parte = Text.substr(teste, 7, 2); // de
    System.out.println(teste);
    System.out.println(parte); // de
    // com strings não usamos == para comparar
    System.out.println(parte == "de");
    // usamos string.equals(outra)
    System.out.println(parte.equals("de")); // true

    String a = Text.substr(teste, 3, 3);
    System.out.println(a); // conteúdo
    System.out.println(a.equals("ing")); // assertiva

    String b = Text.substr(teste, 10, 8);
    System.out.println(b); // teste
    System.out.println(b.equals("teste"));

    String corte = Text.cut(teste, 3);
    System.out.println(corte); // str
    System.out.println(corte.equals("str"));





  }
}
