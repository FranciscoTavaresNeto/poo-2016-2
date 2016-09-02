class TV {
  // atributos QUASE SEMPRE são privados!!!!
  // atributo da TV (estado)
  private boolean ligada = false;
  // o atributo canal é privado, só
  // pode ser lido ou alterado dentro da TV
  private int     canal  = 6;
  private int     volume = 50;
  // proteger os atributos de um acesso direto
  // é chamado de ENCAPSULAMENTO

  // variáveis operacionais
  private int volumeAnterior;
  private boolean silenciado;
  // ------------------------

  // operações da TV (comandos)
  void subirCanal() {
    // if (ligada) this.canal++;
    if (ligada) this.canal = this.canal + 1; // primeiratv
    if (this.canal == 70) this.canal = 3; // loop canal
  }

  void descerCanal() {
    if (ligada) this.canal--;
    if (this.canal == 2) this.canal = 69;
  }

  void escolherCanal(int canalDesejado) {
    if (ligada &&
        canalDesejado >= 3 && canalDesejado <= 69) {
      this.canal = canalDesejado;
    }
  }
  // comando
  void ligarDesligar() {
    this.ligada = ! this.ligada;
  }

  void subirVolume() {
    if (ligada && this.volume < 100) this.volume++;
  }

  void descerVolume() {
    if (ligada && this.volume > 0) this.volume--;
  }

  void resetar() {
    if (!ligada) {
      this.volume = 50;
      this.canal = 6;
    }
  }

  void silenciarOuNao() {
    if (ligado) {
      if (silenciado) {
        this.volume = this.volumeAnterior;
        silenciado = false;
      } else {
        this.volumeAnterior = this.volume;
        this.volume = 0;
        silenciado = true;
      }
    }
  }

  // consulta
  boolean estaLigada() {
    return this.ligada;
  }

  int canal() {
    return this.canal;
  }

  int volume() {
    return this.volume;
  }

  // sobrescrever o método toString
  public String toString() {
    return "TV " + this.ligada
         + " canal" + this.canal
         + " volume" + this.volume;
  }

}
