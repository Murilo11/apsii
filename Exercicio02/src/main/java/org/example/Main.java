package org.example;

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Ana Costa", "F001", 2500.0, "01/03/2020");
        FuncionarioCLT func2 = new FuncionarioCLT("Bruno Reis", "C001", 3000.0, "10/06/2021", 220.0, 400.0);
        Gerente func3 = new Gerente("Carla Mendes", "G001", 8000.0, "15/01/2018", 300.0, 500.0, 12, 0.20);
        Estagiario func4 = new Estagiario("Diego Alves", "E001", 0.0, "05/08/2024", 1500, 20);
        Funcionario func5 = new Diretor("Murilo Lopes", "DR001", 10000.0, "14/11/2006", 300.0, 500.0, 12, 0.20, 1000.0);


        System.out.println("Funcionario: \n" + func1);
        System.out.println("Funcionario CLT: \n" + func2);
        System.out.println("Gerente: \n" + func3);
        System.out.println("Estagiario: \n" + func4);
        System.out.println("Diretor: \n" + func5);



    }
}