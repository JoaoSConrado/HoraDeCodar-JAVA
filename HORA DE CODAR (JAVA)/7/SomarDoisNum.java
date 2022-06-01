// Faça um programa que leia  3 valores (considere que não serão informados 
// valores iguais) e escrever a soma dos 2 maiores. 

import java.util.Scanner;

public class SomarDoisNum {
  
  public static void main(String[] args) {

    System.out.println("DIGITE UM NUMERO: ");
    Scanner n1 = new Scanner(System.in);
    Double num1 = n1.nextDouble();

    System.out.println("DIGITE UM NUMERO: ");
    Scanner n2 = new Scanner(System.in);
    Double num2 = n2.nextDouble();

    System.out.println("DIGITE UM NUMERO: ");
    Scanner n3 = new Scanner(System.in);
    Double num3 = n3.nextDouble();

    if (num1 < num2 && num1 < num3) {
      System.out.println("A SOMA DOS 2 MAIORES NUMEROS EH: " + (num2 + num3));
    }   
            
    if (num2 < num1 && num2 < num3) {
      System.out.println("A SOMA DOS 2 MAIORES NUMEROS EH: " + (num1 + num3));
    }
                
    if (num3 < num2 && num3 < num1) {
      System.out.println("A SOMA DOS 2 MAIORES NUMEROS EH: " + (num1 + num2)); 
    }
  }
}