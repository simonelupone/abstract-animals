package org.lessons.java.abs;

public class Aquila extends Animale {
  private float aperturaAlare;

  public Aquila(String nome, int eta, float aperturaAlare) {
    super(nome, eta);
    this.aperturaAlare = aperturaAlare;
  }

  public float getAperturaAlare() {
    return aperturaAlare;
  }

  public void setAperturaAlare(float aperturaAlare) {
    this.aperturaAlare = aperturaAlare;
  }

  @Override
  public void verso() {
    System.out.print("Grido");
  }

  @Override
  public void mangia() {
    System.out.print("Piccoli animali");
  }

  @Override
  public String toString() {
    return super.toString() + " e un'apertura alare di " + aperturaAlare + " mt";
  }
}
