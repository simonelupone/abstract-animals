package org.lessons.java.abs;

public class Cane extends Animale {
  private String colorePelo;

  public Cane(String nome, int eta, String colorePelo) {
    super(nome, eta);
    this.colorePelo = colorePelo;
  }

  public String getColorePelo() {
    return colorePelo;
  }

  public void setColorePelo(String colorePelo) {
    this.colorePelo = colorePelo;
  }

  @Override
  public void verso() {
    System.out.print("Abbaio");
  }

  @Override
  public void mangia() {
    System.out.print("Croccantini");
  }

  @Override
  public String toString() {
    return super.toString() + " e un colore del pelo " + colorePelo;
  }
}
