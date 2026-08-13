package Exercicio01;

public class Aniversariante {
	private String nome;
	private DataAniversario dataAniversario;

	//gets e sets...


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DataAniversario getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(DataAniversario dataAniversario) {
		this.dataAniversario = dataAniversario;
	}


	public boolean equals(Aniversariante aniversariante) {
		if (this == aniversariante){
			return true;
		}
		if (aniversariante == null || getClass() !=  aniversariante.getClass()){
			return false;
		}

		Aniversariante outro = (Aniversariante) aniversariante;

		return nome.equals(outro.nome) && dataAniversario.equals(outro.dataAniversario);
	}
}
