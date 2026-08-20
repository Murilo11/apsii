package org.example;

public class Main {
    public static void main(String[] args) {

         Veiculo v1 = new Veiculo("Polo",2025);
         Carro c1 = new Carro("Corsa", 2005, 4);
         Moto m1 = new Moto("S1000", 1000, 2018);
        System.out.println(v1.imprimirDetalhes());
        System.out.println(c1.imprimirDetalhes());
        System.out.println(m1.imprimirDetalhes());

    }

}