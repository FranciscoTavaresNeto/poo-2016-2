
class Main {
  public static void main(String[] args) {

    // TV é uma classe/tipo
    // a variável primeiratv é do tipo TV
    // new é usado para construir/instanciar o objeto
    TV primeiratv = new TV(); // () é o construtor da TV

    System.out.println(primeiratv.estaLigada()); // false
    // como ligar a TV?!
    // operação
    primeiratv.ligarDesligar(); // operação de ligar a TV
    // consulta
    System.out.println(primeiratv.estaLigada()); // true

    System.out.println(primeiratv.canal()); // 6

    primeiratv.subirCanal();

    System.out.println(primeiratv.canal()); // 7

    for (int i = 0; i < 100; i++) primeiratv.subirCanal();

    System.out.println(primeiratv.canal()); // 40

    primeiratv.descerCanal();

    System.out.println(primeiratv.canal()); // 39

    System.out.println(primeiratv.volume()); // 50

    primeiratv.subirVolume(); // +1

    System.out.println(primeiratv.volume()); // 51

    for (int i = 0; i < 500;i++) primeiratv.subirVolume();

    System.out.println(primeiratv.volume()); // 100

    primeiratv.resetar(); // volume = 50, canal = 6
    // TV ligada não reseta
    System.out.println(primeiratv.canal()); // 39
    System.out.println(primeiratv.volume()); // 100

    primeiratv.ligarDesligar();
    // TV desligada deve resetar
    primeiratv.resetar(); // volume = 50, canal = 6

    System.out.println(primeiratv.canal()); // 6
    System.out.println(primeiratv.volume()); // 50

    System.out.println(primeiratv); // toString implícito

    primeiratv.ligarDesligar(); // ligar!

    primeiratv.silenciarOuNao(); // silenciar

    System.out.println(primeiratv.volume()); // 0

    primeiratv.silenciarOuNao(); // desilenciar

    System.out.println(primeiratv.volume()); // 50

    primeiratv.escolherCanal(144); // não funciona

    System.out.println(primeiratv.volume()); // 50

    primeiratv.escolherCanal(44);

    System.out.println(primeiratv.canal()); // 44



  }
}
