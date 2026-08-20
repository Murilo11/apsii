package org.example;

public class Funcionario {
    private String nome;
    private String matricula;
    private Double salarioBase;
    private String dataAdimissao;

    public Funcionario(String nome,String matricula,Double salarioBase,String dataAdimissao){
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
        this.dataAdimissao = dataAdimissao;

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
        return salarioBase = 0.8;
    }

    @Override
    public String toString() { double
            liquido = calcularSalario() - calcularDesconto();
        return String.format( "%s [%s] - Salário: R$ %.2f | Desconto:  R$ %.2f | Líquido: R$ %.2f", nome, matricula,
        calcularSalario(), calcularDesconto(), liquido );
    }
}