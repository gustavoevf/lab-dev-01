import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Secretaria extends Pessoa implements IVincularDesciplina {

	private Collection<Disciplina> disciplinasCadastradas = new ArrayList<Disciplina>();

	public Secretaria(String nome, String cpf) {
		super(nome, cpf);
	}

	public void cadastrarPessoa(String nome, String cpf, String tipo) {

		File arquivo = new File(
				"/media/juvito/Data/Meu_Repositorio/GIT_LAB-DEV/lab-dev-01/implementacao/codigo/pessoas.txt");
		Pessoa novaPessoa;
		String sigla = "";

		switch (tipo) {
			case ("A"):
				novaPessoa = new Aluno(nome, cpf);
				sigla = "A;" + novaPessoa.toString();
				break;
			case ("P"):
				novaPessoa = new Professor(nome, cpf);
				sigla = "P;" + novaPessoa.toString();
				break;
			case ("S"):
				novaPessoa = new Secretaria(nome, cpf);
				sigla = "S;" + novaPessoa.toString();
				;
				break;
		}
		try {
			FileWriter arqEscrita = new FileWriter(arquivo, true);
			BufferedWriter escritor = new BufferedWriter(arqEscrita);

			escritor.write(sigla);
			escritor.newLine();

			escritor.close();
			arqEscrita.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	protected void cadastrarCurso(String nome) {

		File arquivo = new File(
				"/media/juvito/Data/Meu_Repositorio/GIT_LAB-DEV/lab-dev-01/implementacao/codigo/cursos.txt");

		Curso novoCurso = new Curso(nome);

		try {
			FileWriter arqEscrita = new FileWriter(arquivo, true);
			BufferedWriter escritor = new BufferedWriter(arqEscrita);

			escritor.write(novoCurso.getNome());
			escritor.newLine();

			escritor.close();
			arqEscrita.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public boolean addDisciplina(Disciplina disciplina) {

		return false;
	}

	@Override
	public boolean removerDisciplina(Disciplina disciplina) {

		return false;
	}

}
