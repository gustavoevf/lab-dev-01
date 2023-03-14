import java.io.*;
import java.util.*;

public class Curso implements IVincularDesciplina {

	private String nome;
	private int creditos;
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private Collection<Aluno> alunos = new ArrayList<Aluno>();

	
	
	public Curso(String nome) {
		super();
		this.nome = nome;
		this.creditos = 0;
		this.disciplinas = new ArrayList<Disciplina>();
		this.alunos = new ArrayList<Aluno>();
	}
	
	public Curso(String nome, int creditos) {
		super();
		this.nome = nome;
		this.creditos = creditos;
		this.disciplinas = new ArrayList<Disciplina>();
		this.alunos = new ArrayList<Aluno>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinasExistentes) {
		this.disciplinas.addAll(disciplinasExistentes);
	}

	public Collection<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Collection<Aluno> alunos) {
		this.alunos = alunos;
	}

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
