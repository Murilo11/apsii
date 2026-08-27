package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Autor");
        String nomeAutor = sc.nextLine();
        System.out.println("Digite o valor do Livro ");
        double valorLivro = sc.nextDouble();
        System.out.println("Digite o nome do Livro");
        String nomeLivro = sc.nextLine();

        sc.nextLine();

        System.out.println("Digite o nome do CD");
        String nomeCD = sc.nextLine();
        System.out.println("Digite o valor do CD");
        double valorCD = sc.nextDouble();
        System.out.println("Digite o numero de faixas");
        int numeroFaixas = sc.nextInt();

        Livro book1 = new Livro(nomeLivro,valorLivro,nomeAutor);
        CD CD1 = new CD(nomeCD,valorCD,numeroFaixas);

        System.out.println(CD1.exibirInformacoes());






    }

}