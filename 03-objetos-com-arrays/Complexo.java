class Complexo {
    static double[] soma(double[] complexo1,
                         double[] complexo2) {
      double[] resposta = {0.0, 0.0};
      resposta[0] = complexo1[0] + complexo2[0];
      resposta[1] = complexo1[1] + complexo2[1];
      return resposta;
      // return new double[]{p[0] + s[0], p[1] + s[1]};
    }
    static String stringando(double[] complexo) {
      return complexo[0] + " + " + complexo[1] + "i";
    }
    static boolean igual(double[] complexo1,
                         double[] complexo2) {
      return complexo1[0] == complexo2[0]
          && complexo1[1] == complexo2[1];
    }
}
