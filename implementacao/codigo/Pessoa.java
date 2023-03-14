import java.io.*;
import java.lang.reflect.Constructor;
import java.util.*;

public abstract class Pessoa {

	protected String matricula;
	protected String nome;
	protected Usuario usuario;

	public Pessoa(String nome, String cpf){

		this.nome = nome;
		this.matricula = cpf;
		this.usuario = new Usuario(cpf);
	}

}
