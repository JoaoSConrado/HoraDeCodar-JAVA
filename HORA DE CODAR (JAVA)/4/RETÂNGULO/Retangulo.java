// 4 - Areas de Figuras Planas - QUADRADO --> A = base * altura

import java.util.Scanner;

public class Retangulo {

  public static void main(String[] args) {

    System.out.println("INFORME A BASE DO SEU RETANGULO: ");
    Scanner base = new Scanner(System.in);
    double b = base.nextDouble();

    System.out.println("INFORME A ALTURA DO SEU RETANGULO: ");
    Scanner altura = new Scanner(System.in);
    double a = altura.nextDouble();

    double area = b * a;

    System.out.println("A AREA DO SEU RETANGULO EH: " + area + "!");

  }

}