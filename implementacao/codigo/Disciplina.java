import java.io.*;
import java.util.*;

public class Disciplina {

	private String nome;
	private boolean ativa;
	private String descricao;
	private double cargaHoraria;
	private int ano;
	private Collection<Disciplina> preRequisitos = new ArrayList<Disciplina>();
	private Collection<Aluno> vinculados = new ArrayList<Aluno>();
	
	public Disciplina(String nome) {
		super();
		this.nome = nome;
		this.descricao = "";
		this.cargaHoraria = 40;
		this.ano = 2023;
		this.preRequisitos = new ArrayList<Disciplina>();
		this.vinculados = new ArrayList<Aluno>();
		this.ativa = false;
	}

	public Disciplina(String nome, String descricao, int cargaHoraria, int ano, Collection<Disciplina> preRequisitos,
			Collection<Aluno> vinculados) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.ano = ano;
		this.preRequisitos = preRequisitos;
		this.vinculados = vinculados;
		this.ativa = false;
	}

	public Disciplina(String nome, String descricao, double cargaHoraria, int ano){
		this.nome = nome;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.ano = ano;
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
	
	public void ativarDisciplina() {
		this.ativa = true;
	}
	
	public void desativarDisciplina() {
		this.ativa = false;
	}

	public boolean getStatusAtiva() {
		if(this.vinculados.size() >= 3) {
			this.ativa = true;
		}
		
		return ativa;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getCargaHoraria() {
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

	public Collection<Aluno> getVinculados() {
		return vinculados;
	}

	public void setVinculados(Collection<Aluno> vinculados) {
		this.vinculados = vinculados;
	}

	public void addAluno(Aluno aluno) {
		if(this.vinculados.size() <  60) {
			this.vinculados.add(aluno);
		} else {
			System.out.println("Limite maximo alcançado!");
		}
	}
	
	private void removeAluno(Aluno aluno) {
		this.vinculados.remove(aluno);
	}

	private void addRequisito(Disciplina disciplina) {
		this.preRequisitos.add(disciplina);
	}

	private void removerRequisito(Disciplina disciplina) {
		
	}

}
