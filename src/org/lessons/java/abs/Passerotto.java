package org.lessons.java.abs;

public class Passerotto extends AbstractAnimale implements Volante {
  private String colorePiume;

  public Passerotto(String nome, int eta, String colorePiume) {
    super(nome, eta);
    this.colorePiume = colorePiume;
  }

  public String getColorePiume() {
    return colorePiume;
  }

  public void setColorePiume(String colorePiume) {
    this.colorePiume = colorePiume;
  }

  public void vola() {
    System.out.println("Sto volando!!");
  }

  @Override
  public void verso() {
    System.out.print("Cinguettio");
  }

  @Override
  public void mangia() {
    System.out.print("Insetti");
  }

  @Override
  public String toString() {
    return super.toString() + " e un colore delle piume " + colorePiume;
  }
}
