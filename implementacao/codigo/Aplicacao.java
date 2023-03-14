import java.io.IOException;

public class Aplicacao {

	public static void main(String[] args) throws IOException {

		Faculdade faculdade = new Faculdade();
		faculdade.imprimirCursos();
		faculdade.imprimirPessoas();
	}

	// Codigo antigo caso precise de algum pedaço

	//
	// /**
	// * @return
	// * @throws IOException
	// */
	// public static ArrayList<Curso> lerArquivoCurso() throws IOException {
	// try {
	// ArrayList<Curso> cursos = new ArrayList<Curso>();
	// BufferedReader buffRead = new BufferedReader(new FileReader("cursos.txt"));
	// String linha = buffRead.readLine();
	//
	// while(linha != null) {
	// String[] partes = linha.split(";");
	// if(partes.length > 0) {
	// String nomeCurso = partes[0];
	// Curso curso = new Curso(nomeCurso);
	// String disciplinas[] = Arrays.copyOfRange(partes, 1, partes.length);
	// for(String disciplina : disciplinas) {
	// curso.setDisciplinas(new Disciplina(disciplina));
	// }
	// cursos.add(curso);
	// }
	// linha = buffRead.readLine();
	// }
	// buffRead.close();
	//
	// return cursos;
	// }catch(IOException ex){
	// ex.printStackTrace();
	// return null;
	// }
	// }

	/**
	 * @param args
	 * @throws IOException
	 */
	// public static void main(String[] args) throws IOException {
	// ArrayList<Curso> cursos = lerArquivoCurso();

	// for(Curso curso : faculdade.cursos) {
	// System.out.println(curso.getNome());
	// ArrayList<Disciplina> disciplinas = curso.getDisciplinas();
	// for(Disciplina disciplina : disciplinas) {
	// System.out.println(" " + disciplina.getNome());
	// }
	// }
	// }
}
