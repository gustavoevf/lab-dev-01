public abstract class Pessoa {

	protected String matricula;
	protected String nome;
	protected Usuario usuario;

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.matricula = cpf;
		this.usuario = new Usuario(cpf);
	}

	@Override
	public String toString() {
		StringBuilder pessoa = new StringBuilder("");
		pessoa.append(this.nome + ";" + this.matricula);
		return pessoa.toString();
	}

}
