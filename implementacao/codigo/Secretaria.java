import java.io.*;
import java.util.*;

public class Secretaria extends Pessoa implements IVincularDesciplina {

	private Usuario usuario;
	private Collection<Disciplina> disciplinasCadastradas = new ArrayList<Disciplina>();
	
	public Secretaria(String nome, String cpf) {
		super(nome, cpf);
		//TODO Auto-generated constructor stub
	}

	private void addUsuario(Usuario usuario) {
		
	}

	private void addPessoa(Pessoa pessoa) {
		
	}

	private void addCurso(Curso curso) {
		
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
