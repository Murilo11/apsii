package org.example;

public class CD extends Produto{
    public Integer numFaixas;

    public CD(String nome, double preco,Integer numFaixas) {
        super(nome, preco);
        this.numFaixas = numFaixas;
    }


    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }


}
