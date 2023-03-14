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

	private void alterarSenha(String senha) {
		
		//Regra de senha segura será implementada futuramente
		this.senha = senha;
	}

	private void alterarEmail(String novoEmail) {

		//Regra de validação de email será implementada futuramente
		this.email = email;
	}

}
