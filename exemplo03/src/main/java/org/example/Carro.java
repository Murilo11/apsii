package org.example;

public class Carro extends Veiculo {
    public int numPortas;
    public Carro(String modelo, int ano, int numPortas){
        super(modelo, ano);
        this.numPortas = numPortas;
    }

    @Override
    public String imprimirDetalhes() {
        return super.imprimirDetalhes() + "\nNumero Portas: " + this.numPortas;
    }
}
