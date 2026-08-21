package org.example;

public class Estagiario extends Funcionario{
    private Integer valorBolsaAuxilio;
    private Integer cargaHorariaSemanal;

    public Estagiario(String nome,String matricula,Double salarioBase,String dataAdmissao, Integer valorBolsaAuxilio,Integer cargaHorariaSemanal){
        super(nome,matricula,salarioBase,dataAdmissao);
        this.valorBolsaAuxilio = valorBolsaAuxilio;
        this.cargaHorariaSemanal = cargaHorariaSemanal;

    }
    @Override
    public double calcularSalario() {
        return valorBolsaAuxilio;
    }
    @Override
    public double calcularDesconto() {
        return 0.0;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Bolsa: "
                + valorBolsaAuxilio
                + " | Carga Horária: "
                        + cargaHorariaSemanal;
    }
}