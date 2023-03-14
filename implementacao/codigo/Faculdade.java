import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Faculdade {

    static protected Set<Curso> cursos = new LinkedHashSet<Curso>();
	static protected Set<Pessoa> pessoas = new LinkedHashSet<Pessoa>();
    

    public Faculdade(){
    	carregarCursosArquivo();
    	carregarPessoasArquivo();        
    }

    public void carregarCursosArquivo() {
		try {
			BufferedReader buffRead = new BufferedReader(new FileReader("/media/juvito/Data/Meu_Repositorio/GIT_LAB-DEV/lab-dev-01/implementacao/codigo/cursos.txt"));
			String linha = buffRead.readLine();
			
			while(linha != null) {
				String[] partes = linha.split(";");
				if(partes.length > 0) {
					String nomeCurso = partes[0];
					Curso curso = new Curso(nomeCurso);
					String disciplinas[] = Arrays.copyOfRange(partes, 1, partes.length);
					for(String disciplina : disciplinas) {
						curso.setDisciplinas(new Disciplina(disciplina));
					}
					cursos.add(curso);
				}
				linha = buffRead.readLine();
			}
			buffRead.close();
			
		}catch(IOException ex){
			ex.printStackTrace();  
		}
    }


	public void carregarPessoasArquivo() {
        Scanner entrada;
        Pessoa novaPessoa = null;
        String linhaLida;
        String[] PessoaLida;
        try {
            entrada = new Scanner(new FileReader("/media/juvito/Data/Meu_Repositorio/GIT_LAB-DEV/lab-dev-01/implementacao/codigo/pessoas.txt"));
            while (entrada.hasNextLine()) {
                linhaLida = entrada.nextLine();
                PessoaLida = linhaLida.split(";");
                switch (PessoaLida[0]) {
                    case ("A"): novaPessoa = new Aluno(PessoaLida[1],PessoaLida[2]);break;
                    case ("P"): novaPessoa = new Professor(PessoaLida[1],PessoaLida[2]);break;
                    case ("S"): novaPessoa = new Secretaria(PessoaLida[1],PessoaLida[2]);break;
                    }
                pessoas.add(novaPessoa);
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
	
	
	public void imprimirAlunosMatriculados() {
				
		ArrayList<Disciplina> disciplina = (ArrayList<Disciplina>) cursos.stream().flatMap(d-> d.getDisciplinas().stream()).collect(Collectors.toList()); 
		disciplina.stream().forEach(a -> System.out.println("\n DISCIPLINA : " + a.getNome() + " QUANTIDADE DE ALUNOS: " + a.getVinculados().size()));
	
	}
	
	public void imprimirCursos() {

		System.out.println("\n\nCURSOS E DISCIPLINAS CADASTRADAS : \n");
		
		for(Curso curso : cursos) {
			System.out.println("\n" + curso.getNome() + "\n");
			ArrayList<Disciplina> disciplinas = curso.getDisciplinas();
			for(Disciplina disciplina : disciplinas) {
				System.out.println("   " + disciplina.getNome());
			}
		}
	}

	public void imprimirPessoas() {
		
		System.out.println("\n\nPESSOAS CADASTRADAS NO SISTEMA : \n");

		for(Pessoa pessoa: pessoas) {
			if(pessoa instanceof Aluno){
				System.out.println("ALUNO  --> " + pessoa.nome);
			}	
			else if (pessoa instanceof Professor) {
				System.out.println("PROFESSOR  --> " + pessoa.nome);
			}
			else if (pessoa instanceof Secretaria) {
				System.out.println("SECRETARIA  --> " + pessoa.nome);
			}
		}
	}
	
}
