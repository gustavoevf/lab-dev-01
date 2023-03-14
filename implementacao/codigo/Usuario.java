import java.io.*;
import java.util.*;

public class Usuario {

	private String usuario;
	private String senha;
	private String email;


	public Usuario(String usuario){
		this.usuario = usuario;
		this.senha = "12345";
	}
	

	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public boolean verificarSenha(String senha) {
		if(this.senha.compareTo(senha) == 0) {
			return true;
		}
		return false;
	}

	private void alterarSenha(String senha) {
		
		//Regra de senha segura será implementada futuramente
		this.senha = senha;
	}

	private void alterarEmail(String novoEmail) {

		//Regra de validação de email será implementada futuramente
		this.email = email;
	}

}
