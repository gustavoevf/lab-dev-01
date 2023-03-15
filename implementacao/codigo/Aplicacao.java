import java.io.IOException;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException {

		Faculdade faculdade = new Faculdade();
		faculdade.imprimirCursos();
		faculdade.imprimirPessoas();
		
		Boolean logado = false;
		Pessoa pessoaLogada = null; 
		
		while(!logado) {
			Scanner in = new Scanner(System.in);
			
			System.out.println("Digite o seu cpf");
			String cpf = in.nextLine();
			System.out.println(cpf);
			
			pessoaLogada = faculdade.obterPessoa(cpf);
			
			System.out.println("Digite o sua senha");
			String senha = in.nextLine();
			
			logado = pessoaLogada.usuario.verificarSenha(senha);
			logado = pessoaLogada.tipoPessoa == "S";
			
			if(!logado) {
				System.out.println("Senha e/ou usuario invalidos, tente novamente.");
			}
		}
		
		System.out.println("Ola" + pessoaLogada.nome + "\n");
		System.out.println("Selecione o que deseja fazer: \n");
		System.out.println("1 - Cadastrar pessoa \n");	
		System.out.println("2 - Cadastrar curso \n");	
		// Secretaria sec = new Secretaria("Admin", "xxxxxxx");
		// sec.cadastrarPessoa("TESTE INCLUSÃO 1", "342342432", "A");
		// sec.cadastrarPessoa("TESTE INCLUSÃO 2", "342342432", "P");
		// sec.cadastrarPessoa("TESTE INCLUSÃO 3", "342342432", "A");
		// sec.cadastrarCurso("TESTE INCLUSÃO 1");
		// sec.cadastrarCurso("TESTE INCLUSÃO 2");
		// sec.cadastrarCurso("TESTE INCLUSÃO 3");

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
