// Faça um para ler 2 valores informados pelo usuário e se o segundo valor 
// informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo 
// valor não pode ser aceito o valor zero nem negativo e imprimir o resultado
// da divisão do primeiro valor lido pelo segundo valor lido. 

import java.util.Scanner;

public class ConsistirNum {
  
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("DIGITE O PRIMEIRO NUMERO: ");
    Double n1 = in.nextDouble();

    System.out.println("DIGITE O SEGUNDO NUMERO: ");
    Double n2 = in.nextDouble();
  
    while (n2 <= 0) {
      System.out.println("DIGITE O SEGUNDO NUMERO INTEIRO (MAIOR QUE 0): ");
      n2 = in.nextDouble();
    }

    Double Soma = (n1/n2);

    System.out.println(n1 + " / " + n2 + " = " + Soma);

  }
}