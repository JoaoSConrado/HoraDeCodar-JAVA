// 5- Faça um programa que leia um valor informado pelo usuário e diga se o 
// valor informado é positivo, negativo ou zero.

import java.util.Scanner;

public class ValidarNum {
  
  public static void main(String[] args) {

    System.out.println("DIGITE UM NUMERO: ");
    Scanner in = new Scanner(System.in);

    Double num = in.nextDouble();
 
    if (num > 0) {
      System.out.println(num + " EH POSITIVO");
    }

    if (num < 0) {
      System.out.println(num + " EH NEGATIVO");
    }

    if (num == 0) {
      System.out.println(num + " EH ZERO");
    }

  }

}