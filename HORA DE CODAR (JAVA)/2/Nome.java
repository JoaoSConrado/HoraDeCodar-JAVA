// 2- Escreva um programa em Java em que o usuário informe o seu nome e exiba a
// mensagem "Olá, [NomeDoUsuario]".

import java.util.Scanner;

public class Nome {
  
  public static void main(String[] args) {

    System.out.println("INFORME O SEU NOME: ");
    Scanner in = new Scanner(System.in);

    String NomeDoUsuario = in.next();

    System.out.println("Ola, " + NomeDoUsuario + "!");

  }

}