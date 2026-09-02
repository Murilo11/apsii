package org.example;

public class ProgramaDasFiguras {
    public static void main(String[] args) {
        GerenteDeFiguras gerente = new GerenteDeFiguras();
        Triangulo t1 = new Triangulo(2.0, 3.0);
        gerente.adicionaFigura(t1);

        Losango l1 = new Losango(4.0, 5.0);
        gerente.adicionaFigura(l1);
        Losango l2 = new Losango(6.0, 8.0);
        gerente.adicionaFigura(l2);

        gerente.imprimeFiguras();

        System.out.println("Área total das figuras: " + gerente.calculaAreaTotalDeFiguras());

        System.out.println("Maior área das figuras: " + gerente.getMaiorAreaDeFigura());
    }
}