package org.example;

public class Gerente extends FuncionarioCLT{
    private Integer tamanhoEquipe;
    private Double percentualBonus;


    public Gerente(String nome,String matricula,Double salarioBase,String dataAdmissao,double valeTransporte, double valeAlimentacao,Integer tamanhoEquipe,Double percentualBonus){
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
        this.tamanhoEquipe = tamanhoEquipe;
        this.percentualBonus = percentualBonus;

    }


    @Override
    public double calcularSalario(){
        return super.calcularSalario() + getSalarioBase() * percentualBonus;
    }

    @Override
    public double calcularDesconto(){
        if (tamanhoEquipe > 10){
            return super.calcularDesconto()  + 100.0;
        }else {
            return super.calcularDesconto();
        }

    }





}