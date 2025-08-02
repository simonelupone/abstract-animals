package org.lessons.java.abs;

public class Delfino extends AbstractAnimale implements Nuotante {
  private int componentiBranco;

  public Delfino(String nome, int eta, int componentiBranco) {
    super(nome, eta);
    this.componentiBranco = componentiBranco;
  }

  public int getComponentiBranco() {
    return componentiBranco;
  }

  public void setComponentiBranco(int componentiBranco) {
    this.componentiBranco = componentiBranco;
  }

  public void nuota() {
    System.out.println("Sto nuotando!!");
  }

  @Override
  public void verso() {
    System.out.print("Fischio");
  }

  @Override
  public void mangia() {
    System.out.print("Pesci");
  }

  @Override
  public String toString() {
    return super.toString() + " e un branco di " + componentiBranco + " delfini";
  }
}
