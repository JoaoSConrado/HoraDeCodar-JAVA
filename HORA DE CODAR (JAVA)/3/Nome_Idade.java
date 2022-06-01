// 3- Escreva um programa em Java em que o usuário informe o seu nome e em seguida 
// o programa perguntará a idade do usuário. Agora o programa deve exibir a 
// mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

import java.util.Scanner;

public class Nome_Idade {

  public static void main(String[] args) {

    System.out.println("INFORME O SEU NOME: ");
    Scanner nome = new Scanner(System.in);
    String NomeDoUsuario = nome.next();

    System.out.println("INFORME A SUA IDADE: ");
    Scanner idade = new Scanner(System.in);
    int IdadeDoUsuario = idade.nextInt();

    System.out.println("OLA, " + NomeDoUsuario + ", SUA IDADE EH " + IdadeDoUsuario + "!");

  }

}

