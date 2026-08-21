package org.example;

public class Funcionario {
    private String nome;
    private String matricula;
    private Double salarioBase;
    private String dataAdmissao;

    public Funcionario(String nome,String matricula,Double salarioBase,String dataAdmissao){
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;

    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;
    }
    public double calcularDesconto(){
        return salarioBase * 0.08;
    }

    @Override
    public String toString() { double
            liquido = calcularSalario() - calcularDesconto();
        return String.format( "%s [%s] - Salário: R$ %.2f | Desconto:  R$ %.2f | Líquido: R$ %.2f ", nome, matricula,
        calcularSalario(), calcularDesconto(), liquido );
    }
}