package org.example;

public class Diretor extends Gerente {
    private Double participacaoLucros;

    public Diretor(String nome, String matricula, Double salarioBase, String dataAdmissao,
                   double valeTransporte, double valeAlimentacao, Integer tamanhoEquipe,
                   Double percentualBonus, Double participacaoLucros) {
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao,
                tamanhoEquipe, percentualBonus);
        this.participacaoLucros = participacaoLucros;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + participacaoLucros;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Participação Lucros: "
                + participacaoLucros;
    }
}
