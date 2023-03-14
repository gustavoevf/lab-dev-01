import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Faculdade {

	static protected Set<Curso> cursos = new LinkedHashSet<Curso>();
	static protected Set<Disciplina> disciplinas = new LinkedHashSet<Disciplina>();
	static protected Set<Pessoa> pessoas = new LinkedHashSet<Pessoa>();

	public Faculdade() {
		carregarDisciplinasArquivo();
		carregarCursosArquivo();
		carregarPessoasArquivo();
	}

	public void carregarDisciplinasArquivo() {
		Scanner entrada;
		Disciplina novadisciplina = null;
		String linhaLida;
		String[] disciplinaLida;

		try {
			entrada = new Scanner(new FileReader(
					"disciplinas.txt"));
			while (entrada.hasNextLine()) {
				linhaLida = entrada.nextLine();
				disciplinaLida = linhaLida.split(";");
				novadisciplina = new Disciplina(disciplinaLida[0],
						"",
						2,
						2);
				disciplinas.add(novadisciplina);
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void carregarCursosArquivo() {
		try {
			BufferedReader buffRead = new BufferedReader(new FileReader(
					"cursos.txt"));
			String linha = buffRead.readLine();
			List<Disciplina> disciplinasExistentes;

			while (linha != null) {
				String[] partes = linha.split(";");
				if (partes.length > 0) {
					String nomeCurso = partes[0];
					Curso curso = new Curso(nomeCurso);
					String discipl[] = Arrays.copyOfRange(partes, 1, partes.length);

					for (String d : discipl) {

						disciplinasExistentes = disciplinas.stream()
								.filter(disciplinas -> disciplinas.getNome().contains(d))
								.collect(Collectors.toList());

						curso.setDisciplinas(disciplinasExistentes);
					}
					cursos.add(curso);
				}
				linha = buffRead.readLine();
			}
			buffRead.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public void carregarPessoasArquivo() {
		Scanner entrada;
		Pessoa novaPessoa = null;
		String linhaLida;
		String[] PessoaLida;
		try {
			entrada = new Scanner(new FileReader(
					"pessoas.txt"));
			while (entrada.hasNextLine()) {
				linhaLida = entrada.nextLine();
				PessoaLida = linhaLida.split(";");
				switch (PessoaLida[0]) {
					case ("A"):
						novaPessoa = new Aluno(PessoaLida[1], PessoaLida[2]);
						break;
					case ("P"):
						novaPessoa = new Professor(PessoaLida[1], PessoaLida[2]);
						break;
					case ("S"):
						novaPessoa = new Secretaria(PessoaLida[1], PessoaLida[2]);
						break;
				}
				pessoas.add(novaPessoa);
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void imprimirAlunosMatriculados() {

		ArrayList<Disciplina> disciplina = (ArrayList<Disciplina>) cursos.stream()
				.flatMap(d -> d.getDisciplinas().stream()).collect(Collectors.toList());
		disciplina.stream().forEach(a -> System.out
				.println("\n DISCIPLINA : " + a.getNome() + " QUANTIDADE DE ALUNOS: " + a.getVinculados().size()));

	}

	public void imprimirCursos() {

		System.out.println("\n\nCURSOS E DISCIPLINAS CADASTRADAS : \n");

		for (Curso curso : cursos) {
			System.out.println("\n" + curso.getNome() + "\n");
			ArrayList<Disciplina> discipl = curso.getDisciplinas();
			for (Disciplina disciplina : discipl) {
				System.out.println("   " + disciplina.getNome());
			}
		}
	}

	public void imprimirPessoas() {

		System.out.println("\n\nPESSOAS CADASTRADAS NO SISTEMA : \n");

		for (Pessoa pessoa : pessoas) {
			if (pessoa instanceof Aluno) {
				System.out.println("ALUNO  --> " + pessoa.nome);
			} else if (pessoa instanceof Professor) {
				System.out.println("PROFESSOR  --> " + pessoa.nome);
			} else if (pessoa instanceof Secretaria) {
				System.out.println("SECRETARIA  --> " + pessoa.nome);
			}
		}
	}

}
