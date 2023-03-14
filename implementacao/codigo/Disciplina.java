import java.io.*;
import java.util.*;

public class Disciplina {

	private String nome;
	private String descricao;
	private int cargaHoraria;
	private int ano;
	private Collection<Disciplina> preRequisitos = new ArrayList<Disciplina>();
	private Collection<Pessoa> vinculados = new ArrayList<Pessoa>();
	
	public Disciplina(String nome) {
		super();
		this.nome = nome;
		this.descricao = "";
		this.cargaHoraria = 40;
		this.ano = 2023;
		this.preRequisitos = new ArrayList<Disciplina>();
		this.vinculados = new ArrayList<Pessoa>();
	}

	public Disciplina(String nome, String descricao, int cargaHoraria, int ano, Collection<Disciplina> preRequisitos,
			Collection<Pessoa> vinculados) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.ano = ano;
		this.preRequisitos = preRequisitos;
		this.vinculados = vinculados;
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Collection<Disciplina> getPreRequisitos() {
		return preRequisitos;
	}

	public void setPreRequisitos(Collection<Disciplina> preRequisitos) {
		this.preRequisitos = preRequisitos;
	}

	public Collection<Pessoa> getVinculados() {
		return vinculados;
	}

	public void setVinculados(Collection<Pessoa> vinculados) {
		this.vinculados = vinculados;
	}

	private void addAluno(Aluno aluno) {
		
	}

	private void addRequisito(Disciplina disciplina) {
		
	}

	private void removerRequisito(Disciplina disciplina) {
		
	}

}
