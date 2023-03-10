import java.util.*;

public class Aluno extends Pessoa implements IVincularDesciplina {

	private Collection<Disciplina> disciplinasRealizadas = new ArrayList<Disciplina>();
	public static final String TIPO_PESSOA = "A";
	
	public Aluno(String nome, String cpf) {
		super(nome, cpf, TIPO_PESSOA);
	}

	@Override
	public boolean addDisciplina(Disciplina disciplina) {

		if (this.disciplinasRealizadas.size() <= 4) {
			this.disciplinasRealizadas.add(disciplina);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean removerDisciplina(Disciplina disciplina) {

		if (this.disciplinasRealizadas.contains(disciplina)) {
			this.disciplinasRealizadas.remove(disciplina);
			return true;
		} else {
			return false;
		}
	}
}
