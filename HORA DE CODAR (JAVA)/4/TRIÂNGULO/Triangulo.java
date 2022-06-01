// 4 - Areas de Figuras Planas - QUADRADO --> A = ((base * altura)/2)

import java.util.Scanner;

public class Triangulo {

  public static void main(String[] args) {

    System.out.println("INFORME A BASE DO SEU TRIANGULO: ");
    Scanner base = new Scanner(System.in);
    double b = base.nextDouble();

    System.out.println("INFORME A ALTURA DO SEU TRIANGULO: ");
    Scanner altura = new Scanner(System.in);
    double a = altura.nextDouble();

    double area = ((b * a)/2);

    System.out.println("A AREA DO SEU TRIANGULO EH: " + area + "!");

  }

}