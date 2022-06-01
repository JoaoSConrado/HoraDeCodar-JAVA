// 4 - Areas de Figuras Planas - QUADRADO --> A = lado * lado

import java.util.Scanner;

public class Quadrado {

  public static void main(String[] args) {

    System.out.println("INFORME O PRIMEIRO LADO DO SEU QUADRADO: ");
    Scanner lado1 = new Scanner(System.in);
    double l1 = lado1.nextDouble();

    System.out.println("INFORME O SEGUNDO LADO DO SEU QUADRADO: ");
    Scanner lado2 = new Scanner(System.in);
    double l2 = lado2.nextDouble();

    double area = l1 * l2;

    System.out.println("A AREA DO SEU QUADRADO EH: " + area + "!");

  }

}