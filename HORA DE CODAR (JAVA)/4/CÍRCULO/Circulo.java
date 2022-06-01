// 4 - Areas de Figuras Planas - CIRCULO -> A = π * r²

import java.util.Scanner;

public class Circulo {

  public static void main(String[] args) {

    System.out.println("INFORME O VALOR DO RAIO DO SEU CIRCULO: ");
    Scanner circulo = new Scanner(System.in);
    double raio = circulo.nextDouble();

    double area = (3.14159265359 * (raio * raio));

    System.out.println("A AREA DO SEU CIRCULO EH: " + area + "!");

  }

}