// 4- Areas de Figuras Planas - PARALELOGRAMO --> A = base * altura

import java.util.Scanner;

public class Paralelogramo {

  public static void main(String[] args) {

    System.out.println("INFORME O VALOR DA BASE DO SEU PARALELOGRAMO: ");
    Scanner base = new Scanner(System.in);
    double b = base.nextDouble();

    System.out.println("INFORME O VALOR DA ALTURA DO SEU PARALELOGRAMO: ");
    Scanner altura = new Scanner(System.in);
    double a = altura.nextDouble();

    double area = b * a;

    System.out.println("A AREA DO SEU PARALELOGRAMO EH: " + area + "!");

  }

}