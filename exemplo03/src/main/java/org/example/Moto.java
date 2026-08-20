package org.example;

public class Moto extends Veiculo {
    public int cilindradas;
    public Moto(String modelo, int cilindradas, int ano){
        super(modelo,ano);
        this.cilindradas = cilindradas;

    }

    @Override
    public String imprimirDetalhes() {
        return super.imprimirDetalhes() + "\nCilindradas: " + this.cilindradas;
    }
}
