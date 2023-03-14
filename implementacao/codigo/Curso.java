import java.io.*;
import java.util.*;

public class Curso implements IVincularDesciplina {

	private String nome;
	private int creditos;
	private Collection<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private Collection<Aluno> alunos = new ArrayList<Aluno>();

	public void addAluno(Aluno aluno) {
		
	}

	@Override
	public boolean addDisciplina(Disciplina disciplina) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removerDisciplina(Disciplina disciplina) {
		// TODO Auto-generated method stub
		return false;
	}

}
