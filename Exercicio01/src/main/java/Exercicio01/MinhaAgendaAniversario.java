package Exercicio01;
import java.util.ArrayList;

public class MinhaAgendaAniversario implements AgendaDeAniversarios {

    private ArrayList<Aniversariante> aniversariantes;

    public MinhaAgendaAniversario() {
        this.aniversariantes = new ArrayList<>();
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        Aniversariante aniversariante = new Aniversariante(nome, dia, mes);
        aniversariantes.add(aniversariante);
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> aniversariantesDoDia = new ArrayList<>();
        for (Aniversariante aniversariante : aniversariantes) {
            DataAniversario data = aniversariante.getDataAniversario();
            if (data.equals(new DataAniversario(dia, mes))) {
                aniversariantesDoDia.add(aniversariante.getNome());
            }
        }
        return aniversariantesDoDia;
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
        for (int i = aniversariantes.size() - 1; i >= 0; i--) {
            if (aniversariantes.get(i).getNome().equals(nomeAniversariante)) {
                aniversariantes.remove(i);
            }
        }
    }
}
