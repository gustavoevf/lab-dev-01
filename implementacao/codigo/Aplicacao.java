import java.io.IOException;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		Faculdade faculdade = new Faculdade();
		faculdade.imprimirCursos();
		faculdade.imprimirPessoas();
		
		Boolean logado = false;
		Pessoa pessoaLogada = null; 
		
		while(!logado) {	
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
		
		System.out.println("Ola " + pessoaLogada.nome + "\n");
		System.out.println("Selecione o que deseja fazer: \n");
		System.out.println("1 - Cadastrar pessoa \n");
		System.out.println("2 - Cadastrar curso \n");
		
		String opcao = in.nextLine();
		Secretaria secretaria = faculdade.obterSecretaria(pessoaLogada.matricula);
		
		switch(opcao) {
			case("1"):
				System.out.println("Digite o nome da pessoa: \n");
				String nomePessoa = in.nextLine();
				System.out.println("Digite o CPF da pessoa: \n");
				String cpf = in.nextLine();
				System.out.println("Digite o tipo (P)essoa, (S)ecretaria ou (A)luno: \n");
				String tipo = in.nextLine();
				secretaria.cadastrarPessoa(nomePessoa, cpf, tipo);
			case("2"):
				System.out.println("Digite o nome do curso: \n");
				String nomeCurso = in.nextLine();
				secretaria.cadastrarCurso(nomeCurso);
		}
		
	}
}
