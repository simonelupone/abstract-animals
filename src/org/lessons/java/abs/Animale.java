package org.lessons.java.abs;

public abstract class Animale {
  private String nome;
  private int eta;

  public Animale(String nome, int eta) {
    this.nome = nome;
    this.eta = eta;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getEta() {
    return eta;
  }

  public void setEta(int eta) {
    this.eta = eta;
  }

  public void dormi() {
    System.out.print("Zzz");
  }

  public abstract void mangia();

  public abstract void verso();

  @Override
  public String toString() {
    if (nome != null) {
      return nome + " ha " + eta + " anni";
    }
    return null;
  }
}
