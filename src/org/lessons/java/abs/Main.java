package org.lessons.java.abs;

public class Main {
  public static void main(String[] args) {

    // animali
    Cane zaira = new Cane("Zaira", 13, "miele");
    Cane shiba = new Cane("Shiba", 15, "nero");

    Passerotto cipi = new Passerotto("Cipi", 1, "giallo");

    Aquila aqui = new Aquila("Aqui", 2, 1.5f);

    Delfino flipper = new Delfino("Flipper", 2, 5);

    System.out.print(zaira.toString() + ". Il suo verso è: ");
    zaira.verso();
    System.out.print(" e mangia ");
    zaira.mangia();
    System.out.print(". Ora " + zaira.getNome() + " dorme...");
    zaira.dormi();

    System.out.println("\n");

    System.out.print(shiba.toString() + ". Il suo verso è: ");
    shiba.verso();
    System.out.print(" e mangia ");
    shiba.mangia();
    System.out.print(". Ora " + shiba.getNome() + " dorme...");
    shiba.dormi();

    System.out.println("\n");

    System.out.print(cipi.toString() + ". Il suo verso è: ");
    cipi.verso();
    System.out.print(" e mangia ");
    cipi.mangia();
    System.out.print(". Ora " + cipi.getNome() + " dorme...");
    cipi.dormi();

    System.out.println("\n");

    System.out.print(aqui.toString() + ". Il suo verso è: ");
    aqui.verso();
    System.out.print(" e mangia ");
    aqui.mangia();
    System.out.print(". Ora " + aqui.getNome() + " dorme...");
    aqui.dormi();

    System.out.println("\n");

    System.out.print(flipper.toString() + ". Il suo verso è: ");
    flipper.verso();
    System.out.print(" e mangia ");
    flipper.mangia();
    System.out.print(". Ora " + flipper.getNome() + " dorme...");
    flipper.dormi();

    System.out.println("\n");

    // es interfacce
    faiVolare(cipi);

    faiNuotare(flipper);
  }

  public static void faiVolare(Volante animale) {
    animale.vola();
  }

  public static void faiNuotare(Nuotante animale) {
    animale.nuota();
  }
}
