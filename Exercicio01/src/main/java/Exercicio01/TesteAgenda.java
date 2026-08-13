package Exercicio01;

public class TesteAgenda {
    public static void main(String[] args) {
        MinhaAgendaAniversario agenda = new MinhaAgendaAniversario();


        agenda.adicionarAniversariante("Alice", 15, 6);
        agenda.adicionarAniversariante("Bob", 15, 6);
        agenda.adicionarAniversariante("Charlie", 20, 7);


        System.out.println("Aniversariantes do dia 15/6: " + agenda.obterAniversariantesDoDia(15, 6));


        agenda.removerAniversariante("Alice");


        System.out.println("Aniversariantes do dia 15/6 após remoção: " + agenda.obterAniversariantesDoDia(15, 6));
    }
}