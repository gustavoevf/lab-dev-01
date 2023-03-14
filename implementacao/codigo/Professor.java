import java.util.*;

public class Professor extends Pessoa implements IVincularDesciplina {

	private Collection<Disciplina> disciplinasAptas = new ArrayList<Disciplina>();
	private Collection<Disciplina> disciplinasLecionadas = new ArrayList<Disciplina>();
	public static final String TIPO_PESSOA = "P";

	public Professor(String nome, String cpf) {
		super(nome, cpf, TIPO_PESSOA);
	}

	private void addDisciplinaApta(Disciplina disciplina) {

		this.disciplinasAptas.add(disciplina);
	}

	private void removerDisciplinaApta(Disciplina disciplina) {

		if (this.disciplinasAptas.contains(disciplina)) {
			this.disciplinasAptas.remove(disciplina);
		}

	}

	@Override
	public boolean addDisciplina(Disciplina disciplina) {

		if (this.disciplinasAptas.contains(disciplina)) {
			this.disciplinasLecionadas.add(disciplina);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean removerDisciplina(Disciplina disciplina) {

		if (this.disciplinasLecionadas.contains(disciplina)) {
			this.disciplinasLecionadas.remove(disciplina);
			return true;
		} else {
			return false;
		}
	}

}
