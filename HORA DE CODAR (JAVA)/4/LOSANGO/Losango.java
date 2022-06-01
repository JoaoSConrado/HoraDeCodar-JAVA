// 4- Areas de Figuras Planas - LOSANGO --> A = (diagonal maior . diagonal menor) / 2

import java.util.Scanner;

public class Losango {

  public static void main(String[] args) {

    System.out.println("INFORME QUAL E O VALOR DA DIAGONAL MAIOR DO SEU LOSANGO: ");
    Scanner maior = new Scanner(System.in);
    double diagonalMaior = maior.nextDouble();

    System.out.println("INFORME QUAL E O VALOR DA DIAGONAL MENOR DO SEU LOSANGO: ");
    Scanner menor = new Scanner(System.in);
    double diagonalMenor = menor.nextDouble();
    
    double area = ((diagonalMaior * diagonalMenor)/2);

    System.out.println("A AREA DO SEU LOSANGO EH: " + area + "!");

  }

}