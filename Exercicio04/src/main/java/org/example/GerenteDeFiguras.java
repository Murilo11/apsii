package org.example;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
    private List<FiguraGeometrica> figuras;

    public GerenteDeFiguras() {
        figuras = new ArrayList<FiguraGeometrica>();
    }


    public void adicionaFigura(FiguraGeometrica fig) {
        figuras.add(fig);
    }


    public double calculaAreaTotalDeFiguras() {
        double total = 0.0;
        for (FiguraGeometrica fig : figuras) {
            total += fig.calculaArea();
        }
        return total;
    }


    public List<FiguraGeometrica> getFiguras() {
        return figuras;
    }


    public void imprimeFiguras() {
        for (FiguraGeometrica fig : figuras) {
            System.out.println(fig.getNomeFigura());
        }
    }



    public double getMaiorAreaDeFigura() {
        if (figuras.isEmpty()) {
            return 0.0;
        }
        double maior = figuras.get(0).calculaArea();
        for (int i = 1; i < figuras.size(); i++) {
            double area = figuras.get(i).calculaArea();
            if (area > maior) {
                maior = area;
            }
        }
        return maior;
    }
}