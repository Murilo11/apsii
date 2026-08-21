package org.example;

public class FuncionarioCLT extends Funcionario {
    private Double valeTransporte;
    private Double valeAlimentacao;

    public FuncionarioCLT(String nome,String matricula,Double salarioBase,String dataAdmissao,Double valeTransporte, Double valeAlimentacao){
        super(nome,matricula,salarioBase,dataAdmissao);
        this.valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;

    }


     @Override
    public double calcularSalario(){
        double salarioFunc = super.calcularSalario();
        return  salarioFunc + valeTransporte + valeAlimentacao;
    }

    @Override
    public double calcularDesconto(){
        double descontoFunc = super.calcularDesconto();
        return descontoFunc + 50;
    }
    @Override
    public String toString() {
        return super.toString()
                + " | VT: "
                + valeTransporte
                + " | VA: "
                + valeAlimentacao;
    }
}



