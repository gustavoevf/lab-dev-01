public abstract class Pessoa {

	protected String tipoPessoa;
	protected String matricula;
	protected String nome;
	protected Usuario usuario;

	public Pessoa(String nome, String cpf, String tipoPessoa) {
		this.nome = nome;
		this.matricula = cpf;
		this.tipoPessoa = tipoPessoa;
		this.usuario = new Usuario(cpf);
	}

	@Override
	public String toString() {
		StringBuilder pessoa = new StringBuilder("");
		pessoa.append(this.nome + ";" + this.matricula);
		return pessoa.toString();
	}

}
