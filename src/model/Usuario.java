package model;

<<<<<<< HEAD
import java.util.Date;

public final class Usuario extends Pessoa{
	
	private String senha;
	private String data_cadastro;
	private boolean habilitado;

	
	public String getData_cadastro() {
		
		return data_cadastro;
	}
	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	
	
=======
import java.sql.Date;

final class Usuario   extends Pessoa{
	
	private int id;
	private String nome;
	private String sobrenome;
	private String senha;
	private Date data_cadastro;
	private boolean habalitado;
	


>>>>>>> 2e87b6bbd387d8ba09749d839e57e3174e815ec4
}
