// 4 - Areas de Figuras Planas - QUADRADO --> A = (((base maior + base menor) * altura)/2)

import java.util.Scanner;

public class Trapezio {

  public static void main(String[] args) {

    System.out.println("INFORME A BASE MAIOR DO SEU TRAPEZIO: ");
    Scanner baseMaior = new Scanner(System.in);
    double bMaior = baseMaior.nextDouble();

    System.out.println("INFORME A BASE MENOR DO SEU TRAPEZIO: ");
    Scanner baseMenor = new Scanner(System.in);
    double bMenor = baseMenor.nextDouble();

    System.out.println("INFORME A ALTURA DO SEU TRAPEZIO: ");
    Scanner altura = new Scanner(System.in);
    double a = altura.nextDouble();

    double area = (((bMaior + bMenor) * a)/2);

    System.out.println("A AREA DO SEU TRAPEZIO EH: " + area + "!");

  }

}