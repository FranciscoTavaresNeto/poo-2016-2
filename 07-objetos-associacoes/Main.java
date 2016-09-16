class Main {
  public static void main(String[] args) {

    // Peso p = new Peso(1000);
    Peso p = new Peso(1.5);
    // p.gramas = 1000;

    Moeda teste = new Moeda(1, 99);
    System.out.println(teste.centavos);

    Transporte t1 = new Transporte();
    t1.origem = "Rio Grande";
    t1.destino = "Bage";
    t1.custo = teste;
    t1.peso = p;
    System.out.println(t1);

    Transporte t2 = new Transporte("Pelotas", "Jaguarao");
    t2.peso = p;

    System.out.println(t2); // toString()

    // t2.peso.gramas = 2000;

    System.out.println(t2.kilos());

    System.out.println(t1);

    System.out.println(t1.peso.gramas());
    System.out.println(t1.peso.kilos());
    System.out.println(t1.peso.libras());

    Carreto carreto = new Carreto();

    carreto.transportes[0] = t1;
    carreto.transportes[1] = t2;

    System.out.println(carreto.transportes);
    System.out.println(carreto.transportes[0]); // RG/Bagé
    System.out.println(carreto.transportes[1]); // Pel/Jaguarao
    System.out.println(carreto.transportes[2]); // null

    // adicionar transportes no Carreto! PROBLEMA





  }
}
