import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Faculdade {

    static protected Set<Curso> cursos = new LinkedHashSet<Curso>();
	static protected Set<Pessoa> pessoas = new LinkedHashSet<Pessoa>();
    

    public Faculdade(){
        
    }

    public void carregarCursosArquivo() {
		try {
			BufferedReader buffRead = new BufferedReader(new FileReader("cursos.txt"));
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
            entrada = new Scanner(new FileReader("pessoa.txt"));
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
}
