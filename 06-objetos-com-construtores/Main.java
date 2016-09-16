class Main {
  public static void main(String[] args) {

    // R$ 8,14 (oito reais com catorze centavos)
    Moeda valor = new Moeda(0, 0); // Moeda() <- é o construtor
    // construtor servem para inicializar o objeto
    // neste caso, o construtor é vazio (sem argumentos)
    System.out.println(valor); // toString implícito
    // valor.real = 8; // final
    // valor.centavos = 14; // final
    valor = new Moeda(8, 14);
    System.out.println(valor); // toString implícito

    // construtor com dois ints
    Moeda preco = new Moeda(1, 99);
    System.out.println(preco);
    // preco.real = 2; // proibido pois o atributo é final
    System.out.println(preco);

    // VALIDAÇÃO: o objeto é sempre válido
    // -----------------------------------------------
    // caso especial: tratar ou rejeitar
    // funciona como uma exceção (não confundir com erro)
    // reais válidos: não negativo
    // centavos válidos: não negativo até o máximo de 99
    // Dois casos invalidos IllegalArgumentException
    // Moeda invalido = new Moeda(2, 800);
    // invalido = new Moeda(-2, -100);
    // System.out.println(invalido);

    // objetos imutáveis também têm operações!
    Moeda valor1 = new Moeda(2, 34);
    Moeda valor2 = new Moeda(1, 70);
    // 4,04
    // método soma
    Moeda total = valor1.soma(valor2); // valor1 + valor2
              // this e o argumento

    System.out.println(total);

    // POLIMORFISMO!
    // "comportar-se segundo a situação"
    // Moeda v1 = new Moeda(1, 0);
    Moeda v1 = new Moeda(1); // equivale a new Moeda(1, 0);
    // POLIMORFISMO AD-HOC: sobrecarga de construtores
    // ou métodos (mesmo nome e diferentes parâmetros)
    System.out.println(v1);

    v1 = v1.soma(1);
    // exercício
    Moeda v3 = new Moeda("R$ 5,78");
    Moeda v4 = v3.soma("R$ 8,89");




  }
}
